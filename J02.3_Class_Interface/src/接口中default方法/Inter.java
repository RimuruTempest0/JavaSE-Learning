package 接口中default方法;

public interface Inter {
     /*接口中默认方法的定义格式：
        public default 返回类型 方法名(形参) {   }

      接口中默认方法的注意事项：
        1，默认方法不是抽象方法，所以不强制被重写。如果要重写，去掉default关键字
        2，public可以省略，default不可省略
        3，如果实现了多个接口，多个接口中存在的相同的名字的默认方法，子类就必须对该方法进行重写
    */

    //灰色的public 和 abstract可以省略，default不可以省略
    public abstract void method();
    public default void show(){
        System.out.println("接口中的默认方法---show");
    }
}
