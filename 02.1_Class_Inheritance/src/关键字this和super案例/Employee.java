package 关键字this和super案例;

public class Employee {
    protected int ID;
    protected String name;
    protected int salary;



    public Employee() {
    }

    public Employee(int ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("人在工作");
    }

    public void eat(){
        System.out.println("吃米饭");
    }

    public static void main(String[] args) {
        Manager m = new Manager(310,"张经理",5000,200);
        m.eat();
        m.work();
        System.out.println(m.ID + " " + m.name + " " + m.salary + " " + m.getBonus());

        System.out.println("--------------------");
        Cooker s = new Cooker();
        s.setID(111);
        s.setName("王厨师");
        s.setSalary(3000);
        s.eat();
        s.work();
        System.out.println(s.getID() + " " + s.getName() + " " + s.getSalary());

    }
}

class Manager extends Employee{
    private double bonus;
    public Manager(){

    }

    public Manager(int ID, String name, int salary, double bonus) {
        super(ID, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work(){
        System.out.println("管理其他人");
    }
}

class Cooker extends Employee{

    public Cooker() {
    }

    public Cooker(int ID, String name, int salary) {
        super(ID, name, salary);
    }

    @Override
    public void work(){
        System.out.println("厨师在做饭");
    }
}
