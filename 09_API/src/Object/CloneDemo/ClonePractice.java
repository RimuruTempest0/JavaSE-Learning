package Object.CloneDemo;
/*
  细节：方法底层会创建一个对象，并把原对象的数据拷贝过去
    浅拷贝/克隆：primitive type: 拷贝数据；
                Reference type: 拷贝地址值

    深拷贝/克隆：primitive type: 拷贝数据；
                Reference Type: 不会直接拷贝地址值，重新创建一个新对象，并把老对象的数据拷贝给新对象。
                                这样来，老对象与拷贝的新对象不会互相影响，且地址值不同
    注意：String：
        String只要不是new出来的，其地址都存储在串池，然而串池的特性是 有存在，就复用。
        所以即使是深拷贝，String的地址在拷贝之前之后的地址值仍然相同。
        因为 String 对象本身是不可变的,无论是深拷贝还是浅拷贝，都只是复制了引用，
 */
public class ClonePractice {
    public static void main(String[] args) throws CloneNotSupportedException{
        //1, 创建对象
        int[] data = {1,2,3,4,5,6,7,89,10,11,12,13,14,15,0};
        User u1 = new User(1,"zhangsan","1234qwer","girl11",data);

        //2, 克隆对象 (Object中的浅克隆)
        // 由于clone()方法是protected，只能在Java.lang包下使用，所以需要重写
        // 在User类中重写
        // 抛出异常

        //步骤：
        //  1，重写Object中clone方法
        //  2，让javabean实现Cloneable接口
        //  3，创建原对象并调用clone
        User u2 = (User) u1.clone();

//        System.out.println(u1);
//        System.out.println(u2);

        //验证浅克隆/深克隆：两个对象中的值都会改变
        int[] arr = u1.getData();
        arr[0] = 100;
        System.out.println(u1);
        System.out.println(u2);

        //实际开发中不会自己写深拷贝，导入三方工具

    }
}
