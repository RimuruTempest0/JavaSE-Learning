import java.util.ArrayList;

public class MyArrayList自定义类 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student st1 = new Student("Able", 21);
        Student st2 = new Student("Bob",22);
        Student st3 = new Student("Charlie",23);
        Student st4 = new Student("Elbert",25);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        for(int x=0; x<list.size(); x++){
            Student stu = list.get(x);
            System.out.println(stu.getName()+", "+stu.getAge());
        }
    }
}
