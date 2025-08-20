package newbie.ch1.exers;

import java.util.Arrays;

public class Code05_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,3,5};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //TODO
    private static void selectSort(int[] arr) {

    }
    private static void swap(int[] arr, int j, int k) {
        int tmp = arr[j];
        arr[j] = arr[k];
        arr[k] = tmp;
    }
}
