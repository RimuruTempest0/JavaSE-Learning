package 接口中default方法;

public class Test implements Inter{
    @Override
    public void method(){
        System.out.println("实现类重写抽象方法");
    }

    @Override
    public void show() {
        System.out.println("重写接口默认方法");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.method();
        t1.show();
    }
}
