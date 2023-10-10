package Task2;

public class Demomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount BaAccount = new SavingsAccount(1478, "Manogna", 258, 1.6);
		SavingsAccount savAccount =new SavingsAccount(0123, "subash", 1000, 3.2);
		savAccount.addInterest();
		savAccount.deposit(100);
		savAccount.displayAccountInfo();
		
		BaAccount.displayAccountInfo();
		BaAccount.getBalance();
		
	}

}
