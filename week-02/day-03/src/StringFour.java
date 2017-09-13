public class StringFour {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";

        String todoAll = todoText.concat(" - Download games\n".concat(" - Diablo\n"));

        System.out.println(todoAll);
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
