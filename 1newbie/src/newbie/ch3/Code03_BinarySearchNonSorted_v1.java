package newbie.ch3;

import java.util.Arrays;

/**
 * 数组的元素相邻不等,找出其中一个局部最小值
 * - 同时小于左边元素和右边元素
 * - 如果数组长度为1,则返回0
 * - 如果左边没有元素,默认左边满足条件
 * - 如果右边没有元素,默认右边满足条件
 * <p>
 * 注意两点
 * <p>
 * 1.测试是否满足预设条件的写法
 * 2.如果分到最后剩两个元素时的判断写法
 * 3.生成数组的方法
 */
public class Code03_BinarySearchNonSorted_v1 {
    public static void main(String[] args) {

        int L = 10000;
        for (int i = 0; i < L; i++) {
            int[] arr = null;

            do {
                arr = randomNoConsecutiveSameNumArrV1(10,100);
            } while (arr == null || arr.length <= 1);

            arr = new int[] {9, 6, 8, 5, 4, 2};

            System.out.println(Arrays.toString(arr));
            int index = findEle(arr);

            System.out.println("index:" + index);

            if (arr.length == 1)  {
                if (index != 0) {
                    System.out.println("error!");
                    break;
                }
            }
            if (index == 0) {
                if (arr[index+1] < arr[index] ) {
                    System.out.println("error!");
                    break;
                }
                continue;
            }
            if (index == arr.length-1) {
                if (arr[index-1] < arr[index] ) {
                    System.out.println("error!");
                    break;
                }
                continue;
            }

            if (index == -1) {
                System.out.println("error!");
                break;
            }
            if (!(arr[index-1] > arr[index] && arr[index+1] >arr[index]) ) {
                System.out.println("error!");
                break;
            }

        }

    }

    public static int findEle(int[] arr) {
        if (arr == null || arr.length <= 0)
            return -1;
        int index = -1;
        int L = 0, R = arr.length-1;
        if (arr.length == 1) {
            return 0;
        }
        if (arr.length == 2) {
            if (arr[0] < arr[1]) return 0;
            if (arr[0] > arr[1]) return 1;
        }
        while (L < R-1) {
            int M = (L + R) / 2;
            if (arr[M] < arr[M-1] && arr[M+1] > arr[M]) return M;
            if (arr[M] > arr[M-1]) {
                R = M-1;
                continue;
            }
            if (arr[M] > arr[M+1]) {
                L = M+1;
            }
        }

        index = (L + R) / 2;

        return index;
    }


    public static int[] randomNoConsecutiveSameNumArrV1(int arrLen, int maxVal) {
        int[] arr = new int[(int)(Math.random() * arrLen)];
        int curV = (int)(Math.random() * arrLen);
        for (int i = 0; i <arr.length ; i++) {
            int newV = 0;
            do {
                newV = (int)(Math.random() * arrLen);
                arr[i] = newV;
            } while (newV == curV);
            curV =  newV;
        }
        return arr;
    }


}
