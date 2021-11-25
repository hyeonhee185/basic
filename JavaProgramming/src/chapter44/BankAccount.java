package chapter44;

public class BankAccount {
	// 잔액: 최대 21억
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	// 입금
	public void deposit(int amount) {
		balance += amount;
	}
	// 출금
	public boolean withdraw(int amount) {
		balance -= amount;
		return true;
	}
	
	/**
	 * 현재 계좌에서 다른 계좌로 amount(금액)을 이체하는 메소드
	 * @param amount 이체 금액
	 * @param otherAccount 이체할 계좌번호
	 * @return 이체 성공시 true, 실패시 false
	 */
	public boolean transfer(int amount, BankAccount otherAccount) {
		withdraw(amount);
		otherAccount.deposit(amount);
		return true;
	}
}

