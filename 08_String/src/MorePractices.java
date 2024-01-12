import java.util.*;


public class MorePractices {
    private static final Random rnd = new Random();
    public static void main(String[] args) {
//        practice1();
//        practice2();
//        practice3();
        practice4();
    }
    static void practice4(){
        /*Given a String that consists with several words.
        * Return the length of last word of the sentence*/

        int size = 52;
        ArrayList<Character> AlphaBeta = new ArrayList<>(size);
        for(int i = 0; i<size; i ++){
            if(i<26){
                AlphaBeta.add((char)(65 + i));
            }else{
                AlphaBeta.add((char)(71 + i));
            }
        }
        String input = "  let me fly   ";
        StringBuilder result = new StringBuilder();
        boolean switcher = false;
        for (int i = input.length()-1; i >= 0; i--) {
            if(AlphaBeta.contains(input.charAt(i))){
                switcher = true;
                result.insert(0,input.charAt(i));
            }
            if(input.charAt(i)==' ' && switcher){
                int length = result.length();
                System.out.println(result.append(" ").append(length));
                break;
            }
        }
    }
    static void practice3(){
        /*Given 2 Strings non-negative num1 & num2, return the multiplication in String*/
        String num1 = "123";
        String num2 = "3";
        int numOne = Integer.parseInt(num1);
        int numTwo = Integer.parseInt(num2);
        int result = numOne*numTwo;
        String sb = String.format("%s",result);
        System.out.println(sb);
    }

    static void practice2() {
        /* Generate verification code: can be either upper or lower case.
        * With minimum one number in any position in the string.
        * Total length should be 5.*/
        int size = 52;
        char[] AlphaBeta = new char[size];
        for(int i = 0; i<size; i ++){
            if(i<26){
                AlphaBeta[i] = (char)(65 + i);
            }else{
                AlphaBeta[i] = (char)(71 + i);
            }
        }


        StringBuilder sb = new StringBuilder();
        for(int i=0; i<4; i++){
            int randomChar = rnd.nextInt(AlphaBeta.length);
            int randomNumber = rnd.nextInt(9);
            int randomSwap = rnd.nextInt(3);
            sb.append(AlphaBeta[randomChar]);
            if(i==3){
                sb.append(randomNumber);
                char current = sb.charAt(randomSwap);
                sb.setCharAt(randomSwap,sb.charAt(4));
                sb.setCharAt(4,current);
            }
        }
        System.out.println(sb);
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
            System.out.println(result);
        }
    }
}
