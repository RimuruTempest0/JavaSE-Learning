import java.util.*;


public class StringLoginPractice {
    public static void main(String[] args) {
        HashMap<String, String> CorrectAccount = new HashMap<>();
        //1，定义两个变量记录正确的用户名和密码
        CorrectAccount.put("zhangsan", "123456");

        //2, 键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        int passwordTimes = 3;
        while (true) {
            System.out.print("请输入用户名： ");
            String username = sc.next();
            if (CorrectAccount.containsKey(username)) {

                while (true) {
                    System.out.print("请输入密码： ");
                    String password = sc.next();
                    if (CorrectAccount.containsValue(password)) {
                        System.out.println("成功登入！");
                        break;
                    } else {
                        if (passwordTimes == 1) {
                            System.out.println("登录失败！");
                            break;
                        } else {
                            System.out.print("用户名不存在，请重新输入！剩余次数 " + (--passwordTimes) + "次");
                        }
                    }
                }
                break;

            } else {
                System.out.print("用户名不存在，请重新输入！");
            }
        }


    }

}
