public class StringFour {
    public static void main(String[] args) {
        String todoText = "\n - Buy milk\n";

        String todoAll = todoText.concat(" - Download games\n".concat("\t - Diablo\n"));

        System.out.println("My todo" + todoAll);
    }
}

// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//  - Diablo

