package basic.ch1;

/*
用二分法求小于等于某个数最右侧的位置
 */
public class Code02 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,3,3,3,4,5,6,7};
        int index = findIndex(arr,3);
        System.out.println(index);
    }

    //TODO
    private static int findIndex(int[] arr, int target) {
        int L = 0;
        int R = arr.length-1;
        int index = -1;
        while (L <= R) {
            int M = L + ((R-L)>>1);
            if (arr[M] <=  target) {
                L = M+1;
                index = M;
            } else {
                R = M-1;
            }
        }
        return index;
    }
}
