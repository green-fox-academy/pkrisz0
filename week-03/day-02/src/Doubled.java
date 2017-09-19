import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        decoder("src/duplicated-chars.txt");
    }

    public static String decoder (String inputFile) {
        Path filepath = Paths.get(inputFile);
        String fin = "";
        try {
           List<String> content = Files.readAllLines(filepath);

           //adding each line to an array
           String[] lines = new String[content.size()];
            for (int i = 0; i < content.size(); i++) {
                lines[i] = content.get(i);
            }


           //removing duplications from each line
            String result = "";

            for (int i = 0; i < lines[0].length(); i++) {
                if(i == 0){
                    result += String.valueOf(lines[0].charAt(i));
                } else if(i > 0 && lines[0].charAt(i) != lines[0].charAt(i - 1)) {
                    result += String.valueOf(lines[0].charAt(i));
                }
            }

            lines[0] = result;

            System.out.println(lines[0]);

        } catch (IOException e) {

        }

        return fin;
    }
}

// Create a method that decrypts the duplicated-chars.txt

