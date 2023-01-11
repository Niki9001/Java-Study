package chapter04;

public class Java12_Extends1 {
    public static void main(String[] args) {
        /*
        TODO 构造方法
             父类对象是在子类对象创建前创建完成，创建子类对象，会调用父类的构造方法完成父类的创建
             默认情况下，子类对象构造时，会默认调用父类的构造方法完成对父类对象的创建，使用的是super方式，JMV自动完成
             如果父类提供了构造方法，那么JVM不会提供默认的构造方法，那么子类应该显示调用super方法构建父类对象
         */
        Child1 c1 = new Child1();
        System.out.println(c1); // 这样对打印对象
        /*
        TODO
            new 只会构建一个对象
         */
    }
}
class Parent1{
    String username;
    Parent1(String name) {
        username = name;
        System.out.println("parent");
    }
}
class Child1 extends Parent1{
    Child1(){
        super("Zhangsan");
        System.out.println("child");
    }
}