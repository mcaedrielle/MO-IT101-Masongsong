import java.util.Scanner;

public class GovernmentDeductions {

    static class Employee {
        int id;
        String lastName;
        String firstName;
        String position;
        double basicSalary;
        double hourlyRate;
        int hoursWorked;

        public Employee(int id, String lastName, String firstName, String position, double basicSalary, double hourlyRate, int hoursWorked) {
            this.id = id;
            this.lastName = lastName;
            this.firstName = firstName;
            this.position = position;
            this.basicSalary = basicSalary;
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        public double calculateGrossSalary() {
            return hourlyRate * hoursWorked;
        }

        public double calculateSSS() {
            return 0.045 * basicSalary; // 4.5% of the basic salary
        }

        public double calculatePhilHealth() {
            return 0.03 * basicSalary; // 3% of the basic salary
        }

        public double calculatePagIbig() {
            return Math.min(100, 0.02 * basicSalary); // 2% capped at PHP 100
        }

        public double calculateIncomeTax() {
            double taxableIncome = basicSalary - (calculateSSS() + calculatePhilHealth() + calculatePagIbig());
            if (taxableIncome <= 25000) {
                return 0; // No tax for incomes below PHP 25,000
            } else if (taxableIncome <= 40000) {
                return 0.1 * (taxableIncome - 25000); // 10% tax on excess over PHP 25,000
            } else {
                return 0.2 * (taxableIncome - 40000) + 1500; // 20% tax on excess over PHP 40,000
            }
        }

        public double calculateNetSalary() {
            return calculateGrossSalary() - (calculateSSS() + calculatePhilHealth() + calculatePagIbig() + calculateIncomeTax());
        }

        public void displayPayroll() {
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Position: " + position);
            System.out.println("Hourly Rate: PHP " + hourlyRate);
            System.out.println("Hours Worked: " + hoursWorked);
            System.out.println("Gross Salary: PHP " + calculateGrossSalary());
            System.out.println("SSS Deduction: PHP " + calculateSSS());
            System.out.println("PhilHealth Deduction: PHP " + calculatePhilHealth());
            System.out.println("Pag-IBIG Deduction: PHP " + calculatePagIbig());
            System.out.println("Income Tax: PHP " + calculateIncomeTax());
            System.out.println("Net Salary: PHP " + calculateNetSalary());
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee emp1 = new Employee(10001, "Garcia", "Manuel III", "Chief Executive Officer", 90000, 535.71, 160);
        Employee emp2 = new Employee(10002, "Lim", "Antonio", "Chief Operating Officer", 60000, 357.14, 160);
        Employee emp3 = new Employee(10003, "Aquino", "Bianca Sofia", "Chief Finance Officer", 60000, 357.14, 160);
        Employee emp4 = new Employee(10004, "Reyes", "Isabella", "Chief Marketing Officer", 60000, 357.14, 160);

        System.out.println("MotorPH Employee Payroll:");
        System.out.println("=========================");
        emp1.displayPayroll();
        emp2.displayPayroll();
        emp3.displayPayroll();
        emp4.displayPayroll();

        scanner.close();
    }
}

