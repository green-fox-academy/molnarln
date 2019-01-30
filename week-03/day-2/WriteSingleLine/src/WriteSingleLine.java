import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        Path filePath = Paths.get("my-file.txt");

        try{
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("László Molnár");
            Files.write(filePath, stringList);

        }catch (Exception ex){
            System.out.println("Unable to write file :" + filePath);
        }


    }
}