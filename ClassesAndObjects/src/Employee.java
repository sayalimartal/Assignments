
public class Employee {

	private double employeeId;
	private String employeeName=new String();
	private double monthlyBasic;
	private static final int medicalAllowance=1250;
	private static final int conveyanceAllowance=800;
	private static double pfRate=0.1;
	
	public double getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(double employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getMonthlybasic() {
		return monthlyBasic;
	}
	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	
	public double getHra() {
		return (0.5*monthlyBasic);
	}
	
	
	public static double getPfRate() {
		return pfRate;
	}
	public static void setPfRate(double pfRate) {
		Employee.pfRate = pfRate;
	}
	
	public double getPf() {
		if((getPfRate()*monthlyBasic)<6500)
			return (getPfRate()*monthlyBasic);
		else
			return(6500);
	}
	
	public int getProffesionalTax() {
		if(monthlyBasic<=10000)
			return(50);
		else
			return(100);
	}
	
	public double getAnnualBasic() {
		return(12*monthlyBasic);
	}
	
	public double getMonthlyGrossSalary() {
		return(monthlyBasic+getHra()+medicalAllowance+conveyanceAllowance);
	}
	
	public double getAnnualGrossSalary() {
		return(12*getMonthlyGrossSalary());
	}
	
	public double getMonthlyDeductions() {
		return(12*getMonthlyGrossSalary());
	}
	
	public double getMonthlyTakeHome() {
		return(getMonthlyGrossSalary()-getMonthlyDeductions());
	}
	
	public double getAnnualTakeHome() {
		return(12*getMonthlyTakeHome());
	}
	
	public double getEsic() {
		if(monthlyBasic<=500)
			return(0.0475*monthlyBasic);
		else
			return(5000);
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", monthlyBasic="
				+ monthlyBasic + ", getEmployeeId()=" + getEmployeeId() + ", getEmployeeName()=" + getEmployeeName()
				+ ", getMonthlybasic()=" + getMonthlybasic() + ", getHra()=" + getHra() + ", getPf()=" + getPf()
				+ ", getProffesionalTax()=" + getProffesionalTax() + ", getAnnualBasic()=" + getAnnualBasic()
				+ ", getMonthlyGrossSalary()=" + getMonthlyGrossSalary() + ", getAnnualGrossSalary()="
				+ getAnnualGrossSalary() + ", getMonthlyDeductions()=" + getMonthlyDeductions()
				+ ", getMonthlyTakeHome()=" + getMonthlyTakeHome() + ", getAnnualTakeHome()=" + getAnnualTakeHome()
				+ ", getEsic()=" + getEsic() + "]";
	}
	
}
