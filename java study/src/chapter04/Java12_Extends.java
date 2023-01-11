package chapter04;

public class Java12_Extends {
    public static void main(String[] args) {
        /*
        TODO 面向对象 - Extends - 继承
            封装 Encapsulation 继承 Inheritance 多态 Polymorphism
            类存在父子关系，子类可以直接获取到父类的成员属性和成员方法。
            类的继承智能是单继承，一个类只能有一个父类，不能存在多个父类
            一个父类可以有多个子类
            继承采用extends语法，子类 extends 父类
         */
        /*
        TODO 如果父类和子类含有相同的属性，那么可以采用特殊的关键字进行区分
            super（父类的用super）
            this （子类的用this）
         */
        Child c = new Child();
        System.out.println(c.name); //因为没有声明是super还是this，所以只能打印子类的name
        c.test(); // 直接调用child已经声明好的name
    }
}
class Parent{
    String name = "Zhangsan";
    //void test(){
        //System.out.println("Test");

}
class Child extends Parent{
    String name = "Lisi";
    void test(){
        System.out.println(super.name);
        System.out.println(this.name);
    }

}
