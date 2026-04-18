package mortgageApprovalCalculator;

public class CreditScore extends Debt 
{
	private int Score;
	private int creditAge;
	CreditScore(double totalMonthlyDebt,int Score,int creditAge)
	{
		super(totalMonthlyDebt);
		this.Score = Score;
		this.creditAge = creditAge;
	}
	public int getScore()
	{
		return Score;
	}
	public void setScore(int Score)
	{
		this.Score = Score;
	}
	public int getCreditAge()
	{
		return creditAge;
	}
	public void setCreditAge(int creditAge)
	{
		this.creditAge = creditAge;
	}
	public String scoreStatement()
	{
		return "The credit score is " + getScore() +  " with a age of " + getCreditAge() + "With your total monthly debt standing at " + getTotalMonthlyDebt() + "per month";
	}
	
	
	

}
