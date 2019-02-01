package strings;

public class String3 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the
        // adjacent chars are now separated by a "*".
        String text = "This is the text to edit.";

        System.out.println(insertStar(text));
    }


    public static String insertStar(String text) {
        int n = text.length();
        if (n < 1) {
            return text;
        }
        return text.charAt(0) + "*" + insertStar(text.substring(1));
    }
}