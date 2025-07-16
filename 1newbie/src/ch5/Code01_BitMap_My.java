package ch5;

/**
 *  << >> & | 10 times more efficient than  + - * / % ...
 */
public class Code01_BitMap_My {

    private static class BitMap {
        private long[] nums;
        BitMap(int max) {
            nums = new long[(max/64) + 1];
        }

        void add(int num) {
            int index = num / 64;
            // % 64  not % 63
//            nums[index] |= (1 << (num % 63));
            // not 1 but  1L
//            nums[index] |= (1 << (num % 64));
            nums[index] |= (1L << (num % 64));

        }
        void del(int num) {
            int index = num / 64;
//            not 0, but ~(1)
//            nums[index] &= (0 << (num % 63));
//            not %63 , but %64
//            nums[index] &= ~(1 << (num % 63));
//            nums[index] &= ~(1 << (num % 64));
            // not 1 but 1L
            nums[index] &= ~(1L << (num % 64));
        }
        boolean contains(int num) {
            int index = num / 64;
//            not %63 , but %64
//            return (nums[index] & (1 << (num % 63)))  != 0 ;
//            return (nums[index] & (1 << (num % 64)))  != 0 ;
//            not 1 but 1L
            return (nums[index] & (1L << (num % 64)))  != 0 ;
        }

    }

    public static void main(String[] args) {
        int max = 66;
        BitMap bitMap = new BitMap(max);
        bitMap.add(max);
        System.out.println(bitMap.contains(max));
        bitMap.del(max);
        System.out.println(bitMap.contains(max));
    }
}
