
public class StaffManage extends Staff {
	private int salRatio;

	public int getSalRatio() {
		return salRatio;
	}

	public void setSalRatio(int salRatio) {
		this.salRatio = salRatio;
	}
	@Override
	public double salCaculate()
	{
	  return salRatio*55000;
	}
}
