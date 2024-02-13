public class StringReversePractice {
    public static void main(String[] args) {
        String example = "abcde";
        System.out.println(stringReverse(example));

    }
    public static String stringReverse (String input){
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }
}
