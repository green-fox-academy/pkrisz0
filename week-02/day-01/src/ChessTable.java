public class ChessTable {
    public static void main(String[] args) {

        int height = 8;
        int width = 4;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                //odd numbers
                if(i % 2 == 0){
                    System.out.print("% ");
                //even
                } else {
                    System.out.print(" %");
                }
            }
            System.out.println();
        }
    }
}
