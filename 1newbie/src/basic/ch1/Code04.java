package basic.ch1;

public class Code04 {
    public static void main(String[] args) {
        swap();

    }

    private static void swap() {
        int a = 1;
        int b = 2;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
