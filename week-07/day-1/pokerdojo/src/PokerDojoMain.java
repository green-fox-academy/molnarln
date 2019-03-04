import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

public class PokerDojoMain {

    public static void main(String[] args) {
        String[] hand1 = {"2D", "3D", "4D", "5D", "6D"};
        String[] hand2 = {"2D", "3D", "4D", "5D", "7D"};
        String output = PokerDojoMain.checkHighHand(hand1, hand2);

    }

    public static String checkHighHand(String[] hand1, String[] hand2) {

        Map<Character, Integer> scores = new HashMap<>();
        scores.put('2', 2);
        scores.put('3', 3);
        scores.put('4', 4);
        scores.put('5', 5);
        scores.put('6', 6);
        scores.put('7', 7);
        scores.put('8', 8);
        scores.put('9', 9);
        scores.put('T', 10);
        scores.put('J', 11);
        scores.put('Q', 12);
        scores.put('K', 13);
        scores.put('A', 14);

        List<String> hand1MaxValue = Arrays.asList(hand1);
        List<Integer> hand1Sorted = new ArrayList<>();
        OptionalInt hand1Value = hand1MaxValue.stream()
                .map(e -> e.charAt(0))
                .map(scores::get)
                .sorted((a, b) -> a <= b ? 1 : -1)
                .mapToInt(Integer::intValue)
                .reduce(new IntBinaryOperator() {
                    @Override
                    public int applyAsInt(int left, int right) {
                        return 0;
                    }
                });


        List<String> hand2MaxValue = Arrays.asList(hand1);
        List<Integer> hand2Sorted = new ArrayList<>();
        hand1Sorted = hand2MaxValue.stream()
                .map(e -> e.charAt(0))
                .map(scores::get)
                .sorted((a, b) -> a <= b ? 1 : -1)
                .collect(Collectors.toList());

/*        System.out.println(hand2MaxValue.getAsInt());

        if (hand1MaxValue.getAsInt() > hand2MaxValue.getAsInt()) {
            return "Hand1 is the winner.";
        }
        if (hand1MaxValue.getAsInt() < hand2MaxValue.getAsInt()) {
            return "Hand2 is the winner.";
        } else {
            return "The two hands are equal.";
        }*/
        return "asd";
    }
}
