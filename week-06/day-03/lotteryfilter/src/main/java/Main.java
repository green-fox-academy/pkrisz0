import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        execute(args);
    }

    public static void execute(String[] input){
        Path lotto = Paths.get("C:/greenfox/pkrisz0/week-06/day-03/lotteryfilter/src/main/java/otos.csv");
        Path output = Paths.get("C:/greenfox/pkrisz0/week-06/day-03/lotteryfilter/src/main/java/output.csv");
        List<String> content = new ArrayList<>();
        List<String> thingToPrint = new ArrayList<>();

        if (input[0].equals("-y")){

            //read all
            try {
                  content = Files.readAllLines(lotto);
            } catch (IOException e) {
                e.printStackTrace();
            }

            //filter relevant

            for (int i = 0; i < content.size(); i++) {
                if (content.get(i).startsWith(input[1] + ";")) {
                    thingToPrint.add(content.get(i));
                }
            }

            //write it
            try {
                Files.write(output, thingToPrint);
            } catch (IOException e){
                System.out.println("Something went wrong.");
            }

//        } else if (input[0].equals("-f")){
//
//        } else if (input[0].equals("-o")){

        }
    }
}
