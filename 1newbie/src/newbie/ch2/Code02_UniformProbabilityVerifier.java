package newbie.ch2;

import java.util.Random;

public class Code02_UniformProbabilityVerifier {

    public static void main(String[] args) {
        int totalRecord = 10000;
        int hitCount = 0;
        double probability = 0.3;
        for (int i=0;i<=totalRecord;i++) {
           if ( Math.random() <= probability) {
               hitCount ++;
           }
        }
        System.out.println("res: " +  (hitCount * 1.0 / totalRecord));
    }
}
