package mortgageApprovalCalculator;

public class DownPayment implements Approved
{
	private double payment;
	private double housePrice;
	
	public DownPayment(double payment, double housePrice)
	{
		this.payment = payment;
		this.housePrice = housePrice;
	}
	public double getPayment()
	{
		return payment;
	}
	public double getHousePrice()
	{
		return housePrice;
	}
    @Override
    public boolean canBeApproved()
	{
		double minimum = getHousePrice() * 0.03;
		if(getPayment() >= minimum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
