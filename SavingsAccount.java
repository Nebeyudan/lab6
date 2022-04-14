
public class SavingsAccount extends BankAccount{
	private final double RATE = .025;
	private int savingNumber = 0;
	BankAccount a1;
	private String accountNum;
	public SavingsAccount(String name, double amount) {
		super(name,amount);
		accountNum =(super.getAccountNumber() + "-" + savingNumber);
		
	}
	public SavingsAccount(SavingsAccount yourAccount, int amount) {
		super(yourAccount,amount);
	}
	public void postInterest() {
		deposit(getBalance() * RATE);
	}
	public String getAccountNumber() {
		return accountNum;
	}
}
