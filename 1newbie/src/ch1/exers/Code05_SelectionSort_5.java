package ch1.exers;

import java.util.Arrays;

public class Code05_SelectionSort_5 {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,3,5};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        for (int i=0;i<arr.length;i++) {
            int cur = i;
            for (int j=i+1;j<arr.length;j++) {
                cur = arr[j] < arr[cur] ? j: cur;
            }
            if (cur != i) {
                swap(arr,cur,i);
            }
        }
    }
    private static void swap(int[] arr, int j, int k) {
        int tmp = arr[j];
        arr[j] = arr[k];
        arr[k] = tmp;
    }
}
