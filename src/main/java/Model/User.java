package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @apiNote Класс пользователя: хранит пароль, счетa, имя
 */
public class User implements Serializable {
	/**
	 * @return Пароль пользователя
	 */
	private String password;
	/**
	 * @apiNote Имя пользователя
	 */
	private final String name;

	private List<Account> listAccounts = new ArrayList<Account>();

	/**
	 * @apiNote Конструктор для создания юзера
	 * @param 1 строка name - Имя пользователя
	 * @param 2 строка password - пароль пользователя
	 */
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	/**
	 * 
	 * @return String - имя пользователя
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return int - хешкод пароля пользователя
	 */
	public int getPassword() {
		return this.password.hashCode();
	}

	/**
	 * @apiNote Метод изменения пароля
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	 * @param account - счет для добавления в список
	 * @return
	 */
	public boolean addAccount(Account account) {
		return listAccounts.add(account);
	}

	/**
	 * 
	 * @param account - какой счет нужно удалить
	 * @return
	 */
	public boolean removeAccount(Account account) {
		return listAccounts.remove(account);
	}

	public List<Account> getListAccounts() {
		return listAccounts;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		for (Account a : listAccounts) {
			sb.append("\n"+a);
		}
		return sb.toString();
	}
}
