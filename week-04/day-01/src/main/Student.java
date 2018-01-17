package main.java;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public void learn() {

    }

    public void question(Teacher teacher) {
        teacher.answer();
    }
}
