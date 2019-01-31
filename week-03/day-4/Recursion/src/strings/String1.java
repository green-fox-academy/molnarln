package strings;

public class String1 {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.
        String text = "Fsdfsaxydsfefx Cxse";
        char from = 'x';
        char to = 'Y';
        System.out.println(lowercaseXToY(text, from, to));
    }


    public static String lowercaseXToY(String text, char from, char to) {


        if (text.length()<1) {
            return text;
        }
        else {
            char first;
            if (text.charAt(0) == to){
                first = to;
            }else {
                first = text.charAt(0);
            }
            return first + lowercaseXToY(text.substring(1), from, to);

        }
    }
}