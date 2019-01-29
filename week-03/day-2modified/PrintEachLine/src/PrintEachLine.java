import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"
        try {
            Path filePath = Paths.get("my-file.txt");
            ArrayList<String> stringArrayList = new ArrayList<>();
            stringArrayList.addAll(Files.readAllLines(filePath));
            for (String line: stringArrayList
            ) {
                System.out.println(line);
            }

        }catch (Exception ex){
            System.out.println("Unable to read file: my-file.txt");
        }

    }
}