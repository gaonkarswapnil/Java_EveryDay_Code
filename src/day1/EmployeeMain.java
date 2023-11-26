package day1;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.employeeId = 101;
		emp.employeeName = "Oliver";
		emp.employeeSalary = 45000.00f;
		
		System.out.println("Employee Id: "+emp.employeeId);
		System.out.println("Employee Name: "+emp.employeeName);
		System.out.println("Employee Salary: "+emp.employeeSalary);
	}

}
