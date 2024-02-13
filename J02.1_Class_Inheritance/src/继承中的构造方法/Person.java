package 继承中的构造方法;

//父类的构造方法不会被子类继承
//子类中所有的构造方法，默认先访问父类中的无参构造，再执行自己

//子类构造方法第一行默认语句都是：super(),不写也存在，且必须在第一行
//如果想调用父类的有参构造，必须手动写super()进行调用
public class Person {
    protected String name;
    protected int age;

    public Person(){
        System.out.println("父类无参构造函数调用");
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s = new Student("张三",23);
        System.out.println(s.name + " " + s.age);
    }
}

class Student extends Person{
    public Student(){
        super();
        System.out.println("子类的无参构造函数调用");
    }

    public Student(String name, int age){
        super(name, age);
    }
}