package ch8;

import java.util.Arrays;

public class Code02_QuickSort_Second {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 2, 11, 7, 8, 10, 4, 5, 3, 6};
//        int[] arr = {2,0,2,1,1,0};
        int[] arr = {1,3,2,4,5,6,3,2,4};
        int[] res = quickSortMy(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }
    private static int[] quickSortMy(int[] nums) {
        if (nums == null || nums.length < 2) return null;
        int li = -1;
        int ri = nums.length - 1;
        int target = nums[nums.length-1];
        // 就应该是 <= 再跑一次逻辑 ，以便确定最终边界
        for (int i = 0; i <= ri && i < nums.length; ) {
            if (nums[i] < target) {
                li++;
                swap(nums, li, i);
                i++;
            } else if (nums[i] > target) {
                swap(nums, i, ri);
                ri--;
            } else {
                i++;
            }
        }
        return new int[]{li+1,ri-1};
    }



    /**
     * 为什么先从最后一个地方交换就不行？
     * @param nums
     */
    private static void quickSort(int[] nums) {
//        if (nums == null || nums.length < 2) return;
//        int li = -1;
//        int ri = nums.length - 1;
//        int target = 1;
//        for (int i = 0; i <= ri && i < nums.length; ) {
//            if (nums[i] < target) {
//                li++;
//                swap(nums, li, i);
//                i++;
//            } else if (nums[i] > target) {
//                swap(nums, i, ri);
//                ri--;
//            } else {
//                i++;
//            }
//        }
        if (nums == null || nums.length < 2) return;
        int li = -1;
        int ri = nums.length - 1;
        int target = 1;
        for (int i = 0; i != ri && i < nums.length; ) {
            if (nums[i] < target) {
                li++;
                swap(nums, li, i);
                i++;
            } else if (nums[i] > target) {
                swap(nums, i, --ri);
            } else {
                i++;
            }
        }
        swap(nums, nums.length - 1, ri);

    }

    private static void quickSort2(int[] nums) {
        int N = nums.length;
        int lessR = -1;
        int moreL = N - 1;
        int index = 0;
        int target = 1;
        while (index < moreL) {
            if (nums[index] < target) {
                swap(nums, ++lessR, index++);
            } else if (nums[index] > target) {
                swap(nums, --moreL,index);
            } else {
                index++;
            }
        }
        swap(nums,moreL,N-1);
    }


        private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
