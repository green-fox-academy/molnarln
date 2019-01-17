public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int currentkummSecond = currentSeconds + currentMinutes * 60 + currentHours * 60 * 60;
        int kummSecondsLeft = 24 * 60 * 60 - currentkummSecond;
        //System.out.println(currentkummSecond);

        System.out.println("Remaining seconds from a day: " + kummSecondsLeft);

    }
}