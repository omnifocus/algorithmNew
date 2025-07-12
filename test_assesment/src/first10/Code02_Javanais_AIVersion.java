package first10;

public class Code02_Javanais_AIVersion {
    public static void main(String[] args) {
        System.out.println(translate("abaseiosu"));
    }

    private static String translate(String text) {
        if (text == null || "".equals(text))  {return "";}
        String objectives = "aeiou";
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<text.length();i++) {
            char curChar = text.charAt(i);
            boolean curFlag = objectives.indexOf(curChar) != -1;
            boolean preFlag = i-1 >= 0 && objectives.indexOf(text.charAt(i-1)) != -1;
            if (!preFlag && curFlag) {
                sb.append("av").append(curChar);
            } else {
                sb.append(curChar);
            }
        }
        return sb.toString();
    }
}
