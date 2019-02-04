package homework;

public class Student {
    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;

    }

    public Student(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
        skippedDays = 0;
    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void goal(){
        System.out.println("My goal is: Live for the moment!");
    }

    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    public void skipDays(int numberOfDays){
        this.skippedDays += numberOfDays;
    }


}
