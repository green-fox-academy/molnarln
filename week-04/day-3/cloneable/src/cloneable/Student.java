package cloneable;


public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public Student (String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
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

    @Override
    public Student clone(){
        Student cloneStudent = new Student(this.name, this.age, this.gender, this.previousOrganization);

        return cloneStudent;
    }
}
