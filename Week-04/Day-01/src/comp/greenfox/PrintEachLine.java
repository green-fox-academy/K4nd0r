package comp.greenfox;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of the lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"
    try { // Required by Files.readAllLines(filePath);
      // Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
      Path filePath = Paths.get("my-file.txt");
      long lineCount = Files.lines(filePath).count();
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lineCount ; i++) {
        System.out.println(lines.get(i));
      }
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }
  }
}