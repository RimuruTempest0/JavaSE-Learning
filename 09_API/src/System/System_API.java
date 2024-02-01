package System;

public class System_API {
    /*
        public static void exit(int status) 终止当前运行的Java虚拟机
        public static long currentTimeMillis() 返回当前系统的时间毫秒值 (自1970年1月1日)

        public static void arraycopy(源数组，源数组起始索引, 目标数组，目标数组起始索引, 拷贝个数)  数组拷贝
            细节：
                1，如果源数组和目标数组都是基本数据类型，那么两者的类型必须保持一致，否则报错
                2，需考虑数组长度
                3，如果数据源数组和目标数组都是引用数据类型，那么子类类性可以直接赋值给父类类型
    */


    public static void main(String[] args) {


        //用途：获取程序运行总时间 (end_time - start_time)
        long l = System.currentTimeMillis();
        System.out.println(l);

        //拷贝数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
//        System.arraycopy(arr,0,arr2,0,5);

        System.arraycopy(arr,0,arr2,4,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

        //状态码：
        //      0：当前虚拟机是正常停止
        //      非0：当前虚拟机异常停止

        System.exit(0);
        System.out.println("看看我运行了吗？");
    }


}
