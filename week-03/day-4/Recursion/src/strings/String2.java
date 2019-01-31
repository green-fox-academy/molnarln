package strings;

public class String2 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the 'x' chars have been removed.        String text = "Fsdfsaxydsfefx Cxse";

        String text = "abcx efgxh";
        char charToDelete = 'x';

        System.out.println(deleteX(text, charToDelete));
    }


    public static String deleteX(String text, char charToDelete) {
        char first;

        if (text.length()<1) {
            return text;
        }else if (text.charAt(0)== charToDelete){
            return deleteX(text.substring(1), charToDelete);
        }

        first = text.charAt(0);
        return first + deleteX(text.substring(1), charToDelete);

    }
}
