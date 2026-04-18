package mortgageApprovalCalculator;

public class Income extends Debt
{
	private int incomeBeforeTax;
	Income(double totalMonthlyDebt, int incomeBeforeTax)
	{
		super(totalMonthlyDebt);
		this.incomeBeforeTax = incomeBeforeTax;
	}
	public int getIncomeBeforeTax()
	{
		return incomeBeforeTax;
	}
	public void setIncomeBeforeTax(int incomeBeforeTax)
	{
		this.incomeBeforeTax = incomeBeforeTax;
	}
	@Override
	public String toString()
	{
		return "The income before tax is" + getIncomeBeforeTax();
	}

}
