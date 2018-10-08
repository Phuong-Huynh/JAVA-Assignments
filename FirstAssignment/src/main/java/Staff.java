import java.util.Date;

public class Staff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	private String staffNum;
	private String staffName;
	private Date staffBirthday;
	private String staffAddress;
	//private double staffBasicSalary;
	
	private double staffSalary;
	
	public String getStaffNum() {
		return staffNum;
	}
	public void setStaffNum(String staffNum) {
		this.staffNum = staffNum;
	}
	
	public String getStaffName() {
		return staffName;
	}
	
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public Date getStaffBirthday() {
		return staffBirthday;
	}
	public void setStaffBirthday(Date staffBirthday) {
		this.staffBirthday = staffBirthday;
	}
	public String getStaffAddress() {
		return staffAddress;
	}
	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}
	
	/*	
	public double getStaffBasicSalary() {
		return staffBasicSalary;
	}
	public void setStaffBasicSalary(double staffBasicSalary) {
		this.staffBasicSalary = staffBasicSalary;
	}*/
	
	// caculate salary for employee
	
	public double salCaculate()	{
		
		return staffSalary;
	}
	

}
