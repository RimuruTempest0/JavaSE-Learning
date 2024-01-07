import java.util.*;
public class StringBuilderPractice {
    private static final int[] arr = {1,2,3};
    public static void main(String[] args) {
        //链式编程:
        //当在调用一个方法的时候，不需要用变量接受他的结果，可以继续调用其他方法
//        StringBuilder sb = new StringBuilder();
//        sb.append("aaa").append("bbb").append("ccc");

        //使用StringBuilder的场景：
        //1. 字符串的拼接
        //2. 字符串的反转

        /*
        练习1：对称字符串
        while(true){
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            StringBuilder sb = new StringBuilder(input);
            String inputReverse = sb.reverse().toString();
            if(input.equals(inputReverse)){
                System.out.println("Symmetric");
            }else{
                System.out.println("Non-symmetric");
            }
        }
        */

        int a = arr.length;
        //练习2：拼接字符串
        //System.out.println(Arrays.toString(arr));
        StringBuilderPractice sbp = new StringBuilderPractice();
        System.out.println(sbp);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
            if(i != (arr.length - 1)){
                sb.append(",");
            }
        }
        return sb.append("]").toString();
    }

}
