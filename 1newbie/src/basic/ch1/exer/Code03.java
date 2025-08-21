package basic.ch1.exer;

/*
无序数组，相邻不等，找局部最小
 */
public class Code03 {
    public static void main(String[] args) {
        int[] arr = new int[] {13,11,6,4,7,2,8,2,9};
        //老师的方法不对，...findIndex才对
        int index = findIndex(arr);
        System.out.println(index);
    }

    //TODO
    private static int findIndex(int[] arr) {
        return -1;
    }


}
