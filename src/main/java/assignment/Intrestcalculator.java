package assignment;
import java.util.Scanner;

class InvalidAmountException extends Exception
{
	InvalidAmountException(String msg)
	{
		super(msg);
		
	}
}

class InvalidNoOfDaysException extends Exception
{
	InvalidNoOfDaysException(String msg)
	{
		super(msg);
		
	}
}

class InvalidAgeOfAccountHolderException extends Exception
{
	InvalidAgeOfAccountHolderException(String msg)
	{
		super(msg);
		
	}
}

class InvalidMonthlyAmountException extends Exception
{
	InvalidMonthlyAmountException(String msg)
	{
		super(msg);
		
	}
}

class InvalidNoOfMonthsException extends Exception
{
	InvalidNoOfMonthsException(String msg)
	{
		super(msg);
		
	}
}

abstract class Account {
	double intrestRate;
	double amount;
	abstract double calculateIntrest() throws InvalidAmountException, InvalidNoOfDaysException, InvalidAgeOfAccountHolderException,InvalidMonthlyAmountException,InvalidNoOfMonthsException; 
}

class FDAccount extends Account{
	int noofDays, ageofACHolder;

	@Override
	double calculateIntrest() throws InvalidAmountException,InvalidNoOfDaysException,InvalidAgeOfAccountHolderException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the FD amount");
		amount = scan.nextDouble();
		if(amount<=0)
		{
			throw new InvalidAmountException("Invalid Amount\n Amount should be Grater than 0");
		}
		System.out.println("Enter the number of days");
		noofDays = scan.nextInt();
		if(noofDays<=0)
		{
			throw new InvalidNoOfDaysException("Invalid Number Of Days\n Days should be Grater than 5");
		}
		System.out.println("enter your age");
		ageofACHolder = scan.nextInt();
		if(ageofACHolder<=0)
		{
			throw new InvalidAgeOfAccountHolderException("Invalid User Age");
		}
		if (amount < 10000000) {
			if ((noofDays >= 7 && noofDays <= 14)) {
				if (ageofACHolder <= 60) {
					intrestRate = (amount * 0.0450);
				} else {
					intrestRate = (amount * 0.0500);
				}
			}

			else if ((noofDays >= 15 && noofDays <= 29)) {
				if (ageofACHolder <= 60) {
					intrestRate = (amount * 0.0475);
				} else {
					intrestRate = (amount * 0.0525);
				}
			}

			else if ((noofDays >= 30 && noofDays <= 45)) {
				if (ageofACHolder <= 60) {
					intrestRate = (amount * 0.0550);
				} else {
					intrestRate = (amount * 0.060);
				}
			}

			else if ((noofDays >= 46 && noofDays <= 60)) {
				if (ageofACHolder <= 60) {
					intrestRate = (amount * 0.070);
				} else {
					intrestRate = (amount * 0.0750);
				}
			}

			else if ((noofDays >= 61 && noofDays <= 184)) {
				if (ageofACHolder <= 60) {
					intrestRate = (amount * 0.075);
				} else {
					intrestRate = (amount * 0.080);
				}
			}

			else if ((noofDays >= 185 && noofDays <= 365)) {
				if (ageofACHolder <= 60) {
					intrestRate = (amount * 0.080);
				} else {
					intrestRate = (amount * 0.085);
				}

			}

		} else {
			if ((noofDays >= 7 && noofDays <= 14)) {
				intrestRate = (amount * 0.0650);
			} else if ((noofDays >= 15 && noofDays <= 29)) {
				intrestRate = (amount * 0.0675);
			} else if ((noofDays >= 30 && noofDays <= 45)) {
				intrestRate = (amount * 0.0675);
			} else if ((noofDays >= 46 && noofDays <= 60)) {
				intrestRate = (amount * 0.0800);
			} else if ((noofDays >= 61 && noofDays <= 184)) {
				intrestRate = (amount * 0.0850);
			} else if ((noofDays >= 185 && noofDays <= 365)) {
				intrestRate = (amount * 0.1000);
			}
		}
		return intrestRate;
	}
}

class SBAccount extends Account {

