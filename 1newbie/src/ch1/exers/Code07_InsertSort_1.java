package ch1.exers;

import java.util.Arrays;

// 为什么叫插入排序？ 跟打牌一样
public class Code07_InsertSort_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 4, 3, 5};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j >= 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }


    private static void swap(int[] arr, int j, int k) {
        int tmp = arr[j];
        arr[j] = arr[k];
        arr[k] = tmp;
    }

}
