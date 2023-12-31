/* java的内存模型
    方法区：临时存储字节码文件（.class文件）
    堆内存：new出来的对象都在这里
    栈内存：方法运行的时候进栈，执行完毕出栈
    字符串常量池（StringTable串池）：只有直接赋值创建的对象会存储在StringTable里
        当使用“”直接赋值时，系统会检查是否在StringTable里，存在->复用；不存在->创建新的

 */
public class StringBasic {
    public static void main(String[] args) {
        //1, 直接赋值创建String对象
        String s1 = "abc";
        System.out.println(s1);

        //2, 使用new的方式创建String对象
        //空参构造:可以获取一个空白的字符串
        String s2 = new String();
        System.out.println("@"+s2+"!");// ""

        //3, 传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        //需求：修改字符串内容
        //"abcd" --> {'a', 'b', 'c', 'd'} --> {'Q', 'b', 'c', 'd'} --> "Qbcd"
        char[] chs = {'a', 'b', 'c', 'd'};
        String s3 = new String(chs);
        System.out.println(s3);

        //4, 传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        //需求：以后在网络当中传输的数据都是字节信息
        //我们一般把字节信息进行转换，转成字符串，此时就会用到这个构造
        byte[] bytes = {97, 98, 99, 100};
        String s4 = new String(bytes);
        System.out.println(s4);


    }
}