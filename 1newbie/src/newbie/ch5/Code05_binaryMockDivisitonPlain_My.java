package newbie.ch5;

/**
 *
 */
public class Code05_binaryMockDivisitonPlain_My {
    public static void main(String[] args) {
        int a = 46;
        int b = 2;
        System.out.println(divide(a, b));


    }

    private static int divide(int a, int b) {
        boolean flag = (a ^ b) >= 0 ;
       a = a < 0 ? neg(a): a;
       b = b < 0 ? neg(b): b;
       int res = 0;
       for (int i=31;i>=0;i=sub(i,1)) {
           if ((a>>i) >= b) {
               res |= (1<<i);
               a = sub(a, b<<i);
           }
       }
       return flag? res:neg(res);

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
