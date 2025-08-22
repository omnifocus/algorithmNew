package newbie.ch8.exer;

import java.util.Arrays;

public class Code02_MergeSort_Second_3 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,11,7,8,10,4,5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int L = 0;
        int N = arr.length-1;
        int step = 0;
        while (step < N) {
            while (L < N) {
                L = 0;
                int M = 0;
                if (L + step -1 <= N-1) {
                    M = L + step -1;
                } else {
                    M = N-1;
                }
                if (M == N-1) break;
                int R = 0;
                if (M + step <= N - 1) {
                    R = M + step;
                } else {
                    R = N-1;
                }
                merge(arr,L,R,N);
                if (R == N-1) {
                    break;
                } else {
                    L = R+1;
                }
            }

            if (step < (N/2)) {
                step *= 2;
            } else {
                break;
            }

        }
    }

    private static void merge(int[] arr, int l, int r, int n) {
    }

}
