import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches(ArrayList<String> girls, ArrayList<String> boys){
        ArrayList<String> makingMatches = new ArrayList<>();
        if(girls.size()>boys.size()) {
            for (int i = 0; i < boys.size(); i++) {

                makingMatches.add(boys.get(i));
                makingMatches.add(girls.get(i));
            }
            for (int i = 0; i < girls.size()-boys.size(); i++) {
                makingMatches.add(girls.get(i+boys.size()));
            }
        }else{
            for (int i = 0; i < girls.size(); i++) {

                makingMatches.add(boys.get(i));
                makingMatches.add(girls.get(i));
            }
            for (int i = 0; i < boys.size()-girls.size(); i++) {
                makingMatches.add(boys.get(i+girls.size()));
            }
        }
        return makingMatches;
    }
}