package practice02_BankAccount;

public class BankAccount {

	// 필드
	private String accNo;
	private long balance;
	
	// 생성자
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	// 메소드(입금, 출금, 이체, 조회)
	
	// 입금(마이너스 입금 불가 처리)
	public void deposit(long money) throws BankException {
		if(money < 0) {
			throw new BankException("마이너스 입금 불가", 1);
		}
		balance += money;
	}
	
	// 출금(마이너스 출금 + 잔액보다 큰 출금 불가 처리)
	public long withdrawal(long money) throws BankException {
		if(money < 0) {
			throw new BankException("마이너스 출금 불가", 2);
		} else if(balance < money) {
			throw new BankException("잔액 부족", 3);
		}
		balance -= money;
		return money;
	}
	
	// 이체
	public void transfer(BankAccount other, long money)  throws BankException {
		// 1. 내 통장에서 money 출금 : withdrawal(money)
		// 2. 상대 통장에 실제로 내 통장에서 출금된 금액 입금 : other.deposit(withdrawal(money))
		other.deposit(withdrawal(money));
	}
	
	// 조회
	public void inquiry() {
		System.out.println("계좌번호 : " + accNo);
		System.out.println("잔액 : " + balance + "원");
	}

	@Override
	public String toString() {
		return "Bank [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
}
