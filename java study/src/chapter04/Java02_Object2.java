package chapter04;

public class Java02_Object2 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Black";
        cat.run();
        Animal dog = new Animal();
        dog.name = "White";
        dog.behavior = "Run fast";
        dog.why = "Finding something new";
        dog.run();
    }
}
class Animal{
    String name;
    String behavior = "Run";
    String why = "Seeing Me";
    void run(){
        System.out.println(name);
        System.out.println(behavior);
        System.out.println("Because of "+why);
    }
}

