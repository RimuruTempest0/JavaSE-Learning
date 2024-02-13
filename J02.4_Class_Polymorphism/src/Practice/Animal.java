package Practice;

public abstract class Animal {
    private int age;
    private String color;

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat(String something);
}

class Cat extends Animal{
    public Cat(int age, String color){
        super(age,color);
    }

    @Override
    public void eat(String something){
        System.out.println("Cat eating " + something);
    }

    public void catchMouse(){
        System.out.println("Cat catching mouse ");
    }
}

class Dog extends Animal{
    public Dog(int age, String color){
        super(age,color);
    }

    @Override
    public void eat(String something){
        System.out.println("Dog eating " + something);
    }

    public void watchHome(){
        System.out.println("Dog watching home ");
    }
}

class Person{
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

    public void keepPet(Animal animal, String something){
        if(animal instanceof Dog dog){
            System.out.printf("年龄为%d岁的%s养了一只%s的%d岁的狗 %n",this.age,this.name,dog.getColor(),dog.getAge());
            dog.eat(something);
        } else if(animal instanceof Cat cat) {
            System.out.printf("年龄为%d岁的%s养了一只%s的%d岁的猫，猫在吃 %n",this.age,this.name,cat.getColor(),cat.getAge());
            cat.eat(something);
        }
    }
}
