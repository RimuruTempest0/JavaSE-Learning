import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamOutput2 {
    public static void main(String[] args) throws IOException {
        /*
            换行写：
                再写一个换行符
                win: \r\n 回车+换行

            续写(不清空)：
                FileOutputStream("03_IO\\a.txt", 续写开关(true/false))

        */

        //1，创建对象
        FileOutputStream fos = new FileOutputStream("03_IO\\a.txt",true);

        //2, 写出数据
        String str1 = "kankannengbunengshuru";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);

        String wrap = "\r\n";
        byte[] bytes2 = wrap.getBytes();
        fos.write(bytes2);

        String str2 = "666";
        byte[] bytes3 = str2.getBytes();
        fos.write(bytes3);

        //3，释放资源
        fos.close();
    }
}
