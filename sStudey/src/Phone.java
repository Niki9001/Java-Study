public class Phone {
    //field属性
    //TODO：调用属性需要打印
    String name;
    double price;
    //method方法
    //TODO：调用方法不需要打印，直接对象.方法
    public void call(){
        System.out.println("phone can call");
    }
    public void sendMessage(String message){
        System.out.println("send message"+message);
    }
    public void playGame(){
        System.out.println("Phone can play game");
    }
}

