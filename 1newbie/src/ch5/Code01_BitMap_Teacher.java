package ch5;

/**
 *  << >> & | 10 times more efficient than  + - * / % ...
 */
public class Code01_BitMap_Teacher {

    private static class BitMap {
        private long[] nums;
        BitMap(int max) {
            nums = new long[(max + 64) >> 6];
        }

        void add(int num) {
            int index = num >> 6;
            nums[index] |= (1L << (num & 63));

        }
        void del(int num) {
            int index = num >> 6;
            nums[index] &= ~(1L << (num & 63));
        }
        boolean contains(int num) {
            int index = num >> 6;
            return (nums[index] & (1L << (num & 63)))  != 0 ;
        }

    }

    public static void main(String[] args) {
        int max = 66;
        BitMap bitMap = new BitMap(max);
        bitMap.add(max);
        System.out.println(bitMap.contains(max));
        bitMap.del(max);
        System.out.println(bitMap.contains(max));

        System.out.println();
    }
}
