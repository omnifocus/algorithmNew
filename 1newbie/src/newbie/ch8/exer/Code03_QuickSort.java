package newbie.ch8.exer;

import java.util.Arrays;

/**
 * put numbers less or equal than P to left, others to right
 * last number is pivoted
 */
public class Code03_QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,11,7,8,10,4,5,3,6};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //TODO
    private static void quickSort(int[] arr) {

    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
