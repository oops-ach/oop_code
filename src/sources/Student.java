package sources;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int studentID;
    private static int idCounter = 1;
    private List<Integer> grades;

    public Student() {}

    public Student(String name, String surname, int age, boolean gender, List<Integer> grades) {
        super(name, surname, age, gender);
        this.studentID = idCounter++;
        this.grades = grades != null ? grades : new ArrayList<>();
    }

    public void addGrade (int grade){
        grades.add(grade);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getIdCounter(){
        return idCounter;
    }

    public void setIdCounter(int idCounter){
        this.idCounter = idCounter;
    }

    public double calculateGPA() {
        int total = 0;
        for(int grade : grades){
            if(grade <= 100 && grade >=97 ) grade = (int) 4.0;
            else if(grade < 97 && grade >=93) grade = (int) 4.0;
            else if(grade < 93 && grade >= 90) grade = (int) 3.7;
            else if(grade < 90 && grade >=87) grade = (int) 3.3;
            else if(grade < 87 && grade >=83) grade = (int) 3.0;
            else if(grade < 83 && grade >=80) grade = (int) 2.7;
            else if (grade < 80 && grade >= 77) grade = (int) 2.3;
            else if (grade < 77 && grade >= 73) grade = (int) 2.0;
            else if (grade < 73 && grade >= 70) grade = (int) 1.7;
            else if (grade <70 && grade >= 67) grade = (int) 1.3;
            else if (grade < 67 && grade >= 63) grade = (int) 1.0;
            else if (grade < 63 && grade >= 60) grade = (int) 0.7;
            else if(grade < 60) grade = (int) 0.0;
            total += grade;
        }
        return grades.isEmpty() ? 0 : total / (double) grades.size();
    }

    @Override
    public String toString() {
        String genderString = isGender() ? "male" : "female";
        return "Hi, I am " + getName() + " "+ getSurname() + " a " + getAge() + " year-old " + "( "+ genderString +" )"+ ". I am student with ID - " + studentID;
    }
}
git config --global user.email "ernarorleu9988@gmail.com"
git config --global user.name "oops-ach"
