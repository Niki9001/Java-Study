public class FieldTest {
    public static void main(String[] args){


    }
}
class Person1{
    //属性或成员变量（field）
    String name;
    int age;
    char gender;
    public void eat(){
        String food = "Chicken"; //局部变量
        System.out.println("i like eat "+food);
    }
    public void sleep(int hours /*形参：属于局部变量*/){
        System.out.println("Human should sleep for at least "+hours);
    }
}