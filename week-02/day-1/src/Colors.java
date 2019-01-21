import java.util.Arrays;

public class Colors {
    public static void main(String[] args) {
        // - Create a two dimensional array
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`

        String [][] colors = new String[3][];

        //String[] colors0 = new String [5];
        String[] colors0=new String[] {"lime", "forest green", "olive", "pale green"};

        String[] colors1={"orange red", "red", "tomato"};

        String[] colors2 = {"orchid", "violet", "pink", "hot pink"};

        colors[0] = colors0;
        colors[1] = colors1;
        colors[2] = colors2;

        for (String[] rows: colors
             ) {
            System.out.println(Arrays.toString(rows));
        }
    }
}

