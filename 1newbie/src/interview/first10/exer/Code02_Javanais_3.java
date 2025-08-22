package interview.first10.exer;

/**
 * avabavasaveiosavu
 */
public class Code02_Javanais_3 {
    public static void main(String[] args) {
        System.out.println(translate("abaseiosu"));
    }

    private static String translate(String text) {
        if (text == null || "".equals(text)) return "";
        char cur = ' ';
        String vowels = "aeiou";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            cur = text.charAt(i);
            boolean preFlag = i >= 1 && vowels.indexOf(text.charAt(i - 1)) != -1;
            boolean curFlag = vowels.indexOf(cur) != -1;
            if (!preFlag && curFlag) {
                sb.append("av").append(cur);
            } else {
                sb.append(cur);
            }
        }
        return sb.toString();
    }
}
