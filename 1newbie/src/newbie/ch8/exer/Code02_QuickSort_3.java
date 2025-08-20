package newbie.ch8.exer;

import java.util.Arrays;

/**
 * put numbers less or equal than P to left, others to right
 * last number is pivoted
 */
public class Code02_QuickSort_3 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,11,7,8,10,4,5,3,6};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int li = -1;
        int i = 0;
        int target = arr[arr.length-1];
        while (i < arr.length) {
            if (arr[i] <= target) {
                swap(arr,++li,i++);
            } else {
                i++;
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
