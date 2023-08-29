package Model;

import java.io.Serializable;

/**
 * @apiNote Класс пользователя: хранит пароль, счет, имя и идентификатор
 */
public class User implements Serializable{
	/**
	 * @apiNote Уникальный идентификатор пользователя
	 */
	private final long ID;
	/**
	 * @return Пароль пользователя
	 */
	private String password;
	/**
	 * @apiNote Имя пользователя
	 */
	private final String name;
	/**
	 * @apiNote Личный счет пользователя
	 */
	private Account account;

	/**
	 * @apiNote Конструктор для создания юзера
	 */
	public User(long ID, String name,String password) {
		this.ID = ID;
		this.name = name;
		this.password = password;
		account = new Account();
	}

	/**
	 * @return Уникальный идентификатор пользователя
	 */
	public long getID() {
		return ID;
	}
	/**
	 * 
	 * @return String - имя пользователя
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return Account - личный счет пользователя
	 */

	public Account getAccount() {
		return account;
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
}
