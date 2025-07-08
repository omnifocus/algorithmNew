package ch1;

import java.util.Arrays;

public class Code06_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,3,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        for (int j=arr.length-1;j>0;j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int k) {
        int tmp = arr[j];
        arr[j] = arr[k];
        arr[k] = tmp;
    }

}
