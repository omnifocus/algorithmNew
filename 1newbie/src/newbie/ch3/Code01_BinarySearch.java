package newbie.ch3;

import newbie.ch1.Code06_BubbleSort;
import newbie.ch2.Code01_Comparator;

public class Code01_BinarySearch {
    public static void main(String[] args) {

        int L = 10000;
        for (int i = 0; i < L; i++) {
            int[] arr = null;

            do {
                arr = Code01_Comparator.randomNoRedundantArr(16,100);
            } while (arr == null || arr.length <= 1);



            Code06_BubbleSort.bubbleSort(arr);
//            System.out.println(Arrays.toString(arr));
            int toFind = arr[(int)(Math.random() * arr.length)];
//            System.out.println("toSearch : " + toFind );
            if ( findEle(arr,toFind) != binarySerach(arr,toFind)) {
                System.out.println("error !!!!--------------------------------");
                break;
            }

        }

    }

    public static int findEle(int[] arr, int ele) {
        if (arr == null || arr.length <= 0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) return i;
        }
        return -1;
    }


    public static int binarySerach(int[] arr,int toFind) {
        if (arr == null || arr.length <=0) return -1;
        int L = 0;
        int R = arr.length-1;
        while (L <= R) {
            int M = (L + R) >> 1;
            if (arr[M] == toFind) return M;
            if (arr[M] > toFind) {
                R = M-1;
            }
            if (arr[M] < toFind) {
                L = M+1;
            }
        }
        return -1;

    }
}
