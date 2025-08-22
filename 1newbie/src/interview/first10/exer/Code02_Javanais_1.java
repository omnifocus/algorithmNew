package interview.first10.exer;

public class Code02_Javanais_1 {
    public static void main(String[] args) {
        System.out.println(translate("abaseiosu"));
    }


    private static String translate(String text) {
        if (text == null || "".equals(text)) return null;
        String vowels = "aeiou";
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<text.length();i++) {
            char curChar = text.charAt(i);
            boolean preFlag = i-1 >= 0 && vowels.indexOf(text.charAt(i-1)) != -1;
            boolean curFlag = vowels.indexOf(curChar) != -1;
            if (!preFlag && curFlag) {
                sb.append("av").append(curChar);
            } else {
                sb.append(curChar);
            }

        }
        return sb.toString();
    }
}
