package newbie.ch1.exer_templates;

import java.util.Arrays;

public class Code07_InsertSortTemplate {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,3,5};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
        insertSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {

    }


    private static void insertSort2(int[] arr) {

    }

    private static void swap(int[] arr, int j, int k) {
        int tmp = arr[j];
        arr[j] = arr[k];
        arr[k] = tmp;
    }

}
