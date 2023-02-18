public class Main {
    public static void main(String[] args) {
        // 精度损失，截断
        double d1 = 12.9;
        int i4 = (int) d1;
        System.out.println(i4);
        // 精度损失，二进制问题
        int i1 = 128;
        byte b1 = (byte) i1;
        System.out.println(b1);
    }
}