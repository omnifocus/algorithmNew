package exer.first10;

/**
 * avabavasaveiosavu
 *
 */
public class Code02_Javanais_2 {
    public static void main(String[] args) {
        System.out.println(translate("abaseiosu"));
    }

    private static String translate(String text) {
        if (text == null) return null;
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiou";
        char preChar = ' ';
        char curChar = ' ';
        for (int i=0;i<text.length();i++) {
            curChar = text.charAt(i);
            boolean preCharFlag = i>=1 && vowels.indexOf(text.charAt(i-1)) != -1;
            boolean curCharFlag = vowels.indexOf(curChar) != -1;
            if (!preCharFlag && curCharFlag) sb.append("av").append(curChar);
            else sb.append(curChar);
        }
        return sb.toString();
    }
}
