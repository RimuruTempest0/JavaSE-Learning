package 接口和接口之间的关系;

public class InterImpl implements Inter3{
    //细节：如果实现类实现了最下面的子接口，那么就需要重写所有的抽象方法
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}
