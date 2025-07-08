package ch3;

import ch1.Code06_BubbleSort;
import ch2.Code01_Comparator;

import java.util.Arrays;

public class Code02_BinarySearchFindNumLeftMax {
    public static void main(String[] args) {

        int L = 10000;
        for (int i = 0; i < L; i++) {
            int[] arr = null;

            do {
                arr = Code01_Comparator.randomNoRedundantArr(10,100);
            } while (arr == null || arr.length <= 1);

            arr = new int[] {20, 25, 28, 32, 64, 69, 74, 81};

            Code06_BubbleSort.bubbleSort(arr);
            System.out.println(Arrays.toString(arr));
            int toFind = arr[(int)(Math.random() * arr.length)];
            toFind = 33;
            System.out.println("toSearch : " + toFind );
            if ( findEle(arr,toFind) != binarySerach(arr,toFind)) {
                System.out.println("error !!!!--------------------------------");
                break;
            }

        }

    }

    public static int findEle(int[] arr, int ele) {
        if (arr == null || arr.length <= 0)
            return -1;
        int index = -1;
        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i] >= ele) {
                index = i;
            }
        }
        return index;
    }


    public static int binarySerach(int[] arr,int toFind) {
        if (arr == null || arr.length <=0) return -1;
        int L = 0;
        int R = arr.length-1;
        int index = -1;
        while (L <= R) {
            int M = (L + R) >> 1;
            if (arr[M] >= toFind) {
                index = M;
                R = M-1;
            }
            if (arr[M] < toFind) {
                L = M+1;
            }
        }
        System.out.println(index);
        return index;

    }
}
