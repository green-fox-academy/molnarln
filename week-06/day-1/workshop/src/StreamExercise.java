import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExercise {
    public static void main(String[] args) {

        // Write a Stream Expression to get the even numbers from the following list:
        System.out.println("Exercise 1: ");
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream()
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);

        //Write a Stream Expression to get the squared value of the positive numbers from the following list:
        System.out.println("\nExercise 2:");
        List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers2.stream()
                .filter(e -> e >= 0)
                .map(e -> e * e)
                .forEach(System.out::println);

        //Write a Stream Expression to find which number squared value is more then 20 from the following list:
        System.out.println("\nExercise 3: ");
        List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers3.stream()
                .map(e -> e * e)
                .filter(e -> e > 20)
                .forEach(System.out::println);

        //Write a Stream Expression to get the average value of the odd numbers from the following list:
        System.out.println("\nExercise 4:");
        List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        System.out.println(numbers4.stream()
                .filter(e -> e % 2 == 1 || e % 2 == -1)
                .mapToDouble(Double::valueOf)
                .average());

        //Write a Stream Expression to get the sum of the odd numbers in the following list:
        System.out.println("\nExercise 5: ");
        List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        System.out.println(numbers5.stream()
                .filter(e -> e % 2 == 1)
                .mapToInt(Integer::intValue)
                .sum());

        //Write a Stream Expression to find the uppercase characters in a string!
        System.out.println("\nExercise 6:");
        String inputString = "charaCtersToFind";
        List<Character> listOfChars = inputString.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        listOfChars.stream()
                .filter(Character::isUpperCase)
                .forEach(System.out::print);

        //Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
        System.out.println("\n\nExercise 7:");
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        cities.stream()
                .filter(w -> w.startsWith("A"))
                .forEach(w -> System.out.print(w + "| "));

        //Write a Stream Expression to concatenate a Character list to a string!
        System.out.println("\n\nExercise 8:");
        List<Character> listC = new ArrayList<>();
        listC.add('a');
        listC.add('p');
        listC.add('p');
        listC.add('l');
        listC.add('e');

        String stringFromChars = listC.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(stringFromChars);

        //Write a Stream Expression to find the frequency of characters in a given string!
        System.out.println("\nExercise 9:");
        String stringToCheck = "characterstocount";
        Map<Character, Long> listFromString = inputString.chars() //from here it is a stream (intstream)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(k -> k, Collectors.counting()));

        System.out.println(listFromString);

        //Create a Fox class with 3 properties (name, color, age) Fill a list with at least 5 foxes and:
        List<Fox> foxes = Arrays.asList(
                new Fox("fox1", "green", 10),
                new Fox("fox2", "blue", 12),
                new Fox("fox3", "green", 3),
                new Fox("fox4", "purple", 20),
                new Fox("fox5", "yellow", 25));

        //Write a Stream Expression to find the foxes with green color!
        System.out.println("\nExercise10:\nThe list of green foxes:");
        foxes.stream()
                .filter(f -> f.getColor().equalsIgnoreCase("green"))
                .forEach(fox -> System.out.println(fox.getName()));

        //Write a Stream Expression to find the foxes with green color, and age less then 5 years!
        System.out.println("\nThe green foxes that younger than 5 are:");
        foxes.stream()
                .filter(fox -> fox.getColor().equalsIgnoreCase("green") && fox.getAge() < 5)
                .forEach(fox -> System.out.println(fox.getName()));

        //Write a Stream Expression to find the frequency of foxes by color!
        System.out.println("\nThe frequency of colors are:");
        Map<String, Long> mapOfFoxes = foxes.stream()
                .collect(Collectors.groupingBy(Fox::getColor, Collectors.counting())); //or can use that code, because counting is a special reducing:
            //  .collect(Collectors.groupingBy(Fox::getColor, Collectors.reducing(0L, e -> 1L, (a, b) -> a + b)));
        System.out.println(mapOfFoxes);
    }
}
