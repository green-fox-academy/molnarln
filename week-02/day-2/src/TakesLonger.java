public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)


        String str1 = (quote.substring(0,quote.indexOf("It")+2));
        String str2 = " always takes longer than";
        String str3 = (quote.substring(quote.indexOf("It")+2));

        String quoteMod = str1 + str2 + str3;

        System.out.println(quoteMod);


    }
}