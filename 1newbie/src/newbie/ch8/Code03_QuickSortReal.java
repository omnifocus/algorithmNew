package newbie.ch8;

import java.util.Arrays;

/**
 https://leetcode.com/problems/sort-an-array/
 */
public class Code03_QuickSortReal {
    public static void main(String[] args) {
        int[] arr = {1,3,2,11,7,8,10,4,5,3,6};
//        int[] arr = {1,3};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        process(arr,0,arr.length-1);
    }

    private static void process(int[] arr,int L, int R) {
        if (L >= R) return;
        int[] partitionedArr = sort(arr,L,R);
        process(arr,L,partitionedArr[0]-1);
        process(arr,partitionedArr[1] + 1, R);
    }

    private static int[] sort(int[] arr, int L ,int R) {
        int li = L-1;
        int ri = R;
        int target = arr[R];
        int i = L;
        while (i <= ri) {
            if (arr[i] < target) {
                swap(arr,++li,i++);
            } else if (arr[i] > target) {
                swap(arr,ri--,i);
            } else {
                i++;
            }
        }
        return new int[]{li+1,ri-1};
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
