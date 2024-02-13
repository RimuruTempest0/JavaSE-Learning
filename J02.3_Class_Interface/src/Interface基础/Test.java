package Interface基础;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙",1);
        f.eat();
        f.swim();

        Dog d = new Dog("狗",2);
        d.eat();
        d.swim();
    }
}
