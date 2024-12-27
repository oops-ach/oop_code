package sources;

public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teacher() {    }

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int giveRaise(int percentage){
        percentage = percentage / 100;
        return salary * percentage;
    }

    @Override
    public String toString() {
        String genderString = isGender() ? "male" : "female";
        return "Hi, I am " + getName() + " "+ getSurname() + " a " + getAge() + " year-old " + "( "+ genderString +" )." + " I teach " + subject;
    }
}

