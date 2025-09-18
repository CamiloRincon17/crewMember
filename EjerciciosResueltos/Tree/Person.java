package EjerciciosResueltos.Tree;

public class Person {
    String firstName;
    String middleName;
    String firstLastName;
    String secondLastName;
    int age;
    double heightInMeters;
    char sex;
    boolean maritalStatus;
    public Person(String firstName, String middleName, String firstLastName, String secondLastName, int age, double heightInMeters, char sex, boolean maritalStatus) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.age = age;
        this.heightInMeters = heightInMeters;
    }
    void ShowFullInfo(){
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("First Last Name: " + firstLastName);
        System.out.println("Second Last Name: " + secondLastName);
        System.out.println("Age: " + age);
        System.out.println("Height in Meters: " + heightInMeters);
        System.out.println("sex"+sex);
        System.out.println("Marital Status: " + maritalStatus);
    }
}
