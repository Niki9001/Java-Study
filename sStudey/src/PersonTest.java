public class PersonTest {
    public static void main(String[] args){
        Person p2 = new Person();
        p2.name="yu";
        p2.age=48;
        p2.gender='m';
        System.out.println(p2.gender);
        p2.eat();
        p2.sleep(8);
        p2.interests("drinking");

    }


}
