public class MyLinkedList {
    public Node head; //链表类里，创建node 头尾对象
    public Node tail;
    public int size;//链表的长度
    public MyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void add(int value){
        Node temp = new Node(value); //创建一个被加的Node
        //注意：当插入第一个Node时，链表的头尾都是null，也就是说，正在往null的Node里，加新Node。
        //     我们想要的是，加的第一个Node，也就是替换初始化的头尾都空的Node。故有以下判断
        if(this.tail != null){
            this.tail.next = temp; //从后加，也就是tail里的next指向新加的node
            this.tail = temp; //加完以后，新加的node就变成了新的tail
        }else{
            this.head = temp;
            this.tail = temp;
        }

        this.size++; //每add一次，size加1

    }
    public void remove(int index){
        int counter =0;
        Node cursor = this.head;
        if(index == 0){
            //如果要删除head Node，直接把head Node下一个Node变成新head Node
            this.head = cursor.next;
        }else{
            //这里用index-1是因为cursor只能迭代到被删除Node的前一个，然后将被删除前一个Node.next与被删除后一个Node连接。
            //假设cursor迭代到被删除Node的位置，那么cursor将无法获取前一个Node的地址了，这就是单链表的特性。
            while (counter<index-1){
                cursor = cursor.next;//cursor往前迭代
                counter++;
            }
            //当while运行完时，也就找到了，cursor也就变成了 被删除Node的前一个Node
            //然后将前一个Node和cursor.next(被删除Node).next(被删除后一个Node)连接起来
            cursor.next = cursor.next.next;
        }
        this.size--;

    }

    public int get(int index){
        //判断两种边界情况
        //1，index为-1的时候
        //2，index超过linkedList长度时
        if(index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }



        int counter=0;
        Node cursor = this.head;
        while(counter < index) {//当运行到index的时候，cursor也迭代到了index的Node上
            cursor = cursor.next;//迭代cursor
            counter++;
        }
        return cursor.value;
    }

    public int getSize(){
        return this.size;
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println("Size: "+linkedList.getSize());
        linkedList.remove(0);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println("Size: "+linkedList.getSize());



    }
}

class Node{//单项链表，只包含值，和下一个node的指针(java里也就是下一个Node)
    public int value;
    public Node next;
    public Node(int value){
        this.value = value;
        this.next = null; //确保每个node后面是null，这样才能往后add
    }
}

