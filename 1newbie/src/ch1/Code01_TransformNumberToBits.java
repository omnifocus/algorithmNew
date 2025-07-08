package ch1;

public class Code01_TransformNumberToBits {
    public static void main(String[] args) {
        int num = 10;
        printInteger(num);
    }

    private static void printInteger(int num) {
        int count = 31;
        while (count >= 0) {
            int tmp = num >> count;
            if ((tmp & 1) == 0) {
                System.out.print(0);
            } else {
                System.out.print(1);
            }
            count --;
        }
        System.out.println();
    }
}
