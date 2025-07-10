package ch2;

import ch1.Code05_SelectionSort;
import ch1.Code07_InsertSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Code01_Comparator_RandomArray {

    public static void main(String[] args) {
        for (int i=0;i<10000;i++) {
            System.out.println(Arrays.toString(genRandomArray(10,50)));
        }
    }

    public static int[] genRandomArray(int maxValue, int maxLength) {
        int len = (int)(Math.random() * maxLength);
        int[] arr = new int[len];
        for (int i=0;i<len;i++) {
           arr[i] =  (int)(Math.random() * maxValue);
        }
        return arr;
    }
}
