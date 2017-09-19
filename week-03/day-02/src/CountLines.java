import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        lineCount("src/reversed-lines.txt");

    }

    public static int lineCount (String filename) {
        try {
            Path filepath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filepath);
            int count = lines.size();
            System.out.println(count);
            return count;
        } catch (IOException e) {
            return 0;
        }
    }
}

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

