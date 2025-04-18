
import java.util.ArrayList; // ye arrayList ki library hai
import java.util.Scanner; // ye user se input k leay library hai

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        //...........ArrayList Property................
        // 1 => Add
        // 2 => Get
        // 3 => Modify
        // 4 => Delete/Remove
        // 5 => Iterate

        ArrayList<Employee> employees = new ArrayList<Employee>();
        Scanner scanner = new Scanner(System.in); // ye scanner k sath hum user se data input leen ge

        while (true) {
            System.out.println("Enter 1 => add a new (Employee) : 0 => exit program and show all data. ");
            int option = scanner.nextInt();
            if (option == 0) {
                break;
            } else if (option == 1) {
                System.out.println("Enter Employee category { 1 => for (Permanent Employee), 2 => for (Contractual Employee), and 0 => to exit program. }");
                int type = scanner.nextInt();
                scanner.nextLine(); // ye new line add kar di gi wesy println() bhi same karti hai

                if (type == 0) {
                    break;
                }

                System.out.print("Enter Employee Name: ");
                String employeeName = scanner.nextLine();
                System.out.print("Enter Employee ID: ");
                int employeeId = scanner.nextInt();
                System.out.print("Enter Employee Salary: ");
                double employeeSalary = scanner.nextDouble();

                // yahan par Restriction hai ta k koi user same id use na kar saky
                boolean exists = false;

                for (int i = 0; i < employees.size(); i++) {
                    Employee emp = employees.get(i);
                    
                    if (emp.getEmployeeId() == employeeId) { 
                        exists = true;
                        break; 
                    }
                }


                if (exists) {
                    System.out.println("This user ID already exists. Please try different ID.");
                } else {
                    Employee newEmployee;
                    if (type == 1) {
                        newEmployee = new Employee(employeeName, employeeId, employeeSalary, "Permanent Employee");
                    } else {
                        newEmployee = new Employee(employeeName, employeeId, employeeSalary, "Contractual Employee");
                    }
                    employees.add(newEmployee);
                    System.out.println("Employee Added Successfully!");
                }
            }   
            else {
                    System.out.println("Invalid option please enter (1) or (0).");
            }
        }

        // yahan par hum private value ko set kar rhy hain Aur Employee class mian get kar rhy hain
        // aur sath all employee ka data show kar rhy hain
            System.out.println("\n All Employee List Data:");
            for (int i = 0; i < employees.size(); i++) {  
                Employee emp = employees.get(i); 
                System.out.println("************************************************************");
                System.out.println("Employee " + (i + 1) + ":");
                System.out.println("Employee Name : " + emp.getEmployeeName());
                System.out.println("Employee ID : " + emp.getEmployeeId());
                System.out.println("Employee Designation : " + emp.getEmployeeDesignation());
                System.out.println("Employee Salary : " + emp.getEmployeeSalary());
                System.out.println("************************************************************");
            }


        scanner.close();
    }
}
