

/*
 * Employee classs
 * Naresh Kc
 */
public class Employee {

	private String name;
	private int employeeId;
    public double salary;
	String payRate;
	private String joinDate;
	private String typeOfEmployee;
    int hours;
	
	Employee(){
		
	}
	
    Employee(String name, int employeeId, double salary,String payRate, String joinDate, String typeOfEmployee,int hours){
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		this.payRate = payRate;
		this.joinDate = joinDate;
		this.typeOfEmployee = typeOfEmployee;
		this.hours = hours;
	}
    
    Employee(String name, double salary, String payRate, String joinDate, String typeOfEmployee){
    	this.name = name;
		this.salary = salary;
		this.payRate = payRate;
		this.joinDate = joinDate;
		this.typeOfEmployee = typeOfEmployee;
    }
    
    public String toString(){
    	return ("Name: " + this.name + "\n" + "Employee ID: " + this.employeeId + "\n" + 
    	"Salary: " + this.salary + "\n" + "Pay Rate: " + this.payRate + "\n" + "Join Date: " + this.joinDate + "\n"
    	+  "Type of Employee: " + this.typeOfEmployee + "\n" + "Hours: " + this.hours);
    }
    
    void compareSalary(Employee another){
		if(this.salary >another.salary)
			System.out.println("salary greater");
		else
			System.out.println("salary less");
	}
    
    public static void compareSalary1(Employee employee1, Employee employee2) {
		 if(employee1.salary >employee2.salary)
				System.out.println("salary greater");
			else
				System.out.println("salary less");
		
	}
}