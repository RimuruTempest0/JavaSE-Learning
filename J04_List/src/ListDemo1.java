import java.util.ArrayList;
import java.util.List;
public class ListDemo1 {
    public static void main(String[] args) {
      /*
      * List系列集合独有的方法:
      *     void add(int index, E element)  在集合中的指定位置插入指定的元素
      *     E remove(int index)             删除指定索引处的元素，返回被删除的元素
      *     E set(int index, E element)     修改指定索引处的元素，返回被修改的元素
      *     E get(int index)                返回指定所引出的元素
      * */
        //创建一个集合
        List<String> list = new ArrayList<>();

        //1, 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //细节：原来索引上的元素会依次往后移动
        list.add(1,"QQQ");

        //2, 删除元素 (关于int类型的删除，看ListDemo2)
        //list.remove(0); //当使用索引删除时，返回被删除的元素
        list.remove("aaa");//当list中有元素时，返回true并删除，如没有，返回false

        //3, 修改元素
        String result = list.set(0,"QQQ");
        System.out.println(result);

        //4, 返回元素
        String get = list.get(1);
        System.out.println(get);
        //打印集合
        System.out.println(list);
    }
}