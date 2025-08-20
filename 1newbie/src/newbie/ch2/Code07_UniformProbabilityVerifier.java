package newbie.ch2;

/**
 * 将[0,1)上等概率x返回改为 等概率1 - (1-x)^2返回
 */
public class Code07_UniformProbabilityVerifier {

    public static void main(String[] args) {
        int totalRecord = 10000;
        int hitCount = 0;
        double probability = 0.4;
        for (int i=0;i<=totalRecord;i++) {
           if (genNum(probability)) {
               hitCount++;
           }
        }
        System.out.println("res: " + (hitCount*1.0/totalRecord));

    }

    /**
     如 P=0.4, 即 [0,1)范围上出现的小于等于0.4的概率为 40%
     那么至少有一个随机数大于P的概率为  都不大于P的反面 ,即 1-P^2
     而至少有一个随机数小于P的概率为  都不小于P的反面 ,即 1-(1-P)^2
     * @param probability
     * @return
     */
    private static boolean genNum(double probability) {
//         必有一次大于,  另一个无所谓
//        if (Math.max(Math.random(),Math.random()) > probability ) {
//            return true;
//        }
        // 必有一次小于, 另一个无所谓
        if (Math.min(Math.random(),Math.random()) < probability) {
            return true;
        }
        return false;
    }
}
