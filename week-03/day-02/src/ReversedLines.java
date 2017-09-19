import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    // Create a method that decrypts reversed-lines.txt

    public static void main(String[] args) {
        reverser("src/reversed-lines.txt");
    }

    public static String reverser (String input) {
        Path filepath = Paths.get(input);
        try {
            List<String> content = Files.readAllLines(filepath);
            List<String> reversed = new ArrayList<>();

            //reverser
            String dummytwo = "";
            for (int j = 0; j < content.size() ; j++) {
              for (int i = content.get(j).length() - 1; i >= 0; i--) {
                  char dummy = content.get(j).charAt(i);
                  dummytwo = dummytwo.concat(String.valueOf(dummy));
              }
                reversed.add(dummytwo);
                dummytwo = "";
            }

            //print it
            Path filePathOut = Paths.get("src/reversed-lines-reversed.txt");
            Files.write(filePathOut, reversed);

        } catch (IOException e) {

        }
        return null;
    }
}

