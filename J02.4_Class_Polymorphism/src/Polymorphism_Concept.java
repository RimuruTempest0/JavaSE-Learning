public class Polymorphism_Concept {
    /*
      理解：
    * Animal a = new Dog();
    * 成员变量：什么类型(Animal)就调用什么的变量
    * 成员方法：如果子类对方法进行了重写，那么在虚方法表中是会把父类的方法进行覆盖的。
    * 调用成员变量：
    *   编译看左边：javac编译时，会看左边的父类中有没有这个 变量，有->编译成功，无->编译失败
    *   运行也看左边：java运行时，实际获取的是父类中成员变量的值
    * 调用成员方法：
    *   编译看左边：javac编译时，会看左边的父类中有没有这个 方法，有->编译成功，无->编译失败
    *   运行看右边：java运行代码的时候，实际上运行的是子类中的方法。
    * */

    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();

//        Dog d = (Dog)a;
//        d.lookhome();

        //新特性: 先判断a是否是Dog类型，如果是，则(把d)强制转为Dog类型并名为d;
        if(a instanceof Dog d){
            d.lookhome();
        }
    }
}

class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    public void lookhome(){
        System.out.println("Dog watching home");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }

    public void catchmouse(){
        System.out.println("Cat catching mouse");
    }
}
