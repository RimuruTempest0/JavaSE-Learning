package 抽象类和方法基础;

public class Test {

    public static void main(String[] args) {
        Student s = new Student("张三",23);
        System.out.println(s.getName()+", "+ s.getAge());
        s.work();
    }
}
