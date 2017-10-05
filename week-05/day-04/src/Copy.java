import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Copy {
    public static void main(String[] args) {

        hi();

        if(args == null){
            System.out.println("copy [source] [destination]");
        } else if (args.length == 1) {
            System.out.println("No destination provided");
        } else if (args.length > 0 && args[0].equals("cp") && args[1] != null && args[2] != null) {
            copy(args[1], args[2]);
        }
    }

    public static String hi(){
        return "command me master";
    }

    public static void copy(String source, String destination){
        Path sourcePath = Paths.get(source);
        Path destinationPath = Paths.get(destination);

        try {
            List<String> contentOfSource = Files.readAllLines(sourcePath);
            Files.write(destinationPath, contentOfSource);

        } catch (IOException e){
            System.out.println("Something went wrong.");
        }
    }
}

// This should be the basic replica of the 'cp' command
// If ran from the command line without arguments
// It should print out the usage:
// copy [source] [destination]
// When just one argument is provided print out
// No destination provided
// When both arguments provided and the source is a file
// Read all contents from it and write it to the destination

