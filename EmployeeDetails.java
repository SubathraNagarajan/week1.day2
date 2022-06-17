package assignment.day2;

public class EmployeeDetails {
	String empName = "Subathra";
	int empId = 62533;
	String empAddress = "Coimbatore";
	double empSalary = 5645646.867897;
	long mobNum = 9600712425L;
		
	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		obj.printEmployeeName("Subathra", 62533);
		obj.printEmployeeAddress("Coimbatore");
		obj.printEmployeeSalary(1264654.896786);
		obj.printEmployeeMobileNumber(9600712425L);
		}
	
		public void printEmployeeName(String empName, int empId) 
		{
			System.out.println("Employee Name is "+empName);
			System.out.println("Employee ID is "+empId);
		}
		public void printEmployeeAddress(String empAddress) {
			System.out.println("Employee Address is "+empAddress);
			
		}
		public void printEmployeeSalary(double empSalary) {
			System.out.println("Employee Salary is "+empSalary);
		
		}
		public void printEmployeeMobileNumber(long mobNum) {
			System.out.println("Employee Mobile Number is "+mobNum);
		}

	}