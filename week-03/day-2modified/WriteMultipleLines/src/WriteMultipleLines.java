import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class WriteMultipleLines {
    public static void main(String[] args) {
        // Create a function that takes 3 parameters: a path, a word and a number
        // and is able to write into a file.
        // The path parameter should be a string that describes the location of the file you wish to modify
        // The word parameter should also be a string that will be written to the file as individual lines
        // The number parameter should describe how many lines the file should have.
        // If the word is 'apple' and the number is 5, it should write 5 lines
        // into the file and each line should read 'apple'
        // The function should not raise any errors if it could not write the file.



        Path filePath = Paths.get("my-file.txt");
        String text = "write a line";
        int num = 5;
        writeLines(filePath, text, num);


    }

    public static void writeLines(Path filePath, String text, int num) {
        try{

            ArrayList<String> stringList = new ArrayList<>();
            for (int i = 0; i < num ; i++) {
                stringList.add(text);
            }
            Files.write(filePath, stringList);

        }catch (Exception ex){
            System.out.println();
        }
    }
}