	@Override
	double calculateIntrest() throws InvalidAmountException{
		Scanner scan = new Scanner(System.in);

		System.out.println("1.Normal\n 2. NRI");
		System.out.println("Enter your Choice");
		int ch = scan.nextInt();

		if (ch == 1) {
			System.out.println("Enter the average amount in your account ");
			amount = scan.nextDouble();
			if(amount<=0)
			{
				throw new InvalidAmountException("Invalid Amount\n Amount should be Grater than 0");
			}
			intrestRate = amount * 0.0400;
		} else if (ch == 2) {
			System.out.println("Enter the average amount in your account ");
			amount = scan.nextDouble();
			if(amount<=0)
			{
				throw new InvalidAmountException("Invalid Amount\n Amount should be Grater than 0");
			}
			intrestRate = amount * 0.0600;
		} else {
			System.out.println("Wrong choice");
		}
		return intrestRate;
	}

}

class RDAaccount extends Account {
	int noofMonths, ageofACHolder;
	double monthlyAmount;

	@Override
	double calculateIntrest() throws InvalidMonthlyAmountException,InvalidNoOfMonthsException,InvalidAgeOfAccountHolderException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Monthly Amount");
		monthlyAmount = scan.nextDouble();
		if(monthlyAmount<=0)
		{
			throw new InvalidMonthlyAmountException("Invalid monthly Amount\n Monthly Amount should be Grater than 0");
		}
		System.out.println("Enter Number of Months");
		noofMonths = scan.nextInt();
		if(noofMonths<=0)
		{
			throw new InvalidNoOfMonthsException("Invalid Number of months");
		}
		System.out.println("enter your age");
		ageofACHolder = scan.nextInt();
		if(ageofACHolder<=0)
		{
			throw new InvalidAgeOfAccountHolderException("Invalid User Age");
		}
		if (noofMonths >= 1 && noofMonths <= 6) {
			if (ageofACHolder <= 60) {
				intrestRate = (monthlyAmount * 0.0750);
			} else {
				intrestRate = (monthlyAmount * 0.0800);
			}
		}

		else if (noofMonths >= 7 && noofMonths <= 9) {
			if (ageofACHolder <= 60) {
				intrestRate = (monthlyAmount * 0.0775);
			} else {
				intrestRate = (monthlyAmount * 0.0825);
			}
		}

		else if (noofMonths >= 10 && noofMonths <= 12) {
			if (ageofACHolder <= 60) {
				intrestRate = (monthlyAmount * 0.0800);
			} else {
				intrestRate = (monthlyAmount * 0.0850);
			}
		}

		else if (noofMonths >= 13 && noofMonths <= 15) {
			if (ageofACHolder <= 60) {
				intrestRate = (monthlyAmount * 0.0825);
			} else {
				intrestRate = (monthlyAmount * 0.0875);
			}
		} else if (noofMonths >= 16 && noofMonths <= 18) {
			if (ageofACHolder <= 60) {
				intrestRate = (monthlyAmount * 0.0850);
			} else {
				intrestRate = (monthlyAmount * 0.0900);
			}
		} else if (noofMonths >= 19 && noofMonths <= 21) {
			if (ageofACHolder <= 60) {
				intrestRate = (monthlyAmount * 0.0875);
			} else {
				intrestRate = (monthlyAmount * 0.0925);
			}
		}
		return intrestRate;
	}

}

public class Intrestcalculator {

	public static void main(String[] args) throws InvalidAmountException, InvalidNoOfDaysException, InvalidAgeOfAccountHolderException, InvalidMonthlyAmountException, InvalidNoOfMonthsException {
		Scanner scan = new Scanner(System.in);
		System.out.println("* * * * * * * *  * * * * * * * *    WELCOME TO INTREST CALCULATOR PROJECT    * * * * * * * *  * * * * * * * *");
		
		while (true) {
		
			int ch;
			
			System.out.println("\n1. Intrest Calculator-SB\n 2. Intrest Calculator-FD \n 3. Intrest Calculator-RD\n 4.Exit");
			System.out.println("\nSelect the option\n");
			ch = scan.nextInt();
		
			switch (ch) {
			case 1:
				SBAccount sb = new SBAccount();
				double sbin = sb.calculateIntrest();
				System.out.println("Intrest for SB Account : "+sbin+"\n");
				break;
			case 2:
				FDAccount fd = new FDAccount();
				double fdin = fd.calculateIntrest();
				System.out.println("Intrest for FD Account : "+fdin+"\n");
				break;
			case 3:
				RDAaccount rd = new RDAaccount();
				double rdin = rd.calculateIntrest();
				System.out.println("Intrest for RD Account : "+rdin+"\n");
				break;
			case 4:break;
			default:
				System.out.println("Invalid Choice");
			}

		}

	}

}
