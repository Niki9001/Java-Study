package chapter04;

public class Java07_Method_Param_Using {
    /*
    TODO 面向对象 - 方法 - 参数
        Java中方法参数的传递为值传递
        基本数据类型：数值
        引用数据类型：地址
     */
    public static void main(String[] args) {
        int i = 10;
        test(i);
        System.out.println(i); // 结果是 10
    }
    public static void test(int i){
        i = i + 20;
        System.out.println(i); // 结果是 30，如果这里不打印，上面的i就没被引用
    }
}
