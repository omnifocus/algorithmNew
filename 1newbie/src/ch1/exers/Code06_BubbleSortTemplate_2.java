package ch1.exers;

import java.util.Arrays;

public class Code06_BubbleSortTemplate_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,3,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        for (int i = arr.length-1; i>=1;i--) {
            for (int j=0;j<i;j++) {
                if (arr[j] > arr[j+1]) swap(arr,j,j+1);
            }
        }
    }

    private static void swap(int[] arr, int j, int k) {
        int tmp = arr[j];
        arr[j] = arr[k];
        arr[k] = tmp;
    }

}
