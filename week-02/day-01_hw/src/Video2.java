public class Video2 {
    public static void main (String[] args) {

        // here we declare an array
        int[] randomArray;
        //here we define how big it is
        int[] numberArray = new int[10];

        randomArray = new int[20];
        // value of second variable in this array
        randomArray[1] = 2;

        // you can also define it like this
        String[] stringArray = {"just", "random", "Words"};

        //adding values through a loop
        for(int i = 0; i < numberArray.length; i++){
            numberArray[i] = i;
        }

        // exmaple

        int k = 1;
        while (k <= 41){
            System.out.print('-');
            k++;
        }
        System.out.println();

        for(int j = 0; j < numberArray.length; j++) {
            System.out.print("| " + j + " ");
        }
        System.out.print("|");

        //multidimensional array

        String[][] multiArray = new String[10][10];
        //how wide
        for (int i = 0; i <multiArray.length; i++){
        //how long
            for(int j = 0; j < multiArray[i].length; j++){
                multiArray[i][j] = i + " " + j;
            }
        }
        System.out.println();

        k = 1;
        while (k <= 61){
            System.out.print('-');
            k++;
        }
        System.out.println();

        for (int i = 0; i <multiArray.length; i++) {
            //how long
            for (int j = 0; j < multiArray[i].length; j++) {

                System.out.print("| " + multiArray[i][j] + " ");

            }
            System.out.println(" |");
        }

        k = 1;
        while (k <= 61) {
            System.out.print('-');
            k++;
        }
        System.out.println();

        // enhanced for loop to print out array values

        for (int row : numberArray) {
            System.out.print(row);
        }
        System.out.println("\n");
    }

}

