package dominoes;
import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        ArrayList<Domino> orderedDominoes = new ArrayList<>();
        orderedDominoes.add(dominoes.get(0));

        for (int j = 0; j < orderedDominoes.size(); j++) {
            for (int i = 1; i < dominoes.size(); i++) {
                if (dominoes.get(i).getLeftSide() == orderedDominoes.get(j).getRightSide()){
                    orderedDominoes.add(dominoes.get(i));
                }

            }
        }



        System.out.println(orderedDominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}