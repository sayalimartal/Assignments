import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter employee id");
		employee.setEmployeeId(sc.nextDouble());
		
		System.out.println("Enter employee name");
		employee.setEmployeeName(sc.nextLine());
		
		System.out.println("Enter employee's monthly basic salary");
		employee.setMonthlyBasic(sc.nextDouble());
		
	}
	
}
