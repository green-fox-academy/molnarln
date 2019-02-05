package gfainheritance;

public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public Student (String name, int age, String gender, String previousOrganization, int skippedDays) {
        super();
        this.previousOrganization = previousOrganization;
        this.skippedDays = skippedDays;
    }

    public Student () {
        super();
        this.previousOrganization = "The School of Live";
        this.skippedDays = 0;
    }

    @Override
    public void getGoal () {
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce () {
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays (int numberOfDays) {
        this.skippedDays += numberOfDays;
    }



}
