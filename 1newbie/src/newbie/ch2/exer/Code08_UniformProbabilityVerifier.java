package newbie.ch2.exer;

import java.util.Arrays;

/**
 * [1,5]上等概率返回改为[1,7]上等概率返回
 */
public class Code08_UniformProbabilityVerifier {

    public static void main(String[] args) {
        int totalRecord = 10000;

        for (int i=0;i<=totalRecord;i++) {

        }
        System.out.println("res: " );

    }


    private static int genNum() {
        return -1;
    }


    // 1到5上等概率
    private static int originGen() {
       return (int)(Math.random() * 5) + 1;
    }
}
