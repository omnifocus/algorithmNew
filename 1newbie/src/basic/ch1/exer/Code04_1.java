package basic.ch1.exer;

/**
 * 不用额外变量 交换两个数
 */
public class Code04_1 {
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
