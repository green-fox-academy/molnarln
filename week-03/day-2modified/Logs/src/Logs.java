import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.
        Path filePath = Paths.get("log.txt");

        unique(filePath);
        getPostRatio(filePath);


    }

    public static void unique(Path filePath) {
        ArrayList<String> linesOfFile= new ArrayList<>();
        ArrayList<String> IPs = new ArrayList<>();
        ArrayList<String> uniqueIP = new ArrayList<>();

        try {
            linesOfFile.addAll(Files.readAllLines(filePath));
            for (String line: linesOfFile
            ) {
                IPs.add(line.substring(27, 38));
            }
            //System.out.println(IPs.toString()); //Prints only the IPs.


            for (String lineOFIP: IPs
            ) {
                if(!uniqueIP.contains(lineOFIP)){
                    uniqueIP.add(lineOFIP);
                }


            }
            System.out.println("The unique IPs are: ");
            System.out.println(uniqueIP.toString());


        } catch (Exception ex){
            System.out.println();
        }
    }

    public static void getPostRatio(Path filePath) {
        ArrayList<String> linesOfFile= new ArrayList<>();
        ArrayList<String> gets = new ArrayList<>();
        ArrayList<String> posts = new ArrayList<>();


        try {
            linesOfFile.addAll(Files.readAllLines(filePath));
            for (String line: linesOfFile
            ) {
                if(line.endsWith("GET /")){
                    gets.add(line);
                }else if (line.endsWith("POST /")){
                    posts.add(line);
                }
            }
            //System.out.println(getPosts.toString()); //Prints only the getPosts.
            System.out.println("The GET \\ POST request ratio is: " + (double)(gets.size()/posts.size()));
            System.out.println(gets.toString());


        } catch (Exception ex){
            System.out.println();
        }

    }
}
