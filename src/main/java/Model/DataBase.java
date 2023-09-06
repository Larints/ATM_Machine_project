package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DataBase implements DataBaseInteface<Account>, Serializable {
	/**
	 * @apiNote Хешмап в котором хранится ключ уникальный ID и значение класс User
	 * 
	 */
	private Map<Long, Account> data;

	/**
	 * @apiNote Конструктор базы данных
	 */
	public DataBase() {
		data = new HashMap<Long, Account>();
	}

	/**
	 * @apiNote Метод добавления пользователей (сырой) В метод передаем пользователя
	 *          , Создаем случайный ID типа long, проверяем наличие соответствующего
	 *          ключа Если найден, меняем ID до тех пор пока не будет найден
	 *          уникальный ID
	 * @param User - пользователь которому добавляется аккаунт
	 * @return long - присвоенный уникальный ID счета
	 */
	@Override
	public long addAccount(User user) {
		Random random = new Random();
		long currentID = random.nextLong(0,Long.MAX_VALUE);
		while (data.containsKey(currentID)) {
			
			currentID = random.nextLong(0, Long.MAX_VALUE);
		}
		data.put(currentID, new Account(user, currentID));
		return currentID;
	}

	/**
	 * @apiNote Удаление счета по индексу
	 * @param ID - уникальный идентификатор, по которому будем удалять счет из БД
	 * 
	 */
	@Override
	public void removeAccount(long ID) {
		data.remove(ID);
	}

	/**
	 * @apiNote Поиск пользователя по индексу
	 * @param ID - уникальный идентификатор, по которому будем искать пользователя
	 *           из БД
	 */
	@Override
	public User findUser(long ID) {
		return data.containsKey(ID) ? data.get(ID).getUser() : null;
	}
	/**
	 * Поиск аккаунта
	 * @param ID
	 * @return аккаунт или null если не найден
	 */
	public Account findAccount(long ID) {
		return data.containsKey(ID) ? data.get(ID) : null;
	}
}
