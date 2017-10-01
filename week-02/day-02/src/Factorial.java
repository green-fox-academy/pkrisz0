public class Factorial {
        public static void main(String[] args) {
            System.out.println(factorio(5));
        }

        public static int factorio(int input){
            int fact = 1;
            for (int i = 1; i <= input; i++){
                fact *= i;
            }
            return fact;
        }
}
