import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TodoApp extends ArrayList<Todo> {
    public static void main(String[] args) {
         welcome();
         TodoApp one = new TodoApp();
         one.add("walk the dog");
         one.add("buy milk");
         one.add("kill hitler");
         one.complete(2);
         one.delete(1);
         one.print();
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
