package newbie.ch2.exer;

import java.util.Arrays;

/**
 * [1,5]上等概率返回改为[1,7]上等概率返回
 */
public class Code08_UniformProbabilityVerifier_1 {

    public static void main(String[] args) {
        int totalRecord = 10000;
        int arr[] = new int[8];
        for (int i=0;i<=totalRecord;i++) {
            arr[genNum()] ++;
        }
        System.out.println("res: " + Arrays.toString(arr));

    }


    private static int genNum() {

        int num;
        do {
            num = gen07();
        } while (num == 0);
        return num;
    }


    private static int gen07() {
        return (gen01() << 2) + (gen01() << 1) + gen01();
    }

    private static int gen01() {
        int num;
        do {
            num = originGen();
        } while (num == 3);

        return num < 3 ? 0 : 1;
    }

    // 1到5上等概率
    private static int originGen() {
       return (int)(Math.random() * 5) + 1;
    }
}
