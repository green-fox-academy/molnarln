package gfainheritance;

public class Mentor extends Person {
    String level;

    public Mentor (String name, int age, String gender, String level) {
        super();
        this.level = level;
    }

    public Mentor () {
        super();
        this.level = "intermediate";
    }

    @Override
    public void getGoal () {
        System.out.println("Educate brilliant junior sorfware developers.");
    }

    @Override
    public  void introduce () {
        System.out.println("Hi, I'm " + name + " a" + age + " year old " + gender + level + " mentor.");
    }



}
