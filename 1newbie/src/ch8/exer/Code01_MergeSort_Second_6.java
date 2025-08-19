package ch8.exer;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-an-array/
 * non recursive
 */
public class Code01_MergeSort_Second_6 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,11,7,8,10,4};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int step = 1;
        int L = 0;
        int N = arr.length-1;
        while (step <= N) {
            L= 0;
            while (L < N) {
                int M = 0;
                if (L+step-1 <= N-1) {
                    M = L +  step -1;
                } else {
                    M = N-1;
                }
                if (M == N-1) { break;}
                int R = 0;
                if (M+step <= N-1) {
                    R = M+step;
                } else {
                    R = N-1;
                }
                merge(arr,L,M,R);
                if (R == N-1) break;
                L = R+1;

            }
            if (step <= (N/2)) {
                step *= 2;
            } else {
                break;
            }
        }
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
