package Model;

public interface DataBaseInteface<T extends User> {
	long addUser(String name);
	void removeUser(long ID);
	T findUser(long ID);
}
