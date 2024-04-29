package activities;

class Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Employee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}

class PayrollCalculator {
    public static double calculatePayroll(Employee employee) {
        return employee.getHourlyRate() * employee.getHoursWorked();
    }
}

class EmployeeDetailsDisplayer {
    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Hourly Rate: $" + employee.getHourlyRate());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Payroll: $" + PayrollCalculator.calculatePayroll(employee));
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("inchara", 25.50, 40);
        EmployeeDetailsDisplayer.displayEmployeeDetails(employee);
    }
}

