package newbie.ch5;

public class Code03_binaryMockSubtarction {
    public static void main(String[] args) {
        int a = 46;
        int b = 20;
        System.out.println(subtract(a, b));


    }

    private static int subtract(int a, int b) {
        return add(a, neg(b));
    }

    private static int neg(int b) {
        return add(~b,1);
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
