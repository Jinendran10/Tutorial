public class Employee {
    public void display() {
        System.out.println("Name of class in Employee");
    }

    public void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}
public class Engineer extends Employee {
    public void calcSalary() {
        System.out.println("Salary of employee is 20000");
    }
}
public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.display();  // Output: Name of class in Employee
        engineer.calcSalary();  // Output: Salary of employee is 20000
    }
}
