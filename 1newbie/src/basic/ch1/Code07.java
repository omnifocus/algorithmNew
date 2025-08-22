package basic.ch1;

/**
 * 只有两种数出现奇数次，其他数出现偶数次， 求出这种数
 */
public class Code07 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 2, 3, 4, 5};
        findNumbers(arr);
    }

    //TODO
    private static void findNumbers(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        int findOneBit = xor ^ ((~xor) + 1);
        int oneNumber = 0;

        for (int i=0;i<arr.length;i++) {
            if ((findOneBit & arr[i]) != 0) {
                oneNumber ^= arr[i];
            }
        }

        System.out.println("one:" + oneNumber + ", another:" + (xor ^ oneNumber));
    }


}
