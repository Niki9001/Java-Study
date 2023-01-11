package chapter03;

public class Java03_test {
    public static void main(String[] args) {
        int level = 7;
        for (int j = 0; j < level; j ++){
            for (int i = 0; i < (level-1)-j; i++){
            System.out.print(" ");}
            for (int i = 0; i < j * 2 + 1;i = i + 1){
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
/*
System.out.print(" ")
和
System.out.println(" ")
是不同的，print是不换行的
println是换行的
 */