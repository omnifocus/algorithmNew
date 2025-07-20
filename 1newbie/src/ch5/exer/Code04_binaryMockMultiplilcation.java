package ch5.exer;

public class Code04_binaryMockMultiplilcation {
    public static void main(String[] args) {
        int a = 46;
        int b = 20;
        System.out.println(multiply(a, b));


    }

    // TODO
    private static int multiply(int a, int b) {
        return 0;
    }


    private static int add(int a, int b) {
        int sum = a;
        while (b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;
    }
}
