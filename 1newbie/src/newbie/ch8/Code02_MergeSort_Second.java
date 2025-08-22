package newbie.ch8;

import java.util.Arrays;

public class Code02_MergeSort_Second {
    public static void main(String[] args) {
        int[] arr = {1,3,2,11,7,8,10,4,5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        if (arr == null) return;
        int step = 1;
        int N = arr.length-1;
        while (step < N) {
            int L = 0;
//            为什么不等于N？ L=N时，就只有一个元素，不需要merge了
            while (L < N) {
                int M = 0;
                if (N - L >= step) {
                    M = L + step -1;
                } else {
                    M = N-1;
                }
                if (M == N-1) {
                    break;
                }
                int R = 0;
                if (N-1-M >= step) {
                    R = M + step;
                } else {
                    R = N - 1;
                }
                merge(arr,L,M,R);
                if (R == N-1) {
                    break;
                } else {
                    L = R + 1;
                }
            }
            if (step > (N /2 )) {
                break;
            } else {
                step *= 2;
            }
        }
    }

    private static void merge(int[] left, int L ,int M , int R) {
    }


}
