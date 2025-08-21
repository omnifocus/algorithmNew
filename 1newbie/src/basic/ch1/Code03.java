package basic.ch1;

/*
无序数组，相邻不等，找局部最小
 */
public class Code03 {
    public static void main(String[] args) {
        int[] arr = new int[] {13,11,6,4,7,2,8,2,9};
        //老师的方法不对，...findIndex才对
        int index = findIndex2(arr);
        System.out.println(index);
    }

    private static int findIndex(int[] arr) {
        if (arr == null || arr.length <= 0) return -1;
        if (arr.length == 1) return 0;
        if (arr.length == 2) return arr[0] < arr[1] ? 0 : 1;
        int L = 0;
        int R = arr.length-1;
        int index = -1;
        while (L < R-1) {
            int M = L + ((R-L)>>1);
            if (arr[M] < arr[M-1] && arr[M] <arr[M+1]) {
                return M;
            }
            if (arr[M] > arr[M-1]) {
                R = M;
            } else if (arr[M] > arr[M+1]) {
                L = M;
            }
        }
        return arr[L] < arr[R] ? L : R;

    }

    private static int findIndex2(int[] arr) {
        if (arr == null || arr.length <= 0) return -1;
        if (arr.length == 1 || arr[0] < arr[1]) return 0;
        if (arr[arr.length-1] < arr[arr.length-2]) return arr.length-1;
        int L = 1;
        int R = arr.length-2;
        while (L < R) {
            int M = L + ((R-L)>>1);
            if (arr[M] > arr[M-1]) {
                R = M-1;
            } else if (arr[M] > arr[M+1]) {
                L = M+1;
            } {
                return M;
            }
        }
        return L;

    }
}
