public class SecondsInADay {
    public static void main(String[] args){
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables

        // ido most 14:34:42

        int remaining = (60 - currentSeconds) + ((60 - currentMinutes) * 60) + ((24 - currentHours) * 60 * 60);
        System.out.println(remaining);
    }
}
