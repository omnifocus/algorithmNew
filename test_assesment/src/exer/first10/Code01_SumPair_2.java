package exer.first10;

import java.util.Arrays;

public class Code01_SumPair_2 {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 5, 8, 1, 2};
        int k = 13;
        int[] arr =  findSumPair(numbers,k);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] findSumPair(int[] numbers, int k) {
        int[] arr = new int[]{0,0};
       if (numbers == null || numbers.length <= 1) return arr;
       for (int i=0;i<numbers.length;i++) {
           for (int j=i+1;j<numbers.length;j++) {
               if (numbers[i] + numbers[j] == k) return new int[]{i,j};
           }
       }
       return arr;
    }
}
