package basic.ch1;

/**
 * 提取出整数最后面的1，其他位置0
 */
public class Code06 {
    public static void main(String[] args) {
        int i = 100;

        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(change(i)));
    }

    private static int change(int i) {
        return (i & ((~i)+1));
    }

}
