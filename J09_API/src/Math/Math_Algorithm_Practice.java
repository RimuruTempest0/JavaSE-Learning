package Math;

public class Math_Algorithm_Practice {
    public static void main(String[] args) {
        //算法水题1： Check number whether prime number
        //原理：一个非质数的整数，他的两个相对应的因子必定 是 小于等于或者大于等于 其平方根的
        //      故，只需要判断平方根的一侧(左边或者右边)都可

        //        System.out.println(isPrime(20));

        /*
        算法水题2：自幂数，一个n位自然数等于自身各个数位上数字的n次幂之和
                 水仙花数（Narcissistic number）
                 1, 统计共有多少水仙花数
                 2，证明没有两位的自幂数
                 3，统计有多少个四野玫瑰树和五角星数 (都是三个)

        例：3位数   153 = 1^3 + 5^3 + 3^3
        */
        count_Narcissistic();
    }

    public static boolean isPrime(int number){
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            System.out.println(number % i);
            if(number % i == 0){
//                System.out.println(count);
                return false;
            }
        }
        System.out.println(count);
        return true;
    }

    public static void count_Narcissistic(){
        //Narcissistic: 100 ~ 999
        int result = 0;
        for (int i = 100; i <= 999; i++) {
            int unit_digit = i % 10;
            int ten_digit = i / 10 % 10;
            int hundred_digit = i / 100 % 10;

            //判断：three digits' squares whether equal to the whole
            double sum = Math.pow(unit_digit,3) + Math.pow(ten_digit,3) + Math.pow(hundred_digit,3);

            if(sum == i){
                result++;
                System.out.println(i);
            }
        }
        System.out.println(result);
    }
}
