package mortgageApprovalCalculator;

public class Debt 
{
	private double totalMonthlyDebt;
	Debt(double totalMonthlyDebt)
	{
		this.totalMonthlyDebt = totalMonthlyDebt;
	}
	public double getTotalMonthlyDebt()
	{
		return totalMonthlyDebt;
	}
	public void setTotalMonthlyDebt(double totalMonthlyDebt)
	{
		this.totalMonthlyDebt = totalMonthlyDebt;
	}
	@Override
	public String toString()
	{
		return "The total monthly debt is " + getTotalMonthlyDebt();
	}
 
}
