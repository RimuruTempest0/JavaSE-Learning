package 练习;

//当前案例中，实例化Person类的对象没有意义
//所以定义为抽象的：阻止外界直接创建人的对象 (利用抽象类无法被实例化的特性)
public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
