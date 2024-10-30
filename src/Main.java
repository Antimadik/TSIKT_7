// Define the Student class
class Student implements Person {
    private String firstName;
    private String lastName;
    private int age;
    private String studentID;

    // Constructor
    public Student(String firstName, String lastName, int age, String studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentID = studentID;
    }

    // Implement the getInfo method
    @Override
    public void getInfo() {
        System.out.println("Student - Name: " + firstName + " " + lastName + ", Age: " + age + ", Student ID: " + studentID);
    }
}

// Define the Employee class
class Employee implements Person {
    private String firstName;
    private String lastName;
    private int age;

    // Constructor
    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Implement the getInfo method
    @Override
    public void getInfo() {
        System.out.println("Employee - Name: " + firstName + " " + lastName + ", Age: " + age);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create Student and Employee instances
        Student student = new Student("John", "Smith", 18, "129119");
        Employee employee = new Employee("Michael", "Johnson", 30);

        // Print information
        student.getInfo();
        employee.getInfo();
    }
}