package mycodes;

public class employee {
    private static int id = 1;
    private int id_gen;
    private String name;
    private String surname;
    private boolean gender;
    private int age;
    private double GPA;
    private String phoneNumber;

    public employee() { //no arg constructor
        id_gen = id++;
    }

    public employee(String name, String surname, boolean gender, int age, double GPA, String phoneNumber) {
        this();
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.GPA = GPA;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }


    public void setGender(boolean gender) { this.gender = gender;}

    public String getGender() {return gender ? "male" : "female";}



    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return GPA;
    }



    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){return phoneNumber;}

    @Override
    public String toString() {
        return "Student id: " + id_gen +
                "\nFull name: " + name + " " + surname +
                "\nGender: " + getGender() +
                "\nAge: " + age +
                "\nGPA: " + GPA +
                "\nPhone Number: " + phoneNumber;
    }
}

