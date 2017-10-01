import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        System.out.println(copy("src/my-filetwo.txt", "src/my-filetwocopy"));
    }

    public static boolean copy (String input, String output) {
        Path filepath = Paths.get(input);
        Path filepathTwo = Paths.get(output);
        boolean success;
        try {
            List<String> contentOfFirst = Files.readAllLines(filepath);
            Files.write(filepathTwo, contentOfFirst);
            success = true;
        } catch (IOException e){
            success = false;
        }
        return success;
    }
}

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

