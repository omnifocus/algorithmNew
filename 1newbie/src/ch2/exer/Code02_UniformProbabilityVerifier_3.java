package ch2.exer;

public class Code02_UniformProbabilityVerifier_3 {

    public static void main(String[] args) {
        int totalRecord = 10000;
        double P = 0.8;
        int count = 0;
        for (int i = 0; i <= totalRecord; i++) {
            if (Math.random() <= P) {
                count++;
            }
        }
        System.out.println("res:" + (count*1.0/totalRecord));

    }
}
