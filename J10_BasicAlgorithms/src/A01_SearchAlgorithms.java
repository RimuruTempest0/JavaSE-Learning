import java.util.*;

public class A01_SearchAlgorithms {
    public static void main(String[] args) {
        int[] arr = {2,4,16,23,53,67,78,126};

//        System.out.println(basicSearch(arr,2));
        System.out.println(basicBinarySearch(arr,53));
    }

    //--------------------------------Basic Search----------------------------------
    public static ArrayList<Integer> basicSearch(int[] arr, int number){
        //核心：从0索引开始往后查找
        //需求：定义一个方法利用基本查找，查询元素索引，元素有重复
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                index.add(i);
            }
        }
        return index;
    }

    //--------------------------------Binary Search-----------------------------------
    public static int basicBinarySearch(int[] arr, int number){
        //Array must be sorted
        //要求是有序的，可是如果把原本无序的数据排序后再查找得到的索引没有意义，只能确定是否存在
        //minIndex & maxIndex indicate the search range
        //midIndex = (maxIndex + minIndex)/2
        //midIndexLeft:  minIndex remains, maxIndex = mid-1
        //midIndexRight: maxIndex remains, minIndex = mid+1


        int minIndex = 0;
        int maxIndex = arr.length-1;
        int midIndex = 0;
        while(true){
            if(minIndex > maxIndex){
                return -1;
            }
            midIndex = (maxIndex + minIndex)/2;
            if(number < arr[midIndex]){
                //number is left of mid, Right half no needs
                maxIndex = midIndex-1;
            } else if(arr[midIndex] < number){
                //number is right of mid, Left half no needs
                minIndex = midIndex+1;
            } else {
                return midIndex;
            }
        }
    }

    //插值查找
    public static int interpolationSearch(int[] arr, int number) {
        //优化二分查找的效率
        //midIndex不再使用纯中间值，而是尽量靠近要查找的number
        //                                (number-arr[minIndex)
        //  公式: midIndex = minIndex +  ——————————————————————————  * (maxIndex-minIndex)
        //                             (arr[maxIndex]-arr[minIndex)

        return -1;
    }

    //斐波那契查找
}
