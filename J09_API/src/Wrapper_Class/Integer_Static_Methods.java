package Wrapper_Class;

public class Integer_Static_Methods {
    public static void main(String[] args) {
        /*
            public static String toBinaryString(int i)      得到二进制
            public static String toOctalString(int i)       得到八进制
            public static String toHexString(int i)         得到十六进制

            细节：
                8种包装类中，除了Character都有对应的parseXxx的方法
            public static int parseInt(String s)            将字符串类型的整数转成int类型的整数
            键盘录入Scanner.next(), nextInt(), nextDouble()时，遇到空格回车就停止就收了
            最好用nextLine()：只有遇到回车才停止
        */
        String str1 = Integer.toBinaryString(10);
        System.out.println(str1);

        int i1 = Integer.parseInt("100");
        System.out.println(i1+1);
    }


}
