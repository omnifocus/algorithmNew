package ch5;
/**
 * no need to iterate 1 through 31
 */
public class Code04_binaryMockMultiplilcation_My {
    public static void main(String[] args) {
        int a = 46;
        int b = 20;
        System.out.println(multiply(a, b));


    }

    private static int multiply(int a, int b) {
        // no need
        int res = (b & 1) == 0 ? 0 : a ;
        while (b != 0) {
            // no need
            for (int i = 1; i <= 31; i++) {
                b >>>= 1;
                if ((b & 1) != 0) {
                    res = add(res,(a << i)) ;
                }
            }
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
