
public class StaffWorker extends Staff{

	private int numDate;

	public int getNumDate() {
		return numDate;
	}

	public void setNumDate(int numDate) {
		this.numDate = numDate;
	}
	@Override
	public double salCaculate()
	{
	  return numDate*this.setStaffBasicSalary(staffBasicSalary);;
	}
}
