package newbie.ch2.exer;

import java.util.Arrays;

public class Code04_UniformProbabilityVerifier_2 {

    public static void main(String[] args) {
        int totalRecord = 10000;
        int[] arr = new int[8];
        for (int i=0;i<=totalRecord;i++) {
            arr[(int)(Math.random()*8)] ++;
        }
        System.out.println("res: " + Arrays.toString(arr) );

    }
}
