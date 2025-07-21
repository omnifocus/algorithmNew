package ch5.exer;

/**
 *
 */
public class Code05_binaryMockDivisitonPlain {
    public static void main(String[] args) {
        int a = 46;
        int b = 20;
        System.out.println(divide(a, b));


    }

    //TODO
    private static int divide(int a, int b) {

        return -1;
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

    private static int neg(int a) {
        return  ~a + 1;
    }

    private static int sub(int a, int b) {
        return add(a, neg(b));
    }

    private static int multiply(int a, int b) {
        int res = 0;
        while (b != 0) {
            if ( (b & 1) != 0) {
                res = add(res,a);
            }
            b >>>= 1;
            a <<= 1;
        }
        return res;
    }


}
