package ch2.exer;

public class Code02_UniformProbabilityVerifier_1 {

    public static void main(String[] args) {
        int totalRecord = 10000;
        double probability = 0.3;
        int hitCount = 0;
        for (int i = 0; i <= totalRecord; i++) {
            if (Math.random() < probability) {
                hitCount++;
            }
        }
        System.out.println("res:" + hitCount * 1.0 / totalRecord);

    }
}
