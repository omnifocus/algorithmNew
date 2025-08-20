package newbie.ch5;

/**
 *https://leetcode.com/problems/divide-two-integers/submissions/1707497159/
 */
public class Code06_binaryMockDivisitonSpecial {
    public static void main(String[] args) {
        int a = 46;
        int b = 2;
//        System.out.println(divide(a, b));


    }

    public  int divide(int a, int b) {
        if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE) {
            return 1;
        } else if (b == Integer.MIN_VALUE) {
            return 0;
        } else if (a == Integer.MIN_VALUE) {
            if (b == -1) return Integer.MAX_VALUE;
            int a1 = a + 1;
            int res = div(a1,b);
            return add(res,div(sub(a,multiply(div(a1,res),a1)),b));
        } else {
            return div(a,b);
        }
    }


    public  int div(int a, int b) {
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

    public  boolean isNeg(int a) {
        return a < 0;
    }

    public  int add(int a, int b) {
        int sum = a;
        while (b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;
    }

    public  int neg(int a) {
        return  ~a + 1;
    }

    public  int sub(int a, int b) {
        return add(a, neg(b));
    }

    public  int multiply(int a, int b) {
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
