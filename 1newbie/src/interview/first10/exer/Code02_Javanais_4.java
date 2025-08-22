package interview.first10.exer;

/**
 * avabavasaveiosavu
 *
 * 如果当前元音字母前面是元音，就不变，否则前面加av
 *
 */
public class Code02_Javanais_4 {
    public static void main(String[] args) {
        System.out.println(translate("abaseiosu"));
    }

    private static String translate(String text) {
        if (text == null || "".equals(text)) return text;
        char curChar;
        char preChar;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<text.length();i++) {
            curChar = text.charAt(i);
            preChar = i > 0 ? text.charAt(i-1) : ' ';
            if ("aeiou".indexOf(curChar) != -1) {
                if ("aeiou".indexOf(preChar) == -1) {
                    sb.append("av").append(curChar);
                } else {
                    sb.append(curChar);
                }
            } else {
                sb.append(curChar);
            }
        }
        return sb.toString();
    }
}
