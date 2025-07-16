package ch2.exer;

public class Code03_UniformProbabilityVerifier_1 {

    public static void main(String[] args) {
        int totalRecord = 10000;
        int num = 8;
        int hitCount = 0;
        for (int i=0;i<=totalRecord;i++) {
            int n = (int)(Math.random() * num);
            if (n < num /2) {
                hitCount++;
            }
        }
        System.out.println("res: " + hitCount*1.0/totalRecord );

    }
}
