package chapter02;

public class java01_Variale {
    public static void main(String[] args) {
        /*
        TODO 变量
        所谓变量就是可以改变的向量存储
        1. 变量声明
            数据类型
            变量名称
         */
        String name;
        /*
        2. 变量赋值
            变量名称 = 数据
         */
        name = "zhangsan";
        /*
        3. 变量使用
            直接访问变量名称即可
         */
        System.out.println(name);
        // 将变量的声明和赋值在一行代码中完成
        String username = "lisi";
        System.out.println(username);

        //在使用变量之前，必须要给变量赋值，这个操作称之为变量的初始化
    }
}
