package mortgageApprovalCalculator;

public class Income extends Debt
{
	private double incomeBeforeTax;
	Income(double totalMonthlyDebt, double incomeBeforeTax)
	{
		super(totalMonthlyDebt);
		this.incomeBeforeTax = incomeBeforeTax;
	}
	public double getIncomeBeforeTax()
	{
		return incomeBeforeTax;
	}
	public void setIncomeBeforeTax(double incomeBeforeTax)
	{
		this.incomeBeforeTax = incomeBeforeTax;
	}
	public double getMonthlyIncome()
	{
		return getIncomeBeforeTax()/12;
	}
	@Override
	public String toString()
	{
		return "The income before tax is" + getIncomeBeforeTax();
	}

}
