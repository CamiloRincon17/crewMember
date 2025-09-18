package EjerciciosResueltos.Tree;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jane", "A.", "Doe", "Smith", 28, 1.65, 'F', false);
        Person person2 = new Person("John", "B.", "Brown", "Johnson", 35, 1.80, 'M', true);
        person1.ShowFullInfo();
        person2.ShowFullInfo();
    } 
}
