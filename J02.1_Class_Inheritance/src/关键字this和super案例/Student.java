package 关键字this和super案例;

public class Student {
    private String name;
    private static int DEFAULT_AGE = 21; //方便在没有创建对象的情况下进行调用, 只占用一块内存，节省内存
    private int age;
    String school;

    public Student() {
        //调用本类其它构造方法
        //JVM不会再添加super();
        this(null,DEFAULT_AGE,"xx大学");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
