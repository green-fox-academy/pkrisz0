import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class MainTwo {

    public static void main(String[] args) {
        argHandler(args);
    }

    public static void argHandler(String[] input){
        OptionParser parser = new OptionParser();
        parser.accepts("y").withRequiredArg();
        parser.accepts("f").withRequiredArg();
        parser.accepts("o").withRequiredArg();
        OptionSet options = parser.parse(input);

        String lotto = "C:/greenfox/pkrisz0/week-06/day-03/lotteryfilter/src/main/java/otos.csv";
        String output = "C:/greenfox/pkrisz0/week-06/day-03/lotteryfilter/src/main/java/output.csv";

        String filter = String.valueOf(options.valueOf("y"));

        if (options.has( "y")){
            openAndWrite(lotto, output, filter);
        } if (options.has( "f" )) {
            String from = "C:/greenfox/pkrisz0/week-06/day-03/lotteryfilter/src/main/java/" + String.valueOf(options.valueOf("f"));
            openAndWrite(from, output, filter);
        } if (options.has( "o" )){
            String outputGiven = "C:/greenfox/pkrisz0/week-06/day-03/lotteryfilter/src/main/java/" + String.valueOf(options.valueOf("o"));
            openAndWrite(lotto, outputGiven, filter);
        }
    }

    public static void openAndWrite(String source, String destination, String filter){

        List<String[]> lottoContent = new ArrayList<>();
        List<String[]> filteredLotto = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(source))) {
            lottoContent = reader.readAll();
        } catch(Exception e){
            System.out.println("Problem while reading.");
        }

        for (int i = 0; i < lottoContent.size(); i++) {
            if (lottoContent.get(i)[0].startsWith(filter)){
                filteredLotto.add(lottoContent.get(i));
            }
        }

        try (CSVWriter writer = new CSVWriter(new FileWriter(destination))) {
            writer.writeAll(filteredLotto);
        } catch(Exception e){
            System.out.println("Problem while writing.");
        }
    }
}

