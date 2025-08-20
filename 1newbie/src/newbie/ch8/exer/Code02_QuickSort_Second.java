package newbie.ch8.exer;

import java.util.Arrays;

/**
 * hhttps://leetcode.com/problems/sort-colors/
 * target改为1
 */
public class Code02_QuickSort_Second {
    public static void main(String[] args) {
        int[] arr = {1,3,2,11,7,8,10,4,5,3,6};
        quickSort(arr,7);
        System.out.println(Arrays.toString(arr));
    }
    //TODO
    private static void quickSort(int[] arr, int leN) {

    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
