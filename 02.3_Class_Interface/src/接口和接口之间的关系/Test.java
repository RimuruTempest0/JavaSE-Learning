package 接口和接口之间的关系;

public class Test {
    public static void main(String[] args) {
        //接口和接口之间是 继承关系，可以单继承，也可以多继承
        //细节：如果实现类实现了最下面的子接口，那么就需要重写所有的抽象方法 （看Interlmpl）
        //本案例中：Inter3从Inter1，Inter2中继承，所以当实现Inter3时，需要将所有Inter3本身的和Inter3所继承的抽象方法：全部重写

    }
}
