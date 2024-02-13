import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListTraversal {
    public static void main(String[] args) {
        /*
            List系列集合的物种遍历方式
                    1，迭代器
                    2，列表迭代器
                    3，增强for
                    4，Lambda表达式
                    5，普通for循环
        */

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1,迭代器
        Iterator<String> it = list.iterator();
        /*while (it.hasNext()){
            System.out.println(it.next());
        }*/

        //2,列表迭代器
        //获取一个列表迭代器的对象, 里面的指针默认也是0索引.

        //比普通迭代器多一个方法：在遍历过程中，可以添加元素
        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()){
            String str = itr.next();
            if(str.equals("bbb")){
                //添加一个“SSS"
                //此时，只能用迭代器的方式添加，不能用列表方式添加
                itr.add("SSS");

            }
        }
        System.out.println(list);

        //3,增强for
        /*for(String s : list){
            System.out.println(s);
        }*/

        //4,Lambda表达式
        //forEach方法的底层其实就是一个循环遍历
        //依次得到集合中的元素，并把每个元素传递给下面的accept方法
        //accept(s)中的形参s，依次表示集合中的每一个元素

        //详细去看黑马Java-P188-20:05
        //list.forEach((String s)->System.out.println(s));

        //5,普通for循环
        //size方法根get方法还有循环结合的方式，利用索引获取每个元素
        /*for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }*/

    }
}
