import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args){
        //创建Phone的对象
        Phone p1 =new Phone();
        //通过Phone的对象，调用其内部声明的属性和方法
        //格式："对象.属性" 或 "对象.方法"
        p1.name="Huawei mate50";
        p1.price=6999;
        System.out.println(p1.name+p1.price);
        //调用方法：
        p1.call();
        p1.sendMessage("xxxxx");
        p1.playGame();


    }
}
