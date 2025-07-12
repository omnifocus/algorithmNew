package first10;

public class Code02_Javanais {
    public static void main(String[] args) {
        System.out.println(translate("abaseiosu"));
    }

    private static String translate(String text) {
        if (text == null || "".equals(text))  {return "";}
        StringBuilder sb = new StringBuilder();
        char curChar = ' ';
        for (int i=0;i<text.length();i++) {
            char c = text.charAt(i);
            if (i-1 >= 0) {
                if ("aeiou".indexOf(c) != -1) {
                    if ("aeiou".indexOf(curChar) == -1) {
                        sb.append("av").append(c);
                    } else {
                        sb.append(c);
                    }
                } else {
                    sb.append(c);
                }

            } else {
                if ("aeiou".indexOf(c) != -1) {
                    sb.append("av").append(c);
                } else {
                    sb.append(c);
                }

            }
            curChar = c;
        }
        return sb.toString();
    }
}
