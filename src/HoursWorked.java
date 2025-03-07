public class HoursWorked {
    static class Employee {
        int id;
        String lastName;
        String firstName;
        String position;
        double salary;
        double hourlyRate;
        int hoursWorked;


        public Employee(int id, String lastName, String firstName, String position, double salary, double hourlyRate, int hoursWorked) {
            this.id = id;
            this.lastName = lastName;
            this.firstName = firstName;
            this.position = position;
            this.salary = salary;
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        public double calculateGrossSalary() {
            return hourlyRate * hoursWorked;
        }

        public void displayEmployee() {
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Position: " + position);
            System.out.println("Hourly Rate: PHP " + hourlyRate);
            System.out.println("Hours Worked: " + hoursWorked);
            System.out.println("Gross Salary: PHP " + calculateGrossSalary());
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(10001, "Garcia", "Manuel III", "Chief Executive Officer", 90000, 535.71, 160);
        Employee emp2 = new Employee(10002, "Lim", "Antonio", "Chief Operating Officer", 60000, 357.14, 160);
        Employee emp3 = new Employee(10003, "Aquino", "Bianca Sofia", "Chief Finance Officer", 60000, 357.14, 160);
        Employee emp4 = new Employee(10004, "Reyes", "Isabella", "Chief Marketing Officer", 60000, 357.14, 160);

        System.out.println("MotorPH Employee Payroll:");
        System.out.println("=========================");
        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();
        emp4.displayEmployee();
    }
}

