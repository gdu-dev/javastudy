package practice02_BankAccount;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount me = new BankAccount("1111", 10_000);
		BankAccount mom = new BankAccount("2222", 100_000);
		
		try {
			mom.transfer(me, 50_000);
		} catch (BankException e) {
			System.out.println(e.getMessage() + "," + e.getErrorCode());
		}

		me.inquiry();
		mom.inquiry();
		
	}

}
