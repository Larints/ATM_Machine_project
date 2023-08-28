package Model;

public class User {
	private final long ID;
	private final String name;
	private Account account;
	public User(long ID,String name) {
		this.ID = ID;
		this.name = name;
		account = new Account();
	}
	public long getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public Account getAccount() {
		return account;
	}
}
