package newbie.ch3;

/**
 * 张三说李四在说谎，李四说王五在说谎，王五说张三和李四都在说谎。
 * 这三人中到底谁说的是真话，谁说的是假话?
 */
public class Code_whoLie {

    public static void main(String[] args) {

        findTruth2();
    }


    /**
     * 没考虑false的情况
     */
    public static void findTruth() {
        boolean isZs = true;
        boolean isLs = true;
        boolean isWw = true;

        isZs = !isLs;
        isLs = !isWw;
        isWw = !(isZs || isLs);


        if (isZs) {
            isLs = !isZs;
            isWw = !isLs;
            if (isWw == !(isZs || isLs)) {
                System.out.println("isZs:" + isZs + " isLs:" + isLs + " isWw:" + isWw);
                return;
            }
        }
        if (isLs) {
            isZs = !isLs;
            isWw = !isLs;
            if (isWw == !(isZs || isLs)) {
                System.out.println("isZs:" + isZs + " isLs:" + isLs + " isWw:" + isWw);
                return;
            }
        }
        if (isWw) {
            isLs = !isWw;
            isZs = !isLs;
            if (isWw == !(isZs || isLs)) {
                System.out.println("isZs:" + isZs + " isLs:" + isLs + " isWw:" + isWw);
                return;
            }
        }
    }

    public static void findTruth2() {

        /**
         *         isZs = !isLs;
         *         isLs = !isWw;
         *         isWw = !(isZs || isLs);
         */
        boolean[] arr = {true,false};
        for (boolean isZs : arr) {
            for (boolean isLs:arr) {
                for (boolean isWw:arr) {
                    if (isZs == !isLs && isLs == !isWw && isWw == !(isZs || isLs)) {
                        System.out.println("isZs:" + isZs + " isLs:" + isLs + " isWw:" + isWw);

                    }
                }
            }
        }
    }

}
