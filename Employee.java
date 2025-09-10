package project;
	public class Employee {

	    private int id;
	    private String name;
	    private int age;
	    private String designation;
	    private String department;
	    private double salary;

	    // Constructor
	    public Employee(int id, String name, int age, String designation, String department, double salary) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.designation = designation;
	        this.department = department;
	        this.salary = salary;
	    }

	    // Getters & Setters
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public String getDesignation() {
	        return designation;
	    }
	    public void setDesignation(String designation) {
	        this.designation = designation;
	    }
	    public String getDepartment() {
	        return department;
	    }
	    public void setDepartment(String department) {
	        this.department = department;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // toString()
	    @Override
	    public String toString() {
	        return "Employee [ID=" + id + ", Name=" + name + ", Age=" + age +
	                ", Designation=" + designation + ", Department=" + department +
	                ", Salary=" + salary + "]";
	    }
	}


