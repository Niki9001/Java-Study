package chapter04;

public class Java06_Method {
    public static void main(String[] args) {
        /*
        TODO 面向对象 - 方法
            声明的语法：
                void 方法名() {逻辑代码}
                这里的 【Void】 表示方法的结果：没有结果
                有结果的时候不能用void
                有结果的时候在void的位置写返回结果的类型，比如boolean
                return
            声明的语法（补充）：
                方法的返回值类型 方法名() {逻辑代码}
            方法的调用语法：
            对象.方法名()
         */
        // boolean registerResult = user.register();是通过user.login.var自动生成的，只需要自己加Result
        User02 user = new User02();
        boolean registerResult = user.register();
        if (registerResult){
            System.out.println("Register Successful");
            boolean loginResult = user.login();
            if (loginResult){
                System.out.println("Login successful");
            }
            else {
                System.out.println("Login fail");
            }
        }
        else {
            System.out.println("Register fail");
        }

    }
}
class User02{
    String account;
    String password;
    boolean register(){
        System.out.println("Register");
        return true;
    }
    boolean login(){
        System.out.println("Login");
        return false;
    }
}