package ch2.exer;

import ch2.Code01_Comparator_RandomArray;

import java.util.Arrays;

public class Code01_Comparator_IsSorted_1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int[] arr = Code01_Comparator_RandomArray.genRandomArray(20, 8);
            Arrays.sort(arr);
            if (!isSorted(arr)) {
                System.out.println("false!");
            }
        }
    }

    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length <= 1) return true;
        int cur = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (cur > arr[i]) {
                return false;
            }
            cur = arr[i];
        }
        return true;
    }
}
