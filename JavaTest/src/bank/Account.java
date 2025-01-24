package bank;

public class Account {
	private String ano;    //계좌번호
	private String owner;  //입금주
	private int balance;   //잔고
	
	public Account(String ano, String owner, int balance) {
		this.ano     = ano;
		this.owner   = owner;
		this.balance = balance;
	}
	
	//Getter
	public String getAno() {
		return ano;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getBalance() {
		return balance;
	}
	
	//Setter
	public void setBalance(int balance) {
		this.balance = balance;
	}

	//toString
	@Override
	public String toString() {
		return ano + " " +owner + " " + balance;
	}
	
}



