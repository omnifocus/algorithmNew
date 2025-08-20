package newbie.ch1;

/**
 * 1.使用for循环
 * 2.无需使用中间值 （移动1而非num）
 */
public class Code01_TransformNumberToBits_Refine {
    public static void main(String[] args) {
        int num = -1;
        printInteger(num);
        System.out.println(Integer.toUnsignedString(num,2));
    }

    private static void printInteger(int num) {
        for (int i = 31; i >= 0 ; i--) {
            System.out.print( (num & (1<<i)) == 0 ? "0":"1");
        }
        System.out.println();
    }
}
