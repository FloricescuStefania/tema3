package course;

import java.util.Random;

public class Student {

    private String name;

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean generateStatus() {

        Random random = new Random();
        return random.nextBoolean();
    }

    public String sendStatus() {

        if(generateStatus()) {
            return "present";
        } else {
            return "absent";
        }
    }

    public void subscribeToCourse(Course course) {
        course.addStudent(this);
    }
}