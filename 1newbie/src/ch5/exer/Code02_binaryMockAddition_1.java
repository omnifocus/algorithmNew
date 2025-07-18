package ch5.exer;

public class Code02_binaryMockAddition_1 {
    public static void main(String[] args) {
        int a  = 46;
        int b = 20;
        System.out.println(plus(a,b));
    }
    private static int plus(int a, int b) {
       int sum = a;
       while (b != 0) {
           sum = a ^ b;
           b = (a & b) << 1;
           a = sum;
       }
       return sum;
    }
}
