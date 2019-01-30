import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful


        Path filePath = Paths.get("my-file.txt");

        filePath(filePath);


    }

    public static void filePath(Path filePath) {
        try{

            Files.copy(filePath, Paths.get("my-file-copy.txt"));
            System.out.println(true);

        }catch (Exception ex){
            System.out.println(false);
        }
    }
}