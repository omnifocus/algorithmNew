package newbie.ch2;

import java.util.Arrays;

public class Code01_Comparator_IsSorted {

    public static void main(String[] args) {
        for (int i=0;i<10000;i++) {
            int[] arr = Code01_Comparator_RandomArray.genRandomArray(20, 8);
            Arrays.sort(arr);
            if (!isSorted(arr)) {
                System.out.println("false!");
            }
        }
    }

    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length <= 1) return true;
        int curValue = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (curValue > arr[i]) return false;
            curValue = arr[i];
        }
        return true;
    }
}
