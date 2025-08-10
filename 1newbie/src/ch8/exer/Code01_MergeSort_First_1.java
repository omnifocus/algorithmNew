package ch8.exer;

import java.util.Arrays;

public class Code01_MergeSort_First_1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 11, 7, 8, 10, 4, 5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        process(arr,0,arr.length-1);
    }

    private static void merge(int[] arr, int L, int M, int R) {
        int[] helper = new int[R-L+1];
        int i = 0;
        int p1 = L;
        int p2 = M+1;
        while (p1 <= M && p2 <= R) {
            if (arr[p1] <= arr[p2]) {
                helper[i++] = arr[p1++];
            } else {
                helper[i++] = arr[p2++];
            }
        }
        while (p1 <= M) {
            helper[i++] = arr[p1++];
        }
        while (p2 <= R) {
            helper[i++] = arr[p2++];
        }

        for (i=0;i<helper.length;i++) {
            arr[L+i] = helper[i];
        }
    }

    private static void process(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int M = L + ((R-L)>>1);
        process(arr,L,M);
        process(arr,M+1,R);
        merge(arr,L,M,R);
    }



}
