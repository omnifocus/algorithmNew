package ch1.exers;

/**
 * 1! + 2! + 3! + 4! + ...
 */
public class Code04_factorialSum_1 {

    public static void main(String[] args) {
        int n = 1600;
        long start = System.currentTimeMillis();
        long v1 = fac1(n);
        long end = System.currentTimeMillis();

        System.out.println("算法1耗时ms:" + (end-start) + ", 值为：" + v1 );

         start = System.currentTimeMillis();
         long v2 =   fac2(n);
         end = System.currentTimeMillis();

        System.out.println("算法2耗时ms:" + (end-start) +  ", 值为：" + v1);
    }

    private static long every_fac(int i) {
        if (i == 1) return 1;
        return every_fac(i-1) * i;
    }

    private static long fac1(int n) {
        long sum = 0;
        for (int i=1;i<=n;i++) {
            sum += every_fac(i);
        }
        return sum;
    }
    // TODO
    private static long fac2(int j) {
       long sum = 0L;
       long curVal = 1L;
       for (int i=1;i<=j;i++) {
           curVal *= i;
           sum += curVal;
       }
       return sum;
    }
}
