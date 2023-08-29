package Model;

public interface DataBaseInteface<T extends User> {
	long addUser(String name,String password);
	void removeUser(long ID);
	T findUser(long ID);
}
