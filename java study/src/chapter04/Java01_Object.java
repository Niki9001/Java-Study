package chapter04;

public class Java01_Object {
    public static void main(String[] args) {
        /*
        TODO 面向对象
        就是分析问题时，以问题所涉及到的事或物为中心的分析方式
        类和对象
        类表示归纳和整理
        对象就是表示具体的事物
         */
        /*
        TODO class（类）
        基本语法结构：
        class 类名{
        特征（属性），
        功能（方法）
        }
        TODO 创建对象语法
        new 类名();

         */
        /*
        1.先声明类
        2.创建对象
        3.声明属性，所谓的属性其实就是类中的变量
            变量类型 变量名称 = 变量值
            属性类型 属性名称 = 属性值
        4.声明方法
            void 方法名(参数){功能代码}
        5.执行方法
            对象.方法名()
         */
        // 引用数据类型
        // 创建对象
        Cooking c = new Cooking();
        // 赋值属性
        c.name = "HongShaoPaiGu";
        c.food = "PaiGu";
        // 执行
        c.execute();
        //TODO 字符串拼接用+
        Cooking c1 = new Cooking();
        c1.name = "ShuiZhuFish";
        c1.food = "Fish";
        c1.relish = "HuaJiao";
        c1.type = "ShuiZhu";
        c1.execute();
        //c1和c要区分清楚。否则执行结果会有错误
    }
}
class Cooking{
    //特征（属性）
    //名字
    String name;
    //菜的类型
    String type = "HongShao";
    //食材
    String food;
    //佐料
    String relish = "DaLiao";
    //执行


    void execute(){
        System.out.println("Prepare food："+food);
        System.out.println("Prepare relish："+relish);
        System.out.println("Start cooking");
        System.out.println(name+"：Done");

    }
}