package newbie.ch2.exer;

/**
 * 将[0,1)上等概率x返回改为 等概率x^2返回
 */
public class Code05_UniformProbabilityVerifier_1 {

    public static void main(String[] args) {
        int totalRecord = 10000;
        int hitCount = 0;
        double probability = 0.6;
        for (int i = 0; i <= totalRecord; i++) {
            if (genNum(probability)) {
                hitCount++;
            }
        }
        System.out.println("res: " + hitCount * 1.0 / totalRecord);

    }

    private static boolean genNum(double probability) {

        return Math.max(Math.random(), Math.random()) < probability;
    }
}
