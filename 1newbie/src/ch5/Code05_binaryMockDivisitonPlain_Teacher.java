package ch5;

/**
 *     use  boolean ^ boolean  1
 */
public class Code05_binaryMockDivisitonPlain_Teacher {
    public static void main(String[] args) {
        int a = 46;
        int b = 2;
        System.out.println(divide(a, b));


    }
    // use  boolean ^ boolean  1
    private static int divide(int a, int b) {
       int x = isNeg(a) ? neg(a): a;
       int y = isNeg(b) ? neg(b): b;
       int res = 0;
       for (int i=31;i>=0;i=sub(i,1)) {
           if ((x>>i) >= y) {
               res |= (1<<i);
               x = sub(x, y<<i);
           }
       }
       return isNeg(a) ^ isNeg(b)? neg(res):res;

    }

    private static boolean isNeg(int a) {
        return a < 0;
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
