package ch8.exer;

import java.util.Arrays;

/*
https://leetcode.cn/problems/sort-an-array/
 */
public class Code01_MergeSort_First_4 {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        process(arr,0,arr.length-1);
    }

    private static void process(int[] arr, int L, int R) {
        if (L == R) return;
        int M = L + ((R-L)>>1);
        process(arr,L,M);
        process(arr,M+1,R);
        merge(arr,L,M,R);
    }

    private static void merge(int[] arr, int L, int M, int R) {
        int[] helper = new int[R-L+1];
        int li = L;
        int ri = M+1;
        int hi = 0;
        while (li<=M && ri <=R) {
            if (arr[li] <= arr[ri]) {
                helper[hi++] = arr[li++];
            } else {
                helper[hi++] = arr[ri++];
            }
        }
        while (li <= M) {
            helper[hi++] = arr[li++];
        }
        while (ri <= R) {
            helper[hi++] = arr[ri++];
        }
        for (int i=0;i<helper.length;i++) {
            arr[L+i] = helper[i];
        }
    }

}
