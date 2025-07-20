package ch5;

/**
 *
 */
public class Code04_binaryMockMultiplilcation_Teacher {
    public static void main(String[] args) {
        int a = 46;
        int b = 20;
        System.out.println(multiply(a, b));


    }

    private static int multiply(int a, int b) {
        int res = 0;
        while (b != 0) {
            if ((b & 1) != 0) {
                res = add(res, a);
            }
            b >>>= 1;
            a <<= 1;
        }
        return res;
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
