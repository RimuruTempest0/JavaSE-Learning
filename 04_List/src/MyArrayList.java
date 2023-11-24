import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        //泛型：限定集合中存储数据的类型
        ArrayList<String> arrL = new ArrayList<>();

        // 增: boolean add(E e)
        arrL.add("aaa");
        arrL.add("bbb");
        arrL.add("ccc");
        //System.out.println(arrL);

        // 删: boolean remove(E e)
        //     E remove(int index)
        //arrL.remove("bbb");
        //arrL.remove(0);

        // 改: E set(int index, E e)
        arrL.set(0,"ddd");
        System.out.println(arrL);


        // 查: E get(int index)
        //     int size()
        System.out.println(arrL.get(0));
        System.out.println(arrL.size());

    }
}
