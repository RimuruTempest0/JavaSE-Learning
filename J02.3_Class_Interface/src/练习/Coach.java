package 练习;

public abstract class Coach extends Person{
    public Coach(String name, int age){
        super(name,age);
    }
    public abstract void teach();
}
