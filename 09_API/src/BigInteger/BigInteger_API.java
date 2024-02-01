package BigInteger;

import java.math.BigInteger;
import java.util.Random;

public class BigInteger_API {
    public static void main(String[] args) {
        //1，public BigInteger(int num, Random rnd)
        //获取随机大整数，范围：[0 到 2的num次方-1]
        BigInteger bd1 = new BigInteger(4, new Random());
        System.out.println(bd1);

        //2，public BigInteger(String val)
        //获取指定大整数 (必须是整数)
        BigInteger bd2 = new BigInteger("100");
        System.out.println(bd2);

        //3，public BigInteger(String val, int radix)
        //获取指定进制的大整数，字符串中的数字必须跟要求进制格式吻合
        BigInteger bd3 = new BigInteger("100",2);
        //二进制时，会把二进制转为十进制
        System.out.println(bd3);
    }
}
