package newbie.ch1.exers;

public class Code01_TransformNumberToBitsTemplate_2 {
    public static void main(String[] args) {
        printbinarynum(10);
    }

    private static void printbinarynum(int num) {
        for (int i=31;i>=0;i--) {
            System.out.print(((num >> i) & 1) == 0 ? "0" : "1");
        }
        System.out.println();
    }
}
