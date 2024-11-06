class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    Employee(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Salary: " + salary);
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}
class Officer extends Employee {
    String specialization;

    Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    void printOfficerDetails() {
        printDetails();
        System.out.println("Specialization: " + specialization);
        printSalary();
    }
}
class Manager extends Employee {
    String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    void printManagerDetails() {
        printDetails();
        System.out.println("Department: " + department);
        printSalary();
    }
}
public class Main {
    public static void main(String[] args) {
        Officer officer = new Officer("John Doe", 30, "1234567890", "123 Main St", 50000, "Software Development");
        System.out.println("Officer Details:");
        officer.printOfficerDetails();

        System.out.println("\n");

        Manager manager = new Manager("Jane Doe", 35, "9876543210", "456 Elm St", 70000, "Marketing");
        System.out.println("Manager Details:");
        manager.printManagerDetails();
    }
}
