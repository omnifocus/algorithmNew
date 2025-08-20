package newbie.ch2.exer;

import java.util.Arrays;

/**
 * 从01不等概率到01等概率
 */
public class Code09_UniformProbabilityVerifier {

    public static void main(String[] args) {
        int totalRecord = 10000;
        int[] arr = new int[2];
        for (int i=0;i<=totalRecord;i++) {

        }
        System.out.println("res: " + Arrays.toString(arr));

    }


    //TODO
    private static int newgen() {

        return 0;
    }

    // 01不等概率
    private static int originGen() {
       return Math.random() < 0.4 ? 0 : 1;
    }
}
