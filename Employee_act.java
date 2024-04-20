package activities;

public class Employee_act {
    private String name;
    private int employeeID;
    private double salary;

    
    public Employee_act(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the employee ID
    public int getEmployeeID() {
        return employeeID;
    }

    // Method to set the employee ID
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    // Method to get the salary
    public double getSalary() {
        return salary;
    }


    // Method to set the salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        
        Employee_act employee = new Employee_act("John", 12345, 50000);

        
        System.out.println("Initial Employee Details:");
        employee.displayEmployeeDetails();

        
        employee.setName("Inchara");
        employee.setEmployeeID(67890);
        employee.setSalary(55000);

        
        System.out.println("\nUpdated Employee Details:");
        employee.displayEmployeeDetails();
    }
}

