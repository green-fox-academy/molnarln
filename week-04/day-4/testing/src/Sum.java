import java.util.ArrayList;
import java.util.List;

public class Sum {

    public int sum(ArrayList<Integer> listOfNumbers) {
        if (listOfNumbers != null) {
            int sum = 0;

            for (int listMember : listOfNumbers
            ) {
                sum = sum + listMember;
            }
            return sum;
        }
        return 0;
    }
}
