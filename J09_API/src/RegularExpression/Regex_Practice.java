package RegularExpression;

public class Regex_Practice {
    /* 需求请编写正则表达式验证用户输入的手机号码是否满足要求。
    请编写正则表达式验证用户输入的邮箱号是否满足要求。
    请编写正则表达式验证用户输入的电话号码是否满足要求。

    验证手机号码13112345678 13712345667 13945679027 139456790271
    验证座机电话号码020-2324242 02122442 027-42424 0712-3242434
    验证邮箱号码3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn dlei0009@pci.com.cn
     */

    public static void main(String[] args){
        //经验：
        //拿着一个正确的数据，从左到右一次去写
        // \\d{9}:任意数字允许出现9次，也只能出现9次
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1));
        System.out.println("13712345667".matches(regex1));
        System.out.println("13945679027".matches(regex1));
        System.out.println("139456790271".matches(regex1));
        System.out.println("----------------------------------");
        //一： 区号 0\d{2,3}
        //         0:第一位必须是0开头
        //           \\d{2,3}: 第二位开始可以是任意数字，出现2到3次
        //二：  -? 表示 - 的出现次数，0或者1次
        //三： 号码
        //      [1-9]    号码第一位不能0开头
        //      \\d{4,9} 第二位开始任意数字
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("02122442".matches(regex2));
        System.out.println("027-42424".matches(regex2));
        System.out.println("0712-3242434".matches(regex2));
        System.out.println("------------------------------------------");
        /*
         第一部分： @的左边 \\w+
                    任意的字母数字下划线，至少出现一次就可以了
         第二部分： @只能出现一次
         第三部分：
            3.1： [\\w&&[^-]]{2,6}]：任意字符除了下划线_,总共出现2-6次
            3.2:  \\. 表示出现并只能一次.(点)
            3.3: [a-zA-z]{2,3}大写和小写字母都可以，但只能出现2-3次
            3.4: (\.[a-zA-z]{2,3}){1,2} 前面那一组正则，可以出现1-2次
        * */


        String regex3 = "\\w+@[\\w&&[^-]]{2,6}(\\.[a-zA-z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(regex3));
        System.out.println("zhangsan@itcast.cnn".matches(regex3));
        System.out.println("dlei0009@163.com".matches(regex3));
        System.out.println("dlei0009@pci.com.cn".matches(regex3));
        System.out.println("dlei0009@pci.com.cn".matches(regex3));
    }
}
