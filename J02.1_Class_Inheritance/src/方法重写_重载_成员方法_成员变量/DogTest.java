package 方法重写_重载_成员方法_成员变量;

public class DogTest {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();

        Shapay s = new Shapay();
        s.eat();

        chineseDog c = new chineseDog();
        c.eat();
    }
}
class Dog{
    public void drink(){
        System.out.println("狗喝水");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
    public void eat(){
        System.out.println("狗在吃狗粮");
    }
}

class Husky extends Dog{
    public void breakHome(){
        System.out.println("哈士奇在拆家");
    }

}

class Shapay extends Dog{
    @Override
    public void eat(){
        super.eat();
        System.out.println("沙皮狗在吃骨头");
    }
}

class chineseDog extends Dog{
    @Override
    public void eat(){
        System.out.println("田园犬在吃剩饭");
    }
}
