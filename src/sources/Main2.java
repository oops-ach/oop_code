package sources;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        School school = new School();

        File fileS = new File("C:\\Users\\ernar\\IdeaProjects\\mainP\\src\\sources\\students.txt");
        Scanner scanStudent = new Scanner(fileS);

       while (scanStudent.hasNextLine()) {
           Scanner lineScanner = new Scanner(scanStudent.nextLine());
           String name = lineScanner.next();
           String surname = lineScanner.next();
           int age = lineScanner.nextInt();
           boolean gender = lineScanner.next().equalsIgnoreCase("male");
           List<Integer> grades = new ArrayList<>();

           while(lineScanner.hasNextInt()) {
               grades.add(lineScanner.nextInt());
           }

           school.addMember(new Student(name, surname, age, gender, grades ));
           lineScanner.close();
       }


        File fileT = new File("C:\\Users\\ernar\\IdeaProjects\\mainP\\src\\sources\\teachers.txt");
       Scanner scanTeacher = new Scanner(fileT);

       while(scanTeacher.hasNextLine()){

           Scanner lineScanner = new Scanner(scanTeacher.nextLine());
           String name = lineScanner.next();
           String surname = lineScanner.next();
           int age = lineScanner.nextInt();
           boolean gender = lineScanner.next().equalsIgnoreCase("male");
           String subject = lineScanner.next();
           int yearOfExperience = lineScanner.nextInt();
           int salary = lineScanner.nextInt();

           school.addMember(new Teacher(name, surname, age, gender, subject, yearOfExperience, salary));
           lineScanner.close();
       }

        System.out.println(school);
    }
}
