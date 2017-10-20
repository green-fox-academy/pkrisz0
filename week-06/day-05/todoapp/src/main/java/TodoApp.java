import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class TodoApp extends ArrayList<Todo> {
    public TodoApp() {
    }

    public void argHandler(String[] input){
        OptionParser parser = new OptionParser();
        parser.accepts("l");
        parser.accepts("a").withRequiredArg();
        parser.accepts("r").withRequiredArg();
        parser.accepts("c").withRequiredArg();
        OptionSet options = parser.parse(input);

        if (options.has("l")) {
            this.read();
        }
        else if (options.has("a")) {
            this.add(String.valueOf(options.valueOf("a")));
        }
        else if (options.has("r")) {
            this.delete((Integer) (options.valueOf("r")));
        }
        else if (options.has("c")) {
            this.complete((Integer) options.valueOf("c"));
        } else {
            welcome();
        }

        this.write();
    }

    public void add(String description){
        this.add(new Todo(description));
    }

    public void delete(int index){
        this.remove(index - 1);
    }

    public void complete(int index) {
        this.get(index - 1).setComplete(true);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            sb.append(i + 1);
            sb.append(" - ");
            sb.append(this.get(i).toString());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void welcome(){
        try {
            Path filepath = Paths.get("C:/greenfox/pkrisz0/week-06/day-05/todoapp/src/main/java/usage.txt");
            List<String> lines = Files.readAllLines(filepath);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.out.println("Unable to write file: print_usage");
        }
    }

    public void write(){
        ArrayList<String> content = new ArrayList<>();
        content.add(this.toString());
        try {
            Path filepath = Paths.get("C:/greenfox/pkrisz0/week-06/day-05/todoapp/src/main/java/list.txt");
            Files.write(filepath, content);
        } catch (IOException e) {
            System.out.println("Unable to write list file.");
        }
    }

    public void read(){
        try {
            Path filepath = Paths.get("C:/greenfox/pkrisz0/week-06/day-05/todoapp/src/main/java/list.txt");
            List<String> list = Files.readAllLines(filepath);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } catch (IOException e) {
            System.out.println("Unable to read the list");
        }
    }
}
