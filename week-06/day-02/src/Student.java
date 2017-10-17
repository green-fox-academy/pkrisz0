public class Student extends Person implements Cloneable {
    String previousOrganization;
    int skippedDays;

    public Student() {
        super();
        this.skippedDays = 0;
        this.previousOrganization = "The School of Life";
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name,age,gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " from " +  previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public int skipDays(int numberOfDays) {
        this.skippedDays++;
        return this.skippedDays;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    @Override
    public String toString() {
        return name + ", " +  age + ", " + gender;
    }
}

