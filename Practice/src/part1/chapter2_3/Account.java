package part1.chapter2_3;

// 列挙型を活用した口座クラス
// 【利用例】new Account("1732050", AccountType.FUTSU);
public class Account {
	private String accountNo;
	private int zandaka;
	private AccountType accountType;
	public Account(String aNo, AccountType aType) {
		this.accountNo = aNo;
		this.accountType = aType;
	}
	
	public String getAccountNo() {
		return this.accountNo;
	}
	
	public int getZabdaka() {
		return this.zandaka;
	}
	
	public void setZandaka(int zandaka) {
		this.zandaka = zandaka;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}
}
