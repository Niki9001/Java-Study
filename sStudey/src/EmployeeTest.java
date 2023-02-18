public class EmployeeTest {
    public static void main(String[] args){
        Employee ep = new Employee();
        ep.name="zhangsan";
        ep.EmployeeID = 01;
        ep.age=30;
        ep.salary=2550.5;
        MyDate md = new MyDate();
        md.day=01;
        md.month=01;
        md.year=2000;

        System.out.println(ep.name+md.year+md.month+md.day);
        //ep.birthday(2002,01,01);



    }

}
