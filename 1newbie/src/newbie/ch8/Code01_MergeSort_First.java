package newbie.ch8;

import java.util.Arrays;

public class Code01_MergeSort_First {
    public static void main(String[] args) {
        int[] arr = {1,3,2,11,7,8,10,4,5};
        mergeSort(arr);
    }

    private static void mergeSort(int[] arr) {
        if (arr == null) return;
//        int L = 0, R = arr.length-1;
//        int M = R - ((R-L)>>1);
//        int[] left = process(arr,L,M);
//        int[] right = process(arr,M,R);
        int[] newarr = process(arr,0,arr.length-1);
        System.out.println(Arrays.toString(newarr));

    }

    private static void merge(int[] left, int[] right) {
    }

    private static int[] process(int[] arr, int l, int r) {
        if (l == r)  return new int[]{arr[l]};
        int m = r - ((r-l)>>1);
        int[] left = process(arr,l,m-1);
        int[] right = process(arr,m,r);
        int[] helper = new int[left.length + right.length];
        int li = 0;
        int ri = 0;
        int i = 0;
        for (;i<helper.length && li < left.length && ri < right.length;) {
            if (left[li] <= right[ri]) {
                helper[i++] = left[li++];
            }else {
                helper[i++] = right[ri++];
            }
        }

        for (; li<left.length;) {
            helper[i++] = left[li++];
        }

        for (;ri<right.length;) {
            helper[i++] = right[ri++];
        }

        return helper;
    }
}
