public class Cuboid {
    public static void main(String[] args){

        //Surface Area: 600 2*(ab + bc + ac)
        // Volume: 1000 a*b*c

        double a = 1.256;
        double b = 1.569;
        double c = 1.878;

        double surface = 2 * (a * b + b * c + a * c);
        double volume = a * b * c;

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);

    }
}
