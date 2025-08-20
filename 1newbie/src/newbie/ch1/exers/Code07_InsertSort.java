package newbie.ch1.exers;

import java.util.Arrays;

// 为什么叫插入排序？ 跟打牌一样
public class Code07_InsertSort {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,3,5};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //TODO
    public static void insertSort(int[] arr) {

    }




    private static void swap(int[] arr, int j, int k) {
        int tmp = arr[j];
        arr[j] = arr[k];
        arr[k] = tmp;
    }

}
