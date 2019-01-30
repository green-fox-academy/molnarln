import jdk.nashorn.internal.ir.ReturnNode;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    public static String ticTacResult(String fileName) {

        Path filePath = Paths.get(fileName);
        String output = "";
        try {
            ArrayList<String> linesOfFile = new ArrayList<>();
            linesOfFile.addAll(Files.readAllLines(filePath));

            for (int i = 0; i < linesOfFile.size(); i++) {
                if (linesOfFile.get(i).equals("OOO")) {
                    output = "O";
                } else if (linesOfFile.get(i).equals("XXX")) {
                    output = "X";
                } else if (linesOfFile.get(i).charAt(i) == linesOfFile.get(i + 1).charAt(i) && linesOfFile.get(i + 1).charAt(i) == linesOfFile.get(i + 2).charAt(i) && linesOfFile.get(i).charAt(i) == 'O') {
                    output = "O";
                } else if (linesOfFile.get(i).charAt(i) == linesOfFile.get(i + 1).charAt(i) && linesOfFile.get(i + 1).charAt(i) == linesOfFile.get(i + 2).charAt(i) && linesOfFile.get(i).charAt(i) == 'X') {
                    output = "X";
                } else if (linesOfFile.get(0).charAt(0) == linesOfFile.get(1).charAt(1) && linesOfFile.get(1).charAt(1) == linesOfFile.get(2).charAt(2) && linesOfFile.get(0).charAt(0) == 'O') {
                    output = "O";
                } else if (linesOfFile.get(0).charAt(0) == linesOfFile.get(1).charAt(1) && linesOfFile.get(1).charAt(1) == linesOfFile.get(2).charAt(2) && linesOfFile.get(0).charAt(0) == 'X') {
                    output = "X";
                } else {
                    output = "draw";
                }
            }

        } catch (Exception ex) {
            System.out.println();
        }
        return output;
    }
}