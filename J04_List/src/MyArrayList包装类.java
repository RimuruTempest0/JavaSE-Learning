import java.util.ArrayList;

public class MyArrayList包装类 {
    public static void main(String[] args) {
        ArrayList<String> ls1 = new ArrayList<>();

        ls1.add("aaa");
        ls1.add("bbb");
        ls1.add("ccc");
        //Train 1: 遍历ArrayList
        System.out.print("[");
        for(int x=0; x<ls1.size(); x++){
            if(x == ls1.size()-1){
                System.out.print(ls1.get(x));
            }else{
                System.out.print(ls1.get(x)+", ");
            }
        }
        System.out.println("]");

        //Train 2: 添加数字并遍历
        //由于集合只能使用reference type, 那么如果想使用primitive type就需要将其变成对应的reference type
        //也就是：基本数据类型 的 包装类
        ArrayList<Integer> ls2 = new ArrayList<>();
        ls2.add(1);
        ls2.add(2);
        ls2.add(3);
        ls2.add(4);
        ls2.add(5);

        System.out.print("[");
        for(int x=0; x<ls2.size(); x++){
            if(x == ls2.size()-1){
                System.out.print(ls2.get(x));
            }else{
                System.out.print(ls2.get(x)+", ");
            }
        }
        System.out.println("]");
    }
}
