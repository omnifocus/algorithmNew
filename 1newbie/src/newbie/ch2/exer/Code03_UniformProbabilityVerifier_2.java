package newbie.ch2.exer;

public class Code03_UniformProbabilityVerifier_2 {

    public static void main(String[] args) {
        int totalRecord = 10000;
        int num = 8;
        int hitCount = 0;
        for (int i = 0; i <= totalRecord; i++) {
            if ((int) (Math.random() * 8) < 4) {
                hitCount++;
            }
        }
        System.out.println("res: " + hitCount * 1.0 / totalRecord);

    }
}
