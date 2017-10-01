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

    public static void decoder (String inputFile) {
        Path filepath = Paths.get(inputFile);
        String fin = "";
        try {
            List<String> content = Files.readAllLines(filepath);
            List<String> noduplicates = new ArrayList<>();

            //removing duplications from each line
            String result = "";
            for (int j = 0; j < content.size(); j++) {
                for (int i = 0; i < content.get(j).length(); i++) {
                    if (i == 0) {
                        result += String.valueOf(content.get(j).charAt(i));
                        //figure out what to do when its a double letter
                    } else if (i > 2 && content.get(j).charAt(i - 1) == content.get(j).charAt(i) && content.get(j).charAt(i) == content.get(j).charAt(i - 3)) {
                        result += String.valueOf(content.get(j).charAt(i));
                    } else if (i > 0 && content.get(j).charAt(i - 1) != content.get(j).charAt(i))  {
                        result += String.valueOf(content.get(j).charAt(i));
                    }
                }
                noduplicates.add(result);
                result = "";
            }

            //print to new
            Path filePathOut = Paths.get("src/duplicated-chars-decoded.txt");
            Files.write(filePathOut, noduplicates);

        } catch (IOException e) {
            System.out.println("Something went wrong :(");
        }
    }
}

// Create a method that decrypts the duplicated-chars.txt

