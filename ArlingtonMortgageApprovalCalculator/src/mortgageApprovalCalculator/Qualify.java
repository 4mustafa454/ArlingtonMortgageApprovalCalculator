package mortgageApprovalCalculator;

public class Qualify  implements Approved
{
	private CreditScore score;
	private Income income;
	private DownPayment down;
	private double debtToIncome;
	Qualify(CreditScore score,Income income,DownPayment down)
	{
		this.score = score;
		this.income = income;
        this.down = down;
        debtToIncomeRatio();
		
	}
	
	public void debtToIncomeRatio()
	{
		this.debtToIncome = (income.getTotalMonthlyDebt()/ income.getMonthlyIncome());
		
	}
	public double getDebtToIncomeRatio()
	{
		return debtToIncome;
	}
	public void setDebtToIncomeRatio(double debtToIncome) 
	{
		this.debtToIncome = debtToIncome;
	}
	@Override
	public boolean canBeApproved()
	{
		if(score.getScore() < 620)
		{
			System.out.println("Denied: Credit score is too low (below 620).");
			return false;
		}
		if(debtToIncome > 35)
		{
			System.out.printf("Denied: Debt-to-income ratio too high %.1f%",debtToIncome);
			return false;
			
		}
		if(!down.canBeApproved())
		{
			System.out.println("Denied: Down payment is less than 3% of house price");
			return false;
		}
		System.out.println("Approved! For Mortgage");
		return true;
	}

}
