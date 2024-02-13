package Wrapper_Class;

public class IntegerDemo2_Boxing {
    public static void main(String[] args) {
        //包装类如何计算
        /*
        JDK5之前：
            1,对象拆箱，编程基本数据类型
            2，相加
            3，结果装箱
        */
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        int result = i1.intValue() + i2.intValue();
        Integer i3 = new Integer(result);

        /*
        JDK5之后：
            自动装箱和自动拆箱
        */
        //底层，还是会自动调用静态方法valueOf得到Integer对象，
        Integer i = 10;

    }
}
