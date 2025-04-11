package course;

import java.util.ArrayList;
import java.util.List;

public class Course implements CourseObserver {

    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void attendance() {
        for(Student student: students) {
            System.out.println(student.getName() + " - " + student.sendStatus());
        }
    }
}
