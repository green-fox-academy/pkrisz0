public class Matrix {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        //how wide
        for (int i = 0; i <matrix.length; i++){
            //how long
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = 0;
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }

        System.out.println();

        for (int i = 0; i <matrix.length; i++) {
            //how long
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
