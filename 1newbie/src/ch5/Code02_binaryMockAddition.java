package ch5;

public class Code02_binaryMockAddition {
    public static void main(String[] args) {
//        int a  = 46;
//        int b = 20;
//        System.out.println(plus(a,b));

        long a =  1224324323467687781L;
        long b =  789324389766768778L;
        long start = System.nanoTime();
        long c = plus(a,b);
        long end = System.nanoTime();
        System.out.println("duration: " + (end - start) + " ns" );

        System.out.println("--------------------------------");

        start = System.nanoTime();
        long d = a + b;
        end = System.nanoTime();
        System.out.println("duration: " + (end - start) + " ns" );

    }

    private static long plus(long a, long b) {
        long res = a;
       while ( b != 0) {
           res = a ^ b;
           b = (a & b) << 1;
           a = res;

       }
       return res;
    }
}
