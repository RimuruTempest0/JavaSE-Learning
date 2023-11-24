import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamInput1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("03_IO\\a.txt");
        byte[] bytes = {97, 98, 99, 100};
        fos.write(bytes);
        fos.close();

        //1,创建对象
        FileInputStream fis = new FileInputStream("03_IO\\a.txt");
        //2.1,读取数据, 当读到文件末尾，返回-1
        //int b1 = fis.read();

        //2.2,循环读取
        int b2;
        while ((b2 = fis.read()) != -1){
            System.out.println((char)b2);
        }

            //细节：read()读取一次数据，就移动一次指针

        //3,释放资源
        fis.close();

    }
}
