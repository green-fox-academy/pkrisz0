import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class TodoApp extends ArrayList<Todo> {
    public TodoApp() {
        welcome();
    }

    public static void main(String[] args) {
        TodoApp one = new TodoApp();
        one.argHandler(args);
    }

    public void argHandler(String[] input){
        OptionParser parser = new OptionParser();
        parser.accepts("l").withRequiredArg();
        parser.accepts("a").withRequiredArg();
        parser.accepts("r").withRequiredArg();
        parser.accepts("c").withRequiredArg();
        OptionSet options = parser.parse(input);

        if (options.has("l")) {
            this.print();
        } if (options.has("a")){
            this.add(String.valueOf(options.valueOf("a")));
        } if (options.has("r")){
            this.delete((Integer)(options.valueOf("r")));
        } if (options.has("c")){
            this.complete((Integer)options.valueOf("c"));
        }
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

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            sb.append(i + 1);
            sb.append(" - ");
            sb.append(this.get(i));
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void welcome(){
        try {
            Path filepath = Paths.get("C:/greenfox/pkrisz0/week-06/day - 05/todoapp/src/main/java/usage.txt");
            List<String> lines = Files.readAllLines(filepath);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.out.println("Unable to write file: print_usage");
        }
    }
}
