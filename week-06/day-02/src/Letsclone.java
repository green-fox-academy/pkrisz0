import java.util.ArrayList;

public class Letsclone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student john = new Student("John Doe", 20, "male", "BME");
        Student johnTheClone = john.clone();

        Student jane = new Student("Jane Doe", 60, "female", "BME");
        Student janeTheClone = jane.clone();

        ArrayList<Person> people = new ArrayList<>();

        people.add(john);
        people.add(johnTheClone);
        people.add(jane);
        people.add(janeTheClone);

        for(Person d:people) {
            System.out.println(d);
        }
    }
}
