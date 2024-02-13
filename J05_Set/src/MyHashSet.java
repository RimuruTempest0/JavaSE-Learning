public class MyHashSet {
    public static void main(String[] args) {
        //哈希值：对象的整数表现形式
        //如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
        //如果已经重写hashCode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
        //小部分情况下，不同属性值或者不同的地址值计算出来的哈希值可能一样(哈希碰撞)

        //1，创建对象
        Student s1 = new Student("张三",23);
        Student s2 = new Student("张三",23);

        //2，有重写hashCode方法,hashCode一样
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //3, 哈希碰撞
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
