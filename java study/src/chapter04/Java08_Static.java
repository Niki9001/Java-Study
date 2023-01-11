package chapter04;

public class Java08_Static {
    /*
    TODO 面向对象
        针对于具体对象的属性称之为对象属性，成员属性，实例属性
        针对于具体对象的方法称之为对象方法，成员方法，实例方法
        把和对象无关，只和类型相关的称之为静态
        和类相关的属性称之为静态属性
        和类相关的方法称之为静态方法
        静态方法就是在属性和方法前增加static关键字
        静态方法不需要new，直接就可以运行
     */
    /*
    TODO 先有类，再有对象
        成员方法可以访问静态属性和静态方法
        静态方法不可以访问成员属性和成员方法
     */
    /*
    TODO 静态代码块
        类的信息加载完成后，会自动调用静态代码块，可以完成静态属性的初始化功能
        对象准备创建时，也会自动调用代码块，但不是静态的
     */
    public static void main(String[] args) {
        Chinese c = new Chinese();
        c.name = "Zhangsan";
        System.out.println("Hello "+c.name+" ,"+c.nationality);
        Bird.fly();
        System.out.println(Bird.type);
        Test t = new Test();
        System.out.println(t.gender = "Male"); //输出是 Male
        t.test();
        t.test1();
        User04.test();// 类全部执行
        new User04();// 会打印静态代码块，但是不会打印test
    }
}
class Test{
    String name;
    static String gender;
    void test(){
        test1(); //调用静态方法。所以test输出也是test1的结果
        //System.out.println("Test");

    }
    static void test1(){
        System.out.println("Test 1");

    }
}
class Bird{
    static String type = "Bird";
    static void fly(){
        System.out.println("Flying");
    }
}
class Chinese{
    String name;
    String nationality = "China";
}
class User04{
    static {
        System.out.println("Static coding can be executed.");
    }
    static void test(){
        System.out.println("Test in static");
    }
}