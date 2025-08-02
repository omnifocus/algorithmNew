package ch2.exer;

import java.util.Arrays;

public class Code04_UniformProbabilityVerifier_3 {

    public static void main(String[] args) {
        int totalRecord = 10000;
        int[] arr = new int[8];
        for (int i=0;i<=totalRecord;i++) {
            int ran = (int)(Math.random()*8);
            arr[ran] ++;
        }
        System.out.println("res: " + Arrays.toString(arr));

    }
}
