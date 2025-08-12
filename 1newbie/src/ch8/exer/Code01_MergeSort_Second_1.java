package ch8.exer;

import java.util.Arrays;

public class Code01_MergeSort_Second_1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 11, 7, 8, 10, 4, 5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        process(arr);
    }

    private static void process(int[] arr) {
        int L = 0;
        int N = arr.length - 1;
        int step = 1;
        while (step < N) {
            L = 0;
            while (L < N) {
                int M;
                if ((N - 1) > (L + step - 1)) {
                    M = L + step - 1;
                } else {
                    M = N - 1;
                }
                if (M == N - 1) break;
                int R;

//                if ((N - 1) > (L + step + 1)) {
                if (N-1-M >= step) {
                    R = L + step + 1;
                } else {
                    R = N - 1;
                }
                merge(arr, L, M, R);
                if (R == N - 1) {
                    break;
                }

            }
            if (step < (N/2)) {
                step *= 2;
            } else {
//                step = N;
                break;
            }
        }
    }

    private static void merge(int[] arr, int L, int M, int R) {

    }

}
