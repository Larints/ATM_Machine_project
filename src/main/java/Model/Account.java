package Model;

public class Account {
	boolean isActive = false;
	long money;
	public Account() {
		isActive = true;
		money =0;
	}
	public long getMoney() {
		return isActive?-1:money;
	}
	public void setMoney(long money) {
		this.money = isActive? money: this.money; 
	}
	public void diactivate() {
		isActive = false;
	}
}
