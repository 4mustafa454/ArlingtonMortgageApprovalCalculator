package mortgageApprovalCalculator;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		// TODO cAuto-generated method stub
		ArrayList<Qualify> qual = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Welcome to Arlington Mortgage Approval Calculator");
			System.out.println("1. Submit Application");
			System.out.println("2. Exit");
			System.out.println("Choose an option");
			int choice = input.nextInt();
			
			if(choice == 1)
			{
				submitApplication(qual,input);
			}
			else if(choice == 2)
			{
				System.out.println("Thank you for using Arlington Mortgage Approval Calculator");
				break;
			}
			else
			{
			    System.out.println("Please try Again");
				
			}
			
			
		}
		input.close();
		
		
		
		}
	
	
	   public static void submitApplication(ArrayList<Qualify> qual, Scanner input)
	   {
		   System.out.println(" NEW APPLICATION");
		   
		   System.out.print("Annual income: $");
		   double annualIncome = input.nextDouble();
		   
		   System.out.print("Total Monthly Debt Payment: $");
		   double monthlyDebt = input.nextDouble();
		   
		   System.out.print("Credit Score (250-850): ");
		   int creditScore = input.nextInt();
		   
		   System.out.print("House Price: $");
		   double housePrice = input.nextDouble();
		   
		   System.out.print("Down Payment: $");
		   double downPayment = input.nextDouble();
		   
		   System.out.println("Enter Credit Age: ");
		   int creditAge = input.nextInt();
		   
		   Income income  = new Income(monthlyDebt,annualIncome);
		   CreditScore credit = new CreditScore(monthlyDebt, creditScore, creditAge);
		   DownPayment downPay = new DownPayment(downPayment, housePrice);
		   Qualify approved = new Qualify(credit, income, downPay);
		   qual.add(approved);
		   System.out.println("Application Submitted");
		   approved.canBeApproved();
		   System.out.println();

		   
		   
	   }

}
