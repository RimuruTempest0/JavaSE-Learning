package Math;

/*
       Math.floor(double a); 向下取整
       Math.round(float a); 四舍五入
       Math.max(int a, int b);
       Math.pow(double a, double b); 返回a的b次幂的值
       Math.random(); 范围[0.0,1.0);
*/

public class Math_API {
    public static void main(String[] args) {
        //int类型取值范围 -2147483648 ~ 2147483647,因此-2147483648的abs无法生效
        //也可以将Math.abs()替换成Math.absExact(),唯一区别是后者会提供报错
        System.out.println(Math.abs(-2147483648));

        //Math.ceil(double a) 向上取整
        System.out.println(Math.ceil(12.34)); // 13.0
        System.out.println(Math.ceil(12.54)); // 13.0
        System.out.println(Math.ceil(-12.34)); // -12.0



    }
}
