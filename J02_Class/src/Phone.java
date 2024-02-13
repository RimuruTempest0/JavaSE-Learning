
public class Phone {
    //前言：

    /*标准JavaBean类：
        1，类名需要见名知意
        2，成员变量使用private修饰
        3，提供至少两个构造方法
            a,无参构造
            b,带全部参数的构造
        4，成员方法
            a,提供每一个成员变量对象的set()和get()
            b,其他行为
        5，生成构造方法快捷键
            alt + insert
            alt + fn + insert
        6，static关键字：只对本类作用，意思就是，被该类所有对象共享。
            调用方式:
                类名调用：Phone.静态变量 或者 Phone.静态方法
                对象名调用

     */
    private String brand;
    private double price;

    //想要修改访问私有成员变量，只能通过成员方法来完成
    //成员变量: 类中方法外
    //局部变量: 方法内
    public void setBrand(String brand){
        //如不加this关键字，java会根据就近原则，选择最近的变量运行
        //this关键字：指只用当前(this)作用域下的成员变量
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    //构造方法：
    //1，方法名与类名完全相同。
    //2，无返回值类型，无void
    //3，无return
    public Phone(){
        //空参构造成员变量都是初始化值
        //1，创建对象时由虚拟机调用，不能手动调用
        //2，每创建一次对象，就调用一次构造方法
        System.out.println("看看我执行了吗？");

    }

    public Phone(String brand, double price){
        this.brand = brand;
        this.price = price;
        System.out.println("看看有参构造执行了吗？");
    }


    public static void main(String[] args){
        Phone p = new Phone();
        p.setBrand("小米");
        String pBrand = p.getBrand();
        System.out.println(pBrand);

        Phone p2 = new Phone("华为",4999.99);

    }

}