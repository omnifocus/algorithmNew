package ch2;

import java.util.Arrays;

/**
 * 验证[0,1)*8转为整数 则在[0,7]上的每个整数等概率
 */
public class Code04_UniformProbabilityVerifier {

    public static void main(String[] args) {
        int totalRecord = 10000;
        int num = 8;
        int[] arr = new int[num];
        for (int i=0;i<=totalRecord;i++) {
           int ranInt =  (int)(Math.random() * num);
           arr[ranInt] += 1;
        }
        System.out.println("res: " + Arrays.toString(arr));

    }
}
