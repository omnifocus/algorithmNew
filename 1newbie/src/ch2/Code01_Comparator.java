package ch2;

import ch1.Code05_SelectionSort;
import ch1.Code06_BubbleSort;
import ch1.Code07_InsertSort;
import ch1.exer_templates.Code07_InsertSortTemplate_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Code01_Comparator {

    public static void main(String[] args) {
        testMethod();
    }
    public static int[] randomArr(int arrLen, int maxValue) {
        int[] arr = new int[(int)(Math.random() * arrLen)];
        for (int i=0;i<arr.length;i++) {
            arr[i] = (int)(Math.random() * maxValue);
        }
        return arr;
    }

    public static int[] randomNoRedundantArr(int arrLen, int maxValue) {
        Map<Integer,String> map = new HashMap<>();
        int[] arr = new int[(int)(Math.random() * arrLen)];
        for (int i=0;i<arr.length;i++) {
            int  ele =  (int)(Math.random() * maxValue);
            while (map.containsKey(ele)) {
                ele =  (int)(Math.random() * maxValue);
            }
            map.put(ele,"");
            arr[i] = ele;
        }
        return arr;
    }


    static boolean isSorted(int[] arr) {
        if(arr.length < 2) return true;
        int curValue = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (curValue > arr[i]) return false;
            curValue = arr[i];
        }
        return true;
    }

    static int[] copyArr(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i=0;i<arr.length;i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    static void testMethod() {
        int count = 10000;
        for (int i = 0; i < count ; i++) {
            int[] arr = randomArr(15,200);
            int[] arr2 = copyArr(arr);
            Code05_SelectionSort.selectSort(arr);
//            Code06_BubbleSort.bubbleSort(arr2);
            Code07_InsertSort.insertSort2(arr2);
            if (!isSorted(arr)) {
                System.out.println("arr not sorted");
                break;
            }
            if (!isSorted(arr2)) {
                System.out.println("arr2 not sorted");
                break;
            }
        }

    }


}
