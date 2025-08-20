package newbie.ch1.exers;

import java.util.Arrays;

public class Code05_SelectionSort_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,3,5};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        for (int i=0;i<arr.length;i++) {
            int index = i;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[j] > arr[index])  {
                    index = j;
                }
            }
            if (index != i) swap(arr,index,i);
        }
    }

    private static void swap(int[] arr, int i1, int i2) {
        int tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }
}
