
public class CheckingAccount extends BankAccount{
	
	static final double FEE = 0.15;
		
		
		public CheckingAccount(String name, double amount) {
			super(name,amount);
			setAccountNumber(getAccountNumber()+ "-10");
			
		}
		public boolean withdraw(double amount) {
			
			
				if(super.withdraw(amount+FEE)) {
					return true;
				}
				else return false;
			
		}
}
