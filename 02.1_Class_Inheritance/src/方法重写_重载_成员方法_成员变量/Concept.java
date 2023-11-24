package 方法重写_重载_成员方法_成员变量;

//子类能继承父类哪些内容
//构造方法  非私有（不能） private（不能）
//成员方法  非私有{能: 虚方法表(非private; 非static; 非final) 虚方法表会继承给子类} private（不能）
//成员变量  非私有（能） private（能）

//就近原则调用
//this关键字：调用本类
//super关键字：调用父类

//protected: 同一个包的类可以是调用，不同包的，通过继承可以使用
public class Concept {
    public static void main(String[] args) {
        OverseaStudent s = new OverseaStudent();
        s.lunch();
    }
}

class Person{
    public void eat(){
        System.out.println("吃米饭，吃菜");
    }
    public void drink(){
        System.out.println("喝开水");
    }
}
//方法重写：当父类的方法不能满足子类的需求是，需要进行方法重写
//书写格式：在继承体系中，子类出现了和父类中一模一样的方法声明，那么子类的这个方法就是override method
//@Override： 注解，检验重写语法是否正确
//本质：覆盖从父类继承下来的虚方法表里方法，也就是，
//注意：
//  1,重写方法的名称，形参列表 必须与父类中的一致
//  2,子类重写父类方法时，访问权限子类 必须 大于等于父类
//  3,子类重写父类方法时，返回值类型子类 必须 小于等于父类
//  4,只有被添加到虚方法表中的方法才能被重写：https://www.bilibili.com/video/BV17F411T7Ao?t=1891.4&p=127
//  5,重写的方法尽量和父类保持一致

//方法重载：同一个类，方法名相同，参数不同的方法，与返回值无关
//  参数不同：个数不同，类型不同，顺序不同
class OverseaStudent extends Person{
    public void lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }
    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }
    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
}
class Student extends Person{
    public void lunch(){
        eat();
        drink();
    }
}
