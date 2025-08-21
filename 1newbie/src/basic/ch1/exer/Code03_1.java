package basic.ch1.exer;

/*
无序数组，相邻不等，找局部最小
 */
public class Code03_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 11, 6, 4, 7, 2, 8, 2, 9};
        //老师的方法不对，...findIndex才对
        int index = findIndex(arr);
        System.out.println(index);
    }

    private static int findIndex(int[] arr) {
        if (arr == null || arr.length <= 0) return -1;
        int L = 0;
        int R = arr.length - 1;
        while (L < R - 1) {
            int M = L + ((R - L) >> 1);
            if (arr[M] < arr[M - 1] && arr[M] < arr[M + 1]) {
                return M;
            }
            if (arr[M] > arr[M - 1]) {
                R = M;
            } else if (arr[M] > arr[M + 1]) {
                L = M;
            }
        }
        return arr[L] < arr[R] ? L : R;
    }


}
