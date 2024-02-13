import java.io.FileOutputStream;
import java.io.IOException;


public class ByteStreamOutput1 {
    /*
     * 演示字节输出流：FileOutputStream
     * 需求：写出一段文字到本地文件
     *
     * 实现步骤：
     *       创建对象
     *       写出数据
     *       释放资源
     * */
    public static void main(String[] args) throws IOException {
        /*
         * 字节输出流细节：
         *   1，创建字节输出流对象
         *           细节1：参数是字符串表示的路径或者是File对象都是可以的
         *           细节2：如果文件不存在会创建新文件，但要保证上级路径是存在的
         *           细节3：如果文件已经存在，则会清空文件，写入新的
         *
         *   2，写数据
         *           细节：write方法的参数是整数，但是实际上写到本地文件中的是整数在ASCII上对应的字符
         *
         *   3，释放资源
         *           每次使用完后要释放资源
         * */

        //1,创建对象
        //写出 输出流 OutputStream
        //本地文件  File
        FileOutputStream fos = new FileOutputStream("day04_IO\\a.txt");

        //2,写出数据
        //方法1：一次写一个字节
        //fos.write(97); //这里是ASCII Code

        //方法2：一次写一个字节数组数据
        //byte[] bytes = {97, 98, 99, 100, 101}; // ctrl+alt+l重新排版代码
        //fos.write(bytes);

        //方法3：一次写一个字节数组的部分数据
        //参数：数组，起始索引，个数
        byte[] bytes = {97, 98, 99, 100, 101};
        fos.write(bytes, 2,2);
        
        //3，释放资源
        fos.close();
    }
}