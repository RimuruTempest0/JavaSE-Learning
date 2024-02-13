import java.util.*;

public class StringHarderPractice {
    /*键盘录入一个字符串,
    要求1：长度为小于等于9
    要求2：只能是数字,将内容变成罗马数字下面是阿拉伯数字跟罗马数字的对比关系：
    I-1、 II-2、 ⅢII-3、 V-4、 V-5、 VI-6、 VII-7、VI-8、 IX-9
    注意点：罗马数字里面是没有0的如果键盘录入的数字包含0，可以变成""(长度为0的字符串)*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {
            input = sc.next();
            boolean check = checkInput(input);
            if (check && input.length() <= 9) {
                break;
            } else {
                System.out.println("Invalid Input");
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int index = c - '0';
            sb.append(changeToRome(index));
        }
        System.out.println(sb);
    }

    public static String changeToRome(int number) {
        String[] rome_num = {"", "I", "II", "Ⅲ", "IV", "V", "VI", "VII", "VIII", "IX"};
        return rome_num[number];
    }

    public static boolean checkInput(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

}*/

    public static void main(String[] args) {
        String[] rome_num = {"", "I", "II", "Ⅲ", "IV", "V", "VI", "VII", "VIII", "IX"};
        Scanner sc = new Scanner(System.in);
        StringJoiner result = new StringJoiner(",");
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.length() <= 9 && !input.isEmpty()) {
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) >= '1' && input.charAt(i) <= '9') {
                        int index = Character.getNumericValue(input.charAt(i));
                        result.add(rome_num[index]);
                    } else if (input.charAt(i) == '0') {
                        result.add(rome_num[0]);
                    } else {
                        System.out.println("Invalid Input");
                        result = new StringJoiner(",");
                        break;
                    }
                }
                System.out.println(result);
                result = new StringJoiner(",");
            } else {
                System.out.println("Invalid Input Size");
            }
        }
    }
}
