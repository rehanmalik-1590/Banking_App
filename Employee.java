public class Employee {
    private String employeeName;
    private int employeeId;
    private double employeeSalary;
    private String employeeDesignation;

    // This is constructor 
    public Employee(String employeeName, int employeeId, double employeeSalary, String employeeDesignation) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
        this.employeeDesignation = employeeDesignation;
    }

    // Yahan par hum private value ko get kar rhy hain ta k usko access kar saky
    // aur EmployeeManagementSystem k ander yahi data ko set kareen ge aur access kareen ge private variabls
    public String getEmployeeName() { 
        return employeeName; 
    }
    public int getEmployeeId() { 
        return employeeId; 
    }
    public double getEmployeeSalary() { 
        return employeeSalary; 
    }
    public String getEmployeeDesignation() { 
        return employeeDesignation; 
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Designation: " + employeeDesignation);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}

        // Super aik keyword hai ye bhi Inheritance ka part hai, jab kisi child class k ander parent class
        // k constructor, method, koi bhi property use karni hai to phir Super Keyword ka use hota hai
class PermanentEmployee extends Employee {
    public PermanentEmployee(String employeeName, int employeeId, double employeeSalary) {
        super(employeeName, employeeId, employeeSalary, "Permanent Employee");
        System.out.println("Permanent Employee Added Successfully: " + employeeName);
    }
}


class ContractualEmployee extends Employee {
    public ContractualEmployee(String employeeName, int employeeId, double employeeSalary) {
        super(employeeName, employeeId, employeeSalary, "Contractual Employee");
        System.out.println("Contractual Employee Added Successfully: " + employeeName);
    }
}
