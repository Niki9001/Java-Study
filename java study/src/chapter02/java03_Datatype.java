package chapter02;

public class java03_Datatype {
    public static void main(String[] args) {
        String name = "Zhangsan";
        System.out.println(name);
        /*
        TODO 数据存储的单位
        1. 比特（bit）：数据运算的最小存储单位
        2. 字节（byte）：数据的最小存储单位
            字节和比特之间可以互相转换
            1 byte = 8 bit
                KB, MB, GB, TB....PB,EB
         */
        /* TODO 数据类型
        1. 整数
        byte： 8位
        short： 16位
        int： 32位
        long： 64位
         */
        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;
        /*
        TODO：浮点类型，含有小数点的数据类型
        默认情况下，小数点的数据会被识别为精度较高的双精度double类型
        根据计算精度分为：
        float：单精度浮点类型，数据需要使用F(f)结尾
        double：双精度浮点类型
         */
        float f = 1.0f;
        double d = 2.0;
        /*
        TODO: 字符类型
        所谓的字符类型，其实就是使用符号标识文字内容
         */
        char C = '@';
        /*
        TODO: 布尔类型
        true、false，标识判断条件是否成立，如果成立，True。不成立False
         */
        /*
        数据类型转换

        数据类型排列
        byte >> short >> int >> long >> float >> double
        Java中范围小的数据可以直接转换为范围大的数据，但是范围大的数据无法直接转换为范围小的数据
        如果想要将范围大的数据转换为范围小的数据，那么需要使用小括号进行强制转换
         */
        int i1 = (int)d;
        System.out.println(i1); // 结果是 2
        /*
        TODO: 引用数据类型
        就是可以被引用的数据类型
         */
        String st = "abc";


    }
}
