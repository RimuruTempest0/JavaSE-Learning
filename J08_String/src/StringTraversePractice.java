import java.util.*;
//键盘输入，统计大写，小写和数字字符出现的次数
public class StringTraversePractice {
    public static void main(String[] args) {
        //1. 录入字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //2. 统计--计数器思想
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        char a;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'a' && c<= 'z'){
                smallCount++;
            } else if (c >= 'A' && c<= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }

        System.out.println("bigCount: " + bigCount);
        System.out.println("smallCount: " + smallCount);
        System.out.println("numberCount: " + numberCount);
    }
}
