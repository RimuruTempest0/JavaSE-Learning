package Practice;

public class parseInt_Practice {

    public static void parseIntPractice() {
        /*
            自己实现parseInt方法，将字符串形式的数据转为整数
            要求：
                字符串中只能是竹子不能有其他字符
                最少一位，最多10位
                0不能开头
         */
        String str = "123456789";
        //校验字符串
        //习惯：先把异常数据进行过滤，省下来就是正常的数据
        if (!str.matches("[1-9]\\d{0,9}")) {
            System.out.println("数据格式有误");
        } else {
            System.out.println("数据格式正确");
            //定义一个变量表示最终的结果
            int number = 0;
            //遍历字符串
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                number = number * 10 + c;
            }
            System.out.println(number);
        }
    }

    public static String toBinaryStringPractice(int number){
        /*
            定义一个toBinaryString方法，将十进制整数转成字符串表示的二进制
            乘积取余法：不断地除以基数（进制数）得到余数；直到商为0，将余数 倒着 拼接起来
         */
        StringBuilder sb = new StringBuilder();
        while(true){
            if(number == 0){
                break;
            }
            int remainder = number %2;
            sb.insert(0,remainder);
            number = number / 2;
        }
        return sb.toString();
    }




    public static void main(String[] args) {
//        parseIntPractice();
        System.out.println(toBinaryStringPractice(6));
        System.out.println(Integer.toBinaryString(6));
    }

}
