package mycodes;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Main {
   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<employee> students = new ArrayList<>();

      File file = new File("C:\\Users\\ernar\\IdeaProjects\\mainP\\src\\text");
      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine()) {
         employee student = new employee();
         if(scanner.hasNext()) student.setName(scanner.next());
         if(scanner.hasNext()) student.setSurname(scanner.next());
         if(scanner.hasNext()) student.setGender(Boolean.parseBoolean(scanner.next()));
         if(scanner.hasNext()) student.setAge(Integer.parseInt(scanner.next()));
         if(scanner.hasNext()) student.setGPA(Double.parseDouble(scanner.next()));
         if(scanner.hasNext()) student.setPhoneNumber(scanner.next());
         students.add(student);
      }

      for ( employee student : students) {
         System.out.println(student.toString());
      }

      int age = scanner.nextInt();
      System.out.println("Your age is: "+age);
      String name = scanner.next();
      System.out.println("Your name is: "+name);

   }
}
