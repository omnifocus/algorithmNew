package ch1;

import java.util.Arrays;
// 为什么叫插入排序？ 跟打牌一样
public class Code07_InsertSort {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,3,5};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
//        for (int i=0;i<arr.length;i++) {
//            for (int j=i-1;j>=0;j--) {
//                if (arr[j] <= arr[j+1]) {
//                   break;
//                }
//                swap(arr,j,j+1);
//            }
//        }

        // --  手里有一张牌，一开始的位置就是1

        for (int end = 1; end < arr.length; end ++) {
            int newEndIndex = end;
            while (newEndIndex -1 >= 0  && arr[newEndIndex-1] > arr[newEndIndex]) {
                swap(arr,newEndIndex,newEndIndex-1);
                newEndIndex--;
            }
        }

    }



    public static void insertSort2(int[] arr) {

        if (arr == null || arr.length <= 1) return;
        for (int i=1;i<arr.length;i++) {
            for (int j=i-1; j >= 0 && arr[j] > arr[j+1]; j--) {
                swap(arr,j,j+1);
            }
        }

    }

        private static void swap(int[] arr, int j, int k) {
        int tmp = arr[j];
        arr[j] = arr[k];
        arr[k] = tmp;
    }

}
