package newbie.ch8.exer;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-an-array/
 * non recursive
 */
public class Code01_MergeSort_Second {
    public static void main(String[] args) {
        int[] arr = {1,3,2,11,7,8,10,4,5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //TODO
    private static void mergeSort(int[] arr) {
       return;
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
