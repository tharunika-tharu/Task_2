public class Solution4 {
    //program the display employee information
    static abstract class Person {
        String name;
        int age;
        //constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        //Abstract method
        public abstract String toString();
    }
    static class Employee extends Person {
        int employeeID;
        double salary;

        //Constructor
        public Employee(String name, int age, int employeeID, double salary) {
            super(name, age); // Initialize parent class attributes
            this.employeeID = employeeID;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee[ID: " + employeeID + ", Name: " + name + ", Age: " + age + ", Salary: " + salary + "]";
        }
    }
    public static void main(String[] args) {
        Employee employee = new Employee("Priya", 30, 12345, 50000.0);
        System.out.println(employee);
    }
}


