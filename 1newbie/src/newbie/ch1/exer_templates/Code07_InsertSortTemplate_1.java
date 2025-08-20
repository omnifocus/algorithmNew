package newbie.ch1.exer_templates;

import java.util.Arrays;

public class Code07_InsertSortTemplate_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,3,5};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        for (int i=1;i<arr.length-1;i++) {
            int end = i;
          while (i>0 && arr[i-1] > arr[i]) {
              swap(arr,i,i-1);
              i--;
          }
        }
    }

    private static void swap(int[] arr, int j, int k) {
        int tmp = arr[j];
        arr[j] = arr[k];
        arr[k] = tmp;
    }

}
