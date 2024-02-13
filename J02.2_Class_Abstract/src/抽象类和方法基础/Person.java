package 抽象类和方法基础;

public abstract class Person {
    //抽象类的本质：为了强制子类按照父类格式重写 无法满足子类需求 的方法，会增加代码的统一性

    //抽象类不能实例化
    //抽象类中不一定有抽象方法，但有抽象方法的类一定是抽象类
    //抽象类可以有构造方法
    //抽象类的子类：
    //    1，要么重写抽象类中的 所有 抽象方法
    //    2，要么是抽象类
    private String name;
    private int age;
    public Person(){}

    //作用：当创建子类对象时，给属性进行赋值
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

    public abstract void work();

}
