package ch5.exer;

public class Code03_binaryMockSubtarction_1 {
    public static void main(String[] args) {
        int a = 46;
        int b = 20;
        System.out.println(subtract(a, b));


    }

    private static int subtract(int a, int b) {

        return plus(a, neg(b));
    }

    private static int neg(int b) {
        return ~b + 1;
    }


    private static int plus(int a, int b) {
        int sum = a;
        while (b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;
    }
}
