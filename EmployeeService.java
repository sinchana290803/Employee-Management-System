package project;
	import java.util.HashSet;
	import java.util.Scanner;

	public class EmployeeService {

	    HashSet<Employee> empset = new HashSet<Employee>();

	    Employee emp1 = new Employee(101, "Shital", 24, "Developer", "IT", 25000);
	    Employee emp2 = new Employee(102, "Meena", 26, "Tester", "CO", 57000);
	    Employee emp3 = new Employee(103, "Bob", 20, "DevOps Eng", "Admin", 5000);
	    Employee emp4 = new Employee(104, "Max", 27, "System Eng", "CO", 70000);

	    Scanner sc = new Scanner(System.in);

	    public EmployeeService() {
	        empset.add(emp1);
	        empset.add(emp2);
	        empset.add(emp3);
	        empset.add(emp4);
	    }

	    // View all employees
	    public void viewAllEmps() {
	        for (Employee emp : empset) {
	            System.out.println(emp);
	        }
	    }

	    // View single employee
	    public void viewEmp() {
	        System.out.println("Enter Employee ID: ");
	        int id = sc.nextInt();
	        boolean found = false;
	        for (Employee emp : empset) {
	            if (emp.getId() == id) {
	                System.out.println(emp);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("Employee with this ID is not present.");
	        }
	    }

	    // Update employee
	    public void updateEmployee() {
	        System.out.println("Enter Employee ID: ");
	        int id = sc.nextInt();
	        boolean found = false;
	        for (Employee emp : empset) {
	            if (emp.getId() == id) {
	                System.out.println("Enter new name: ");
	                String name = sc.next();
	                System.out.println("Enter new salary: ");
	                double sal = sc.nextDouble();
	                emp.setName(name);
	                emp.setSalary(sal);
	                System.out.println("Updated Details of Employee: ");
	                System.out.println(emp);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("Employee not present.");
	        } else {
	            System.out.println("Employee details updated successfully!");
	        }
	    }

	    // Delete employee
	    public void deleteEmp() {
	        System.out.println("Enter Employee ID: ");
	        int id = sc.nextInt();
	        Employee empToDelete = null;
	        boolean found = false;
	        for (Employee emp : empset) {
	            if (emp.getId() == id) {
	                empToDelete = emp;
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("Employee not present.");
	        } else {
	            empset.remove(empToDelete);
	            System.out.println("Employee deleted successfully!");
	        }
	    }

	    // Add employee
	    public void addEmp() {
	        System.out.println("Enter Employee ID: ");
	        int id = sc.nextInt();
	        System.out.println("Enter name: ");
	        String name = sc.next();
	        System.out.println("Enter age: ");
	        int age = sc.nextInt();
	        System.out.println("Enter designation: ");
	        String designation = sc.next();
	        System.out.println("Enter department: ");
	        String department = sc.next();
	        System.out.println("Enter salary: ");
	        double sal = sc.nextDouble();

	        Employee emp = new Employee(id, name, age, designation, department, sal);

	        if (empset.add(emp)) {
	            System.out.println(emp);
	            System.out.println("Employee added successfully!");
	        } else {
	            System.out.println("Employee with this ID already exists.");
	        }
	    }

		public void addEmp1() {
			// TODO Auto-generated method stub
			
		}
	}


