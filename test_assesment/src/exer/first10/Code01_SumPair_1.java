package exer.first10;

import java.util.Arrays;

public class Code01_SumPair_1 {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 5, 8, 1, 2};
        int k = 13;
        int[] arr =  findSumPair(numbers,k);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] findSumPair(int[] numbers, int k) {
        int[] arr = new int[]{0,0};
        for (int i=0;i<numbers.length;i++) {
            for (int j=1;j<numbers.length;j++) {
                if (numbers[i] + numbers[j] == k) {
                    arr = new int[] {i,j};
                    return arr;
                }
            }
        }
        return arr;
    }
}
