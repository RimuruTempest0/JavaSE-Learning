package ExceptionDemo1;

public class ExceptionConcept {
    /*
    * Exception：叫做异常，代表程序可能出现的问题
    *           我们通常会用Exception以及它的子类来封装程序出现的问题
    * 运行时异常(unchecked异常)：RuntimeException及其子类，编译阶段不会出现异常提醒，不需要throws，不需要try catch
    *           运行时出现的异常 (如：NullPointerException; ArrayIndexOutOfBoundException; IllegalArgumentException)
    * 编译时异常(checked异常)：编译阶段就会出现异常提醒（如：IOException; SQLException; ClassNotFoundException）用try catch，需要throws
    *
    * 三种处理：
    * 1，JVM自己处理
    * 2，程序员自己处理（捕获异常）
    *       try{可能出现异常的代码} catch(异常类名 变量名) {异常的处理代码}
    *       目的：当代码出现异常时，可以让程序继续往下执行
    *
    *       灵魂1问：如果try中没有遇到问题，怎么执行？
    *                   会把try里面所有的代码全部执行完毕，不会执行catch里面的代码
    *       灵魂2问：如果try中遇到多个问题，怎么执行？
    *                   多几个异常，就多写几个对应的catch()来捕获异常
    *                   细节：
    *                       如果这些异常存在父子关系的话，那么父类一定要写在下面
    *                       可以再catch中同时捕获多个异常，用|隔开，表示出现A异常或者B异常，采取同一种处理方案
    *       灵魂3问：如果try中遇到问题没有被捕获，怎么执行？
    *                   采用JVM处理
    *       灵魂4问：如果try中遇到问题，那么try下面的其他代码还会执行吗？
    *                   不会执行，直接跳转到catch
    * 3，抛出异常 (throws 和 throw)
    *       throws: 写在方法定义处，表示声明一个异常
    *               告诉调用者，使用本方法可能会有哪些异常
    *               public void 方法()throws 异常类名1, 异常类名2...{}
    *
    *       throw:  写在方法内，结束方法，手动抛出异常对象，交给调用者，方法下面的代码不再执行
    *               public void 方法(){
    *                   throw new NullPointerException();
    *                   下面的代码不再执行
    *               }
    *
    * Throwable的成员方法 （异常中常见方法）
    * public String getMessage()：   返回此throwable的详细信息字符串 (需要返回值接收)
    * public String toString()：     返回此可抛出的间接描述  (需要返回值接收)
    * public void printStackTrace()：把异常的错误信息输出在控制台
    * */

    public static void main(String[] args) {
        //需求：定义一个方法求数组的最大值

        int[] arr = null;
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            //throw new RuntimeException(e);
            System.out.println("空指针异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            //throw new RuntimeException(e);
            System.out.println("索引越界异常");
        }

        System.out.println(max);
    }

    public static int getMax(int[] arr) throws NullPointerException, ArrayIndexOutOfBoundsException{
        if(arr == null){
            //手动创建一个异常对象，并把这个异常交给方法的调用者处理
            throw new NullPointerException();
        }
        if(arr.length == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}