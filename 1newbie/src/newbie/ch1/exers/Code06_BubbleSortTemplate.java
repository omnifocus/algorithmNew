package newbie.ch1.exers;

import java.util.Arrays;

public class Code06_BubbleSortTemplate {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,3,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {

    }

    private static void swap(int[] arr, int j, int k) {
        int tmp = arr[j];
        arr[j] = arr[k];
        arr[k] = tmp;
    }

}
