import java.util.Random;
import java.util.Scanner;

public class MorePractices {
    public static void main(String[] args) {
//        practice1();

    }

    static void practice2() {
        /* Generate verification code: can be either upper or lower case.
        * With minimum one number in any position in the string.
        * Total length should be 5.*/

    }

    static void practice1() {
        //Keyboard input any String, shuffle it
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        while (true) {
            String input = sc.next();
            char[] inputCharArray = input.toCharArray();
            int random = rnd.nextInt(input.length());
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char current = inputCharArray[i];
                inputCharArray[i] = inputCharArray[random];
                inputCharArray[random] = current;
            }
            for (char c : inputCharArray) {
                result.append(c);
            }
            System.out.println(result.toString());
        }
    }
}
