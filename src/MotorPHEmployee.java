public class MotorPHEmployee {

    static class Employee {
        int id;
        String lastName;
        String firstName;
        String position;
        double salary;

        public Employee(int id, String lastName, String firstName, String position, double salary) {
            this.id = id;
            this.lastName = lastName;
            this.firstName = firstName;
            this.position = position;
            this.salary = salary;
        }

        public void displayEmployee() {
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Position: " + position);
            System.out.println("Basic Salary: PHP " + salary);
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(10001, "Garcia", "Manuel III", "Chief Executive Officer", 90000);
        Employee emp2 = new Employee(10002, "Lim", "Antonio", "Chief Operating Officer", 60000);
        Employee emp3 = new Employee(10003, "Aquino", "Bianca Sofia", "Chief Finance Officer", 60000);
        Employee emp4 = new Employee(10004, "Reyes", "Isabella", "Chief Marketing Officer", 60000);

        System.out.println("MotorPH Employee Data:");
        System.out.println("======================");
        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();
        emp4.displayEmployee();
    }
}
