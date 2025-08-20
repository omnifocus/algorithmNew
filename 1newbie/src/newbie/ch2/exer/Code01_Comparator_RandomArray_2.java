package newbie.ch2.exer;

import java.util.Arrays;

public class Code01_Comparator_RandomArray_2 {

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Arrays.toString(genRandomArray(10, 50)));
        }
    }


    public static int[] genRandomArray(int maxValue, int maxLength) {
        int[] arr = new int[(int)(Math.random()*maxLength)];
        for (int i=0;i<arr.length;i++) {
            arr[i] = (int)(Math.random() * maxValue);
        }
        return arr;
    }
}
