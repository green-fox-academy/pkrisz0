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
            String[] noduplication = new String[lines.length];
            String result = "";
            for (int j = 0; j < lines.length; j++) {
                for (int i = 0; i < lines[j].length(); i++) {
                    if (i == 0) {
                        result += String.valueOf(lines[j].charAt(i));
                    } else if (i > 0 && lines[j].charAt(i) != lines[j].charAt(i - 1)) {
                        result += String.valueOf(lines[j].charAt(i));
                    }
                }

                noduplication[j] = result;
                result = "";
            }


            //turn array into arraylist for printing

            List<String> contents = new ArrayList();

            for (int i = 0; i < noduplication.length; i++) {
                contents.add(noduplication[i]);
            }


            //print to new
            Path filePathOut = Paths.get("src/duplicated-chars-decoded.txt");
            Files.write(filePathOut, contents);


        } catch (IOException e) {

        }

        return fin;
    }
}

// Create a method that decrypts the duplicated-chars.txt

