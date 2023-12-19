import java.util.Scanner;
class Account 
{
    	int balance;
    	Account(int initial) 
	{
        	balance = initial;
        }
    	Account() 
	{
        	balance = 0;
    	}
    	void deposit(int amt) 
	{
        	if (amt > 0) 
		{
            		balance += amt;
            		System.out.println("Deposited"+amt+". Current balance is"+balance);
        	} 
		else 
		{
            		System.out.println("Deposit amount should be greater than 0.");
       		 }
    	}
    	void withdraw(int amt) 
	{
        	if (amt > 0) 
		{
            		if (balance >= amt) 
			{
                		balance=balance-amt;
                		System.out.println("Withdrew"+amt+".Current balance is"+balance);
            		} 
			else 
			{
                		balance=balance-5;
                		System.out.println("$5 penalty has been charged.");
                		System.out.println("Current balance is"+balance);
            		}
        	} 
		else 
		{
            		System.out.println("Withdrawal amount should be greater than 0.");
        	}
    	}
	void inqbal() 
	{
        	System.out.println("Current balance is"+balance);
    	}
    	void computeInterest(double rate) 
	{
        	if(rate>0) 
		{
            		double interest = (balance * rate) / 100;
            		balance += interest;
            		System.out.println("Interest of"+interest+"has been added.Current balance is"+balance);
        	} 
		else 
		{
            		System.out.println("Interest rate should be greater than 0.");
       		 }
    	}
	public static void main(String[] args) 
	{
        	Scanner s= new Scanner(System.in);
		System.out.print("Enter initial balance: ");
       		int initial = s.nextInt();
		Account obj= new Account(initial);
		System.out.print("Enter deposit amount: ");
        	int deposit=s.nextInt();
        	obj.deposit(deposit);
		System.out.print("Enter withdrawal amount: ");
        	int withdrawAmt=s.nextInt();
        	obj.withdraw(withdrawAmt);
		obj.inqbal();
		System.out.print("Enter interest rate: ");
     		double interestRate=s.nextDouble();
        	obj.computeInterest(interestRate);
	}
}