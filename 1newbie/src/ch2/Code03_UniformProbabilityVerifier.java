package ch2;

import java.util.Arrays;

/**
 * 验证[0,1)*8 在[0,8)等概率，那么在[0,4)上的概率为总概率的一半
 */
public class Code03_UniformProbabilityVerifier {

    public static void main(String[] args) {
        int totalRecord = 10000;
        int num = 8;
        int hitCount = 0;
        for (int i=0;i<=totalRecord;i++) {
           int ranInt =  (int)(Math.random() * num);
            if (ranInt < num/2) hitCount++;
        }
        System.out.println("res: " + hitCount*1.0/totalRecord);

    }
}
