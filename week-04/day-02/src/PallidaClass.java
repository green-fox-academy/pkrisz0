import java.util.ArrayList;

public class PallidaClass {
    String className;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public PallidaClass(String className) {
        this.className = className;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student student) {

        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    //student arraylist size getter
    public int getStudents() {
        return students.size();
    }

    //mentor arraylist size getter
    public int getMentors() {
        return mentors.size();
    }

    public void info() {
        System.out.println("Pallida " + className + " class has " + getStudents() + " students and " + getMentors() + " mentors.");
    }

}

/*
    Create a PallidaClass class that has the following

        fields:
        className: the name of the class
        students: a list of Students
        mentors: a list of Mentors
        methods:
        addStudent(Student): adds the given Student to students list
        addMentor(Mentor): adds the given Mentor to mentors list
        info(): prints out "Pallida className class has students.size students and mentors.size mentors."
        The PallidaClass class has the following constructors:

        PallidaClass(className): beside the given parameter, it sets students and mentors as empty lists

        */