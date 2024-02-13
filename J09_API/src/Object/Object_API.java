package Object;

/*
    1，public String toString()
    2，public boolean equals(Object obj)
        结论：
            1，如果没有重写equals方法，那么默认使用Object中比较是 地址值 是否相等
            2，一般地址值意义不打， 所以会重写，重写之后就是对象内部属性值
    3，protected Object clone(int a)
        对象拷贝，把A对象的属性值完全拷贝给B对象
 */
public class Object_API {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(s.equals(sb));
        //调用s中的equals()方法
        //先判断是否是字符串，如果是->再比较内部属性
        //如不是，false
        System.out.println(sb.equals(s));
        //调用sb中的equals()方法
        //但是在StringBuilder中，没有重写equals方法
        //使用的是Object中的，在Object中，默认是 == 比较地址值
        //s与sb地址值不一样，所以false
    }
}
