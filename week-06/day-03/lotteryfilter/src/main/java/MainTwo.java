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
        execute(args);
    }

    public static void execute(String[] input){
        OptionParser parser = new OptionParser( "yfo" );
        OptionSet options = parser.parse( "-y", "-f", "-o" );

        String lotto = "C:/greenfox/pkrisz0/week-06/day-03/lotteryfilter/src/main/java/otos.csv";
        String output = "C:/greenfox/pkrisz0/week-06/day-03/lotteryfilter/src/main/java/output.csv";
        List<String[]> lottoContent = new ArrayList<>();
        List<String[]> filteredLotto = new ArrayList<>();

        if (options.has( "y" )){
            try (CSVReader reader = new CSVReader(new FileReader(lotto))) {
                lottoContent = reader.readAll();
            } catch(Exception e){
                System.out.println("Problem.");
            }

            for (int i = 0; i < lottoContent.size(); i++) {
                if (lottoContent.get(i)[0].startsWith(input[1])){
                    filteredLotto.add(lottoContent.get(i));
                }
            }

            try (CSVWriter writer = new CSVWriter(new FileWriter(output))) {
                writer.writeAll(filteredLotto);
            } catch(Exception e){
                    System.out.println("Problem.");
            }
        }

        options.has( "f" );
        options.has( "o" );
    }
}
