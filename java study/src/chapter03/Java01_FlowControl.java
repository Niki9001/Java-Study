package chapter03;

import java.util.Scanner;

public class Java01_FlowControl {
    public static void main(String[] args) {
        /*
        TODO：Java单引号表示字符，双引号表示字符串
         */
        /*
        TODO 流程控制
        所谓流程控制，其实就是计算机在执行代码时，对指令代码执行顺序的控制
        Java中的流程控制主要分为3类
        1.顺序执行
            代码出现的先后顺序以及语法的先后顺序
        2.分支执行
            （1）. 可选分支：单分支结构
                判断条件表达式结果是否为t，如果为t，那么执行分支逻辑，如果为f，继续执行
                判断的语法使用if关键字，表示如果，在条件表达式前使用
                * Java的if 后条件需要加（），代码块前后需要加{},并且没有：如果语句中只有一行，可以不加{}
            （2）. 必须分支：双分支结构（二选一）
                if (条件) {语句序列1;}
                else (条件) {语句序列2;}
            （3）. 多分支结构
                if (条件1){语句序列1}
                else if (条件2) {语句序列2}
                else if (条件3) {语句序列3}
                else（条件4）{语句序列4} >>>> else不是一定需要的
            （4）. 特殊分支
                switch 语法会对数据进行判断，如果等于某一个分支数据的值，那么执行对应分支的逻辑代码
                    如果一个分支都无法匹配，那么一个分支都不会执行
                    如果想要无法匹配也需要执行分支，那么可以增加default关键字
                    如果执行某一个分支，不想继续执行其他分支，可以使用break关键字跳出
                    switch中case为switch括号中的量等于case后的值，不能取范围
                switch(表达式){
                case 常用量 1:
                     语句块 1
                     break;
                case 常用两 n:
                     语句块 2
                     break;
                default:
                     语句块 n+1;
                     break;
                }
        3.重复执行（循环执行）
            根据条件重复执行某段代码
            Java中的循环语法有3个：
                (1). while(条件表达式){
                    需要循环的代码}
                (2). do{循环代码}while(条件表达式)
                    控制跳出的语句要放在循环代码中
                    while循环语法可能执行，可能不执行
                    do....while循环语法中的循环代码至少执行一次
                (3). for(初始化表达式i=0;条件表达式i<6;更新表达式i=i+1){循环语句}
                    如果条件表达式返回结果为f，那么跳过循环语句，直接执行后续代码，如果返回结果为t，那么执行代码块
                    初始化表达式用于对条件表达式中使用到的变量进行初始化
                    循环代码执行后，会重新进行条件表达式的判断，如果判断结果为t，会重复执行循环代码

         */
        int i = 50;
        if (i == 10) {
            System.out.println(true);
        };
        if (i < 5) {
            System.out.println("i < 5");
        }
        else if (i == 5 ){
            System.out.println("i == 5");
        }
        else if (i > 5) {
            System.out.println("i > 5");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Input grade:");
        int grade = sc.nextInt();
        switch (grade){
            case 10:
            case 9:
                System.out.println("Good");
                break;
            case 8:
            case 7:
                System.out.println("Fine");
                break;
            case 6:
            case 5:
                System.out.println("Pass");
                break;
            case 4:
            case 3:
                System.out.println("Fail");
                break;
            default:
                System.out.println("invalid");
        }
        sc.close();

        switch (i) {
            case 10:
                System.out.println("No.1");
                break;
            case 20:
                System.out.println("No.2");
                break;
            case 30:
                System.out.println("No.3");
                break;
            case 40:
                System.out.println("No.4");
                break;
            default:
                System.out.println("Here we go");
        }
        int i1 = 0;
        while (i1 < 6){
            System.out.println("Hello");
            i1 = i1+1;
        }
        int k = 0;
        do {
            System.out.println("Hi");
            k = k + 1;
        }
        while (k < 6);
        for(i = 0; i < 6; i = i + 1){
            System.out.println("This is for loop");
        }





    }
}
