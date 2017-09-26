public class Person {
    String name;
    int age;
    String gender; //this should be a boolean?

    public Person (String name, int age, String gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    public void introduce() {
        System.out.println("Hi, I'm " +  name + " a " + age + " year old "+ gender);
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }
}
