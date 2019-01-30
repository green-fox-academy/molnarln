package teachersandstudents;

public class Student {

    String name;

    public Student(){
    }

    public Student(String name){
        this.name = name;
    }

    public void learn(){
        System.out.println(name + " learned today.");
    }

    public void question(Teacher teacher){

        teacher.answer();
    }

}
