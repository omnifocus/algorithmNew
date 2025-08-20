package newbie.ch3;

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
public class Code03_BinarySearchNonSorted_v2 {
    public static void main(String[] args) {

        int L = 10000;
        for (int i = 0; i < L; i++) {
            int[] arr = randomNoConsecutiveSameNumArrV2(10, 100);
            int index = findEle(arr);
            if (!pass(arr, index)) {
                System.out.println("error");
                break;
            }

        }

    }

    private static int[] randomNoConsecutiveSameNumArrV2(int arrMaxLen, int maxVal) {
        int[] arr = new int[(int)(arrMaxLen * Math.random())];
        if (arr == null || arr.length == 0) return arr;
        arr[0] = (int)(Math.random() * maxVal);
        for (int i=1;i<arr.length;i++) {
            do {
                arr[i] = (int)(Math.random() * maxVal);
            } while (arr[i] == arr[i-1]);
        }
        return arr;
    }

    public static int findEle(int[] arr) {
        if (arr == null || arr.length <= 0)
            return -1;
        int index = -1;
        int L = 0, R = arr.length - 1;
        if (arr.length == 1) {
            return 0;
        }
        if (arr.length == 2) {
            if (arr[0] < arr[1]) return 0;
            if (arr[0] > arr[1]) return 1;
        }
        while (L < R - 1) {
            int M = (L + R) / 2;
            if (arr[M] < arr[M - 1] && arr[M + 1] > arr[M]) return M;
            if (arr[M] > arr[M - 1]) {
                R = M - 1;
                continue;
            }
            if (arr[M] > arr[M + 1]) {
                L = M + 1;
            }
        }

//        index = (L + R) / 2;
        // 精妙之处: 最后的两个,必定一个满足条件!
        if (arr[L] < arr[R]) index = L;
        else index = R;

        return index;
    }


    // 好处在于 不用单独判断一个元素 两个元素的情况
    public static boolean pass(int[] arr, int index) {
        if (arr == null || arr.length == 0) return true;
        boolean leftBigger = index > 0 ? arr[index - 1] > arr[index] : true;
        boolean rightBigger = index < arr.length - 1 ? arr[index + 1] > arr[index] : true;
        return leftBigger && rightBigger;
    }


}
