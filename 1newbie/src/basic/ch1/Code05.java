package basic.ch1;

import java.util.ArrayList;
import java.util.List;

/**
 * 只有一种数出现奇数次，其他数出现偶数次， 求出这种数
 */
public class Code05 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,5,6,1,3,5,6,3};
        int num = find(arr);
        System.out.println("出现了奇数次的数为：" + num);

    }
    //TODO
    private static int find(int[] arr) {
        int N = 0;

        for (int i=0;i<arr.length;i++) {
            N = arr[i] ^ N;
        }
        return N;
    }


}
