package interview.first10.exer;

/**
 * avabavasaveiosavu
 *如果当前元音字母前面是元音，就不变，否则前面加av
 */
public class Code02_Javanais_5 {
    public static void main(String[] args) {
        System.out.println(translate("abaseiosu"));
    }

    private static String translate(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<text.length();i++) {
            char curChar = text.charAt(i);
            boolean curFlag = "aeiou".indexOf(curChar) != -1;
            boolean preFlag = i>=1 && "aeiou".indexOf(text.charAt(i-1)) != -1;
            if (curFlag && !preFlag) {
                sb.append("av").append(curChar);
            } else {
                sb.append(curChar);
            }
        }
        return sb.toString();

    }
}
