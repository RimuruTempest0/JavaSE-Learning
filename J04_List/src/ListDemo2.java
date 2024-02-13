import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        //删除元素
        //list.remove(1);
        //问：删除的是1这个元素，还是1索引？
        //答：在调用方法时，如果方法出现了重载现象
        //    优先调用，实参和形参类型一致的那个方法，是索引

        //解决：手动装箱，手动把基本数据类型的1，变成Integer类型
        Integer i = Integer.valueOf(1);
        list.remove(i);
        System.out.println(list);

    }
}
