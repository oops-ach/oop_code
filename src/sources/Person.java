package sources;

import java.util.Random;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    private int PersonID;
    private static Random randomID = new Random();

    public Person(){}

    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.PersonID = generateRandomID();
    }

    private int generateRandomID() {
        return 100000 + randomID.nextInt(900000);
    }

    public int getPersonID() {
        return PersonID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String genderString = gender ? "male" : "female";
        return "Hi, I am " + name + " " + surname + " a " + age + " year-old " + genderString +" "+ PersonID;
    }

}
