public class BMI {
    public static void main(String[] args){

        double massInKg = 81.2;
        double heightInM = 1.78;

        // bmi = weight/height^2

        System.out.println("Your BMI is: " + massInKg / (heightInM * heightInM) + " %");
    }
}
