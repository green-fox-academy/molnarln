package cloneable;

public class CloneMain {
    public static void main(String[] args) {

    Student student1 = new Student("John", 20, "male", "BME");
    Student student2 = student1.clone();

    System.out.println(student2.name);

    student2.name = "Zoli";
        System.out.println(student1.name);


    }
}
