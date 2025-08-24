package basic.ch1.exer;

/*
用二分法求大于等于某个数最左侧的位置
 */
public class Code01_2 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,3,3,3,4,5,6,7};
        int index = findIndex(arr,3);
        System.out.println(index);
    }
    private static int findIndex(int[] arr, int target) {
        int L = 0;
        int R = arr.length-1;
        int M;
        int index = -1;
        while (L <= R) {
            M = L + ((R-L)>>1);
            if (arr[M] >= target) {
                index = M;
                R = M-1;
            } else {
                L = M+1;
            }
        }
        return index;
    }
}
