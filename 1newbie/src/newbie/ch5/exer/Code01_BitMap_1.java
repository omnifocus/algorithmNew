package newbie.ch5.exer;

public class Code01_BitMap_1 {
    private static class BitMap {
        long[] nums;
        private BitMap(int max) {
            nums = new long[(max+64)>>6];
        }
        private void add(int num) {
            nums[num>>6] |= (1L << (num & 63));
        }
        private void del(int num) {
            nums[num>>6] &= ~(1L << (num & 63));
        }
        private boolean contains(int num) {
            return (nums[num>>6] & (1L << (num & 63))) != 0;
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
