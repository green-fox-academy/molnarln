import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;

public class AppendA {
    public static void main(String[] args) {
        // - Create an array variable named `animals`
        //   with the following content: `["koal", "pand", "zebr"]`
        // - Add all elements an `"a"` at the end

        String[] animals = {"koal", "pand", "zebr"};

        for (String items: animals
             ) {
            items = items + "a";
            System.out.print(items + " ");
        }

    }
}
