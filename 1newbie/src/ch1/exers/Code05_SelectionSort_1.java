package ch1.exers;

import java.util.Arrays;

public class Code05_SelectionSort_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,3,5};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
