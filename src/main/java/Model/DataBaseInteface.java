package Model;

public interface DataBaseInteface<T> {
	long addAccount(User user);
	void removeAccount(long ID);
	User findUser(long ID);
	Account findAccount(long ID);
}
