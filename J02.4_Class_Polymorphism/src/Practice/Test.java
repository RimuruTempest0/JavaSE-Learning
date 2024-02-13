package Practice;

public class Test {
    public static void main(String[] args) {
        Person a = new Person("James",30);
        Person b = new Person("Lee",25);
        Dog dog = new Dog(2,"Black");
        Cat cat = new Cat(3,"Grey");

        a.keepPet(dog,"Bone");
        b.keepPet(cat,"Fish");

    }


}
