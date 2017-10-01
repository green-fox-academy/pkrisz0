public class SumElementsArray {
    public static void main(String[] args) {
        int[] ai = {3, 4, 5, 6, 7};

        int dummy = 0;

        for(int i = 0; i < ai.length; i++){
            dummy = dummy + ai[i];
        }

        System.out.println(dummy);
    }
}


// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`