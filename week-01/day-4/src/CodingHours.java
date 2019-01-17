public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        double avgCodTimPerDay = 6;
        double semester = 17;
        double weekLength = 5;
        double codingHours = avgCodTimPerDay * semester * weekLength;
        double workHours = 52;
        System.out.println(codingHours);
        
        double codingHourPercent =  ( ( avgCodTimPerDay * weekLength * semester )/ (workHours * semester) ) * 100;
        System.out.println(codingHourPercent);

        System.out.println("Percentage of the coding hours: " + codingHourPercent + " %");

    }
}