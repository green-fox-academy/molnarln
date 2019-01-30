package teachersandstudents;

public class TeachersAndStudentsMain {
    public static void main(String[] args) {
        Student student1 = new Student("Alex");
        Teacher teacher1 = new Teacher("Marika");

        student1.question(teacher1);

        teacher1.teach(student1);

    }
}
