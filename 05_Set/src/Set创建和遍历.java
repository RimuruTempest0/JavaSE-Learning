import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set创建和遍历 {
    public static void main(String[] args) {
        /*
        HashSet:        无序的，不可重复的，无索引
        LinkedHashSet:  有序，不重复，无索引
        TreeSet:        可排序，不重复，无索引
        * 利用Set系列的集合，添加字符串，并使用多种方式遍历
        *   迭代器
        *   增强for
        *   Lambda表达式
        *
        * 由于Set接口是Collection的派生接口，所以也可以使用Collection内的方法:
        增   boolean add(E e)                加进去true,没加进去false
        删   void clear()                    清空集合
             boolean remove(E e)            有对象，删除并返回true, 没对象，返回false
        查   boolean contains(Object obj)    判断是否含有给定对象
             boolean isEmpty()               判断是否为空
        改   无法更改，因为无索引
        * */

        Set<String> s = new HashSet<>();

        s.add("张三");
        s.add("张三");
        s.add("李四");
        s.add("王五");

        //1，迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String str = it.next();
            //System.out.println(str);
        }

        //2, for增强
        for (String str : s) {
            //System.out.println(str);
        }

        //3, Lambda
        s.forEach((String str) -> {
                    System.out.println(str);
                }
        );
    }
}