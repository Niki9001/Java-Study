package chapter03;

public class Java02_BreakContinue {
    public static void main(String[] args) {
        /*
        TODO: break 关键字直接会跳出循环，不再执行循环的后续操作
              continue  关键字直接会过当前循环，直接执行下一次循环
         */
        for (int i = 0; i < 10; i = i + 1){
            if (i == 4)
                continue;
            if (i == 9)
                break;
            System.out.println(i);

        }
    }
}
