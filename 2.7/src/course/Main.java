package course;

/* Considerați o clasa Curs la care mai mulți Studenti se înscriu. Metoda prezenta() din clasa Curs
poate fi apelată de mai mute ori. La fiecare apel, toți studenții îi trimit numele
și un status (prezent/absent, generat random). Metoda prezenta() afișează numele studentilor
de la curs și status-ul returnat. */
// OBSERVER PATTERN

public class Main {

    public static void main(String[] args) {

        Course course = new Course();
        Student student1 = new Student("Ana");
        Student student2 = new Student("Mihai");
        Student student3 = new Student("Alina");
        Student student4 = new Student("Mircea");
        Student student5 = new Student("Andreea");
        student1.subscribeToCourse(course);
        student2.subscribeToCourse(course);
        student3.subscribeToCourse(course);
        student4.subscribeToCourse(course);
        student5.subscribeToCourse(course);

        System.out.println("------------------");
        course.attendance();
        System.out.println("------------------");
        course.attendance();
    }
}