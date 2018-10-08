
public class StaffProduction extends Staff {
	private int numProduct;
	private double basicSalary;

	public int getNumProduct() {
		return numProduct;
	}

	public void setNumProduct(int numProduct) {
		this.numProduct = numProduct;
	}
	
	@Override
	public double salCaculate()
	{
	  return numProduct*basicSalary;
	}
	

}
