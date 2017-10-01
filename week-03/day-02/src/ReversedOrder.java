import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        reverseOrder("src/reversed-order.txt");
    }

    public static void reverseOrder (String input) {
        Path filepath = Paths.get(input);
        try {
            List<String> content = Files.readAllLines(filepath);
            List<String> reversed = new ArrayList<>();

            for (int i = content.size() - 1; i >= 0; i--) {
                reversed.add(content.get(i));
            }

            Path filePathOut = Paths.get("src/reversed-order-reversed.txt");
            Files.write(filePathOut, reversed);

        } catch (IOException e) {

        }
    }
}

