package Object.CloneDemo;

import java.util.Arrays;
import java.util.StringJoiner;
//Cloneable
//如果一个接口里面没有抽象方法
//表示当前的接口是一个 标记性 接口
//现在Cloneable表示一旦实现了，那么当前类的对象就可被克隆，反之则不能
public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", path='" + path + '\'' +
                ", data=" + arrToString() +
                '}';
    }

    public String arrToString(){
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for(int i = 0; i < data.length; i++){
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法
        //相当于让Java帮我们克隆一个对象，并把克隆之后的对象返回。

        //1，深拷贝
        //先把被克隆对象中的数组获取出来
        int[] data = this.data;
        //创建新的数组
        int[] newData = new int[data.length];
        //拷贝数组中的数据
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        //调用父类中的方法克隆对象
        User u = (User) super.clone();
        //因为父类中的克隆方法是浅克隆，替换克隆出来对象中的数组地址值
        u.data = newData;
        return u;

        //2，浅拷贝只需要一下一行
        //return super.clone();
    }
}
