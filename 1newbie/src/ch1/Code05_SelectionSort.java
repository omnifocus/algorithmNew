package ch1;

import java.util.Arrays;

public class Code05_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,3,5};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        int N = arr.length;
        for (int i=0;i<N;i++) {
            int minIndex = i;
            for(int j=i+1;j<N;j++) {
                minIndex = arr[minIndex] > arr[j] ? j : minIndex;
            }
            if (minIndex != i)
                swap(arr,minIndex,i);

        }
    }

    private static void swap(int[] arr, int j, int k) {
        int tmp = arr[j];
        arr[j] = arr[k];
        arr[k] = tmp;
    }

}
