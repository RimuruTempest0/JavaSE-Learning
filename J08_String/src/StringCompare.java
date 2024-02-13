import java.util.*;
public class StringCompare {
    public static void main(String[] args) {
//        String s1 = new String("abc");
//        String s2 = "abc";
//        String s3 = "ABC";
//
//        System.out.println("s1==s2 " + s1==s2);
//        System.out.println("s1.equals(s2) " + s1.equals(s2));
//
//        //忽略大小写
//        System.out.println("s1.equalsIgnoreCase(s3) "+s1.equalsIgnoreCase(s3));

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next(); //next()底层代码是new出来的
        String str2 = "abc";

        System.out.println("str1==str2" + str1==str2);
        System.out.println("str1.equals(str2)" + str1.equals(str2));
    }
}
