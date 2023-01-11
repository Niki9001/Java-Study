package chapter04;

public class Java07_Method_Param {
    public static void main(String[] args) {
        /*
        TODO 面向对象 - 方法
            使用外部数据控制方法内部实现的操作，使用的是参数语法实现，也叫方法参数。
            语法：
                方法名(参数类型 参数名称)
                方法名(参数类型1 参数名称1，参数类型2 参数名称2)
         */
        User03 user = new User03();
        user.sayHello("Zhangsan",30);
        //或者
        String name = "Lisi";
        int age = 40;
        //传递参数
        user.sayHello(name,age);
        user.test("Wangwu","Xuliu");
        /*
        TODO 当方法传递多个参数时，需要注意：
            1. 参数个数需要匹配
            2. 参数类型需要匹配
            3. 参数顺序需要匹配
            4. 当参数个数不确定，但是类型相同时，可以采用特殊的参数语法声明：可变参数
                语法：参数类型... 参数名称
                如果参数中还包含其他参数，那么可变参数应该声明在最后
                可变参数打印需要用for或者while loop进行，否则打印的是对象

         */
    }
}
class User03{
    void sayHello(String name, int age){
        // 使用参数
        System.out.println("Hello " + name + ", "+ age);
    }
    //TODO 正确的可变参数打印方法
    void test(String... name){
        for (String nm:name){
            System.out.println(nm);
        }

    }
}