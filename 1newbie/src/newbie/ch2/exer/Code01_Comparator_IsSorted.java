package newbie.ch2.exer;

import newbie.ch2.Code01_Comparator_RandomArray;

import java.util.Arrays;

public class Code01_Comparator_IsSorted {

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int[] arr = Code01_Comparator_RandomArray.genRandomArray(20, 8);
            Arrays.sort(arr);
            if (!isSorted(arr)) {
                System.out.println("false!");
            }
        }
    }

    // TODO
    public static boolean isSorted(int[] arr) {
        return false;
    }
}
