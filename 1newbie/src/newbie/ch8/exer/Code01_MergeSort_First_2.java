package newbie.ch8.exer;

import java.util.Arrays;

public class Code01_MergeSort_First_2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 11, 7, 8, 10, 4, 5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        process(arr, 0,  arr.length-1);

    }

    private static void process(int[] arr, int L,int R) {
        if (L == R) return;
        int M = L + ((R-L)>>1);
        process(arr,L,M);
        process(arr,M+1,R);
        merge(arr,L,M,R);

    }

    private static void merge(int[] arr, int L, int M, int R) {
        int[] newarr = new int[R-L+1];
        int newi = 0;
        int li = L;
        int ri = M+1;
        for (;li <= M && ri <= R;) {
            if (arr[li] <= arr[ri])
            newarr[newi++] = arr[li++];
            else
                newarr[newi++] = arr[ri++];
        }

        while (li <= M) {
            newarr[newi++] = arr[li++];
        }
        while (ri <= R) {
            newarr[newi++] = arr[ri++];
        }

        for (int i=0;i<newarr.length;i++) {
            arr[L+i] = newarr[i];
        }
    }


}
