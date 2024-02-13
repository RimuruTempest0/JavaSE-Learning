package RegularExpression;

/*
    作用1：检验字符串是否满足规则
    作用2：在一段文本中查找满足要求的内容
    .matches(正则表达式)

    字符类(只匹配一个字符)：[]表示范围
        [abc] 只能是a,b,c
        [^abc] 除了a,b,c
        [a-zA-z]
        [a-d[m-p]] a到d，或m到p
        [a-z&&[def]] a-z和def的交集。为d,e,f
        [a-z&&^bc] a-z和非bc的交集。等同于[ad-z]（a或d到z）
        [a-z&&[^m-p]] a到z和除了m到p的交集。等同于[a-lq-z]

*/
public class Regex_Demo1 {
    public static void main(String[] args) {
        /*
            假如现在要求校验一个qq号码是否正确。
        规则：6位及20位之内，0不能在开头，必须全部是数字。
        先使用目前所学知识完成校验需求
        然后体验一下正则表达式检验。
        */
        String qq = "1234567890";
        System.out.println(qq.matches("[1-9]\\d{5,19}"));

        // 不能出现a b c
        System.out.println("-------------------2-------------------");
        System.out.println("a".matches("[^abc]")); // false
        System.out.println("z".matches("[^abc]")); // true
        System.out.println("zz".matches("[^abc]")); //false
        System.out.println("zz".matches("[^abc][^abc]")); //true

        // a到z A到Z（包括头尾的范围）
        System.out.println("-------------------3-------------------");
        System.out.println("a".matches("[a-zA-Z]")); // true
        System.out.println("z".matches("[a-zA-z]")); // true
        System.out.println("aa".matches("[a-zA-z]")); //false
        System.out.println("zz".matches("[a-zA-z]")); //false
        System.out.println("zz".matches("[a-zA-z][a-zA-z]")); //false
        System.out.println("0".matches("[a-zA-z]")); //false
        System.out.println("0".matches("[a-zA-z0-9]")); //false


    }
}
