/*
    本节内容多，具体看阿伟java上部_P107

    底层原理1：字符串存储的内存原理。
        直接赋值会复用字符串常量池中的
        new出来的不会复用，而是开辟一个新的空间。
    底层原理2；==号比较的到底是什么？
        基本数据类型比较 数据值。
        引用数据类型比较 地址值。
    底层原理3：字符串拼接的底层原理
        情况1：String s = "a" + "b" + "c"；
            拼接的时候没有变量，都是字符串，会触发字符串的优化机制。
            在编译的时候(Compile,产生class文件的时候，就已经在串池里了)就已经是最终的结果了。
            也就是在运行的时候，直接复用串池里面已经拼接好的"abc"的地址
        情况2：String s1 = "a"; String s2 = s1 + "b“; String s3 = s2 + "c";
            JDK8之前：底层使用StringBuilder,且一个+号，会有两个new在堆开辟内存。
                     StringBuilder new一个对象，append拼接；然后调用toString方法转换String类型
                     而toString方法的底层是new一个字符串对象。

            JDK8之后：系统预估字符串拼接之后的总大小，把要拼接的内容都放在数组中，此时也产生一个新的字符创
        结论：如果很多字符串变量拼接，不要直接+。会在底层创建多个对象，浪费时间和性能
        用StringBuilder或者StringJoiner最好
     底层原理4：StringBuilder提高效率原理图
        所有要拼接的内容都会放在StringBuilder中，不会创建更多无用的空间，节约内存

     底层原理5：StringBuilder源码分析
        默认创建一个长度为16的字节数组
        添加内容的长度小于16，直接存
        添加的内的长度大于16会扩容（原来的容量*2+2）
        如果扩容之后哈不够，以实际长度为准
*/
