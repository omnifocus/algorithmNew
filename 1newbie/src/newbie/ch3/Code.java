package newbie.ch3;

import java.util.Arrays;

/**
 * 杨辉三角
 */
public class Code {

    public static void main(String[] args) {
        int N = 10;
        int[][] ints = buildTriangle(10);
        printTraingle(ints);
    }

    private static void printTraingle(int[][] arr) {
        for (int i=0;i<arr.length;i++) {
            for (int k=arr.length-i;k>=0;k--) {
                System.out.print("\t");
            }
            for (int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j] + "\t\t" );
            }
            System.out.println();
        }
    }

    private static int[][]  buildTriangle(int row) {
        int[][] arr = new int[row][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) arr[i][j] = 1 ;
                else
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        return arr;
    }


}
