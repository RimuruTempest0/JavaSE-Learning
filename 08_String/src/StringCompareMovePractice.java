
public class StringCompareMovePractice {
    public static void main(String[] args) {
        /*
         * 给定两个字符串，A和B。
         * A的旋转操作就是将A 最左边的字符移动到最右边。
         * 例如， 若A= ‘abcde’，在移动一次之后的结果就是‘bcdea’
         * 如果在若干次调整操作之后，A能变成B，那么返回True。
         * 如果不能匹配成功，则返回false*/
        String a = "abcde";
        String b = "cdeac";
        System.out.println(checkString(a,b,0));

    }
    public static boolean checkString(String a, String b, int counter){
        if(a.equals(b)){
            return true;
        }else{
            counter++;
            if(counter==a.length()){
                return false;
            } else {
                return checkString(spinString(a), b, counter);
            }
        }
    }
    public static String spinString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char first = str.charAt(0);
            if (i + 1 >= str.length()) {
                result.append(first);
            } else {
                result.append(str.charAt(i + 1));
            }
        }
        return result.toString();
    }
}
