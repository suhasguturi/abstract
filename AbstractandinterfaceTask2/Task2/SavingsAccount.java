package Task2;

public class SavingsAccount extends BankAccount implements Transcationfee {

	double Annualrate;
	public SavingsAccount(int accountNumber, String accountHolder, double balance,double ar) {
		super(accountNumber, accountHolder, balance);
		this.Annualrate=ar;
		// TODO Auto-generated constructor stub
	}
	
	 public void addInterest() {
	        double interestAmount = getBalance() * (Annualrate / 100);
	        setBalance(getBalance() + interestAmount);
	    }

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
		
	}
	
	 public void displayAccountInfo() {
	        System.out.println("Account Number: " + getAccountNumber());
	        System.out.println("Account Holder: " + getAccountHolder());
	        System.out.println("Balance: $" + getBalance());
	    }

	@Override
	public void applyTransactionFee(double fee) {
		// TODO Auto-generated method stub
		this(fee);
		setBalance(getBalance() - fee);
		
	}

}
