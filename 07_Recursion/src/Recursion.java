import java.util.*;

public class Recursion {
    public static int factorial(int n) {
        if (n > 1) {
            return factorial(n - 1) * n;
        } else {
            return 1;
        }
    }

    public static int fibonacci(int n) {

        if (n > 1) {
            return fibonacci(n - 2) + fibonacci(n - 1);
        } else {
            return n;
        }
    }

    public static int[] fibonacciSequence(int n) {
        if (n == 0) {
            return new int[] { 0 };
        } else if (n == 1) {
            return new int[] { 0, 1 };
        } else {
            int[] s1 = fibonacciSequence(n - 1);
            int[] s2 = fibonacciSequence(n - 2);
            int[] newS = new int[s1.length + 1];
            for (int x = 0; x < s1.length; x++) {
                newS[x] = s1[x];
            }
            newS[newS.length - 1] = s1[s1.length - 1] + s2[s2.length - 1];
            return newS;
        }

    }
    /*HashMap 储存了除去base case以外其他所有的递归map
     * 
     * Take example of 5:
     * HashMap(2,fibonacciSequenceWithCache(3))
     * HashMap(3,fibonacciSequenceWithCache(4))
     * HashMap(4,fibonacciSequenceWithCache(5))
     * 这样的话，这些只需要计算一次，下次计算直接找map
     */

    public static HashMap<Integer, int[]> cache = new HashMap<Integer, int[]>();
    public static int[] fibonacciSequenceWithCache(int n) {// n=5
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            if (n == 0) {
                return new int[] { 0 };
            } else if (n == 1) {
                return new int[] { 0, 1 };
            } else {
                int[] s1 = fibonacciSequenceWithCache(n - 1); // 0 1
                int[] s2 = fibonacciSequenceWithCache(n - 2); // 0
                int[] newS = new int[s1.length + 1]; // [ , , ] 3 empty
                for (int x = 0; x < s1.length; x++) {
                    newS[x] = s1[x];// [0,1, ] 1 empty
                }
                newS[newS.length - 1] = s1[s1.length - 1] + s2[s2.length - 1]; // [0,1,1]
                cache.put(n, newS); // 2, [0,1,1]
                return newS;
            }
        }
    }

    /*
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     * 1 4 6 4 1
     */

    public static int[] pascals(int n) // 3
    {
        if(n==0)
        {
            return new int[] {1};
        }else{
            int[] above = pascals(n-1); // 2
            // System.out.println(Arrays.toString(above));
            int[] nowLevel = new int[n+1];
            nowLevel[0]=1;
            nowLevel[n]=1;

            for(int i=1; i<n; i++)
            {
                nowLevel[i] = above[i-1]+above[i];
            }

            return nowLevel;
        }
    }

    public static void main(String[] args) {
        // System.out.println("factorial is: " + factorial(3));
        // System.out.println("fibonacci is: " + fibonacci(9));

        // long startTime = System.currentTimeMillis();
        // System.out.println(Arrays.toString(fibonacciSequence(40)));
        // System.out.println("Time for fibonacciSequence: "+ (System.currentTimeMillis()-startTime)+" ms");

        // startTime = System.currentTimeMillis();
        // System.out.println(Arrays.toString(fibonacciSequenceWithCache(5)));
        // System.out.println("Time for fibonacciSequenceWithCache: "+ (System.currentTimeMillis()-startTime)+" ms");

        for(int x=0; x<=4; x++)
        {
            System.out.println(Arrays.toString(pascals(x)));
        }

    }
}