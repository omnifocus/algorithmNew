package ch2.exer;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Code02_UniformProbabilityVerifier_2 {

    public static void main(String[] args) {
        int totalRecord = 10000;
        double target = new BigDecimal(Math.random()).setScale(1, RoundingMode.DOWN).doubleValue();
        int hitCount = 0;
        System.out.print(target + ": ");
        for (int i = 0; i <= totalRecord; i++) {
            if (Math.random() < target) hitCount++;
        }
        System.out.println(hitCount*1.0/totalRecord);

    }
}
