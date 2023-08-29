package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DataBase implements DataBaseInteface<User>, Serializable{
	/**
	 * @apiNote Хешмап в котором хранится ключ уникальный ID и значение класс User
	 * 
	 */
	private Map<Long, User> data;

	/**
	 * @apiNote Конструктор базы данных
	 */
	public DataBase() {
		data = new HashMap<Long, User>();
	}

	/**
	 * @apiNote Метод добавления пользователей (сырой) В метод передаем имя
	 *          пользователя и пароль, Создаем случайный ID типа long, проверяем
	 *          наличие соответствующего ключа Если найден, меняем ID до тех пор
	 *          пока не будет найден уникальный ID
	 * @return long - присвоенный уникальный ID
	 */
	@Override
	public long addUser(String name, String password) {
		Random random = new Random();
		long currentID = random.nextLong();
		while (data.containsKey(currentID)) {
			currentID = random.nextLong();
		}
		data.put(currentID, new User(currentID, name, password));
		return currentID;
	}

	/**
	 * @apiNote Удаление пользователя по индексу
	 * @param ID - уникальный идентификатор, по которому будем удалять пользователя
	 *           из БД
	 */
	@Override
	public void removeUser(long ID) {
		data.remove(ID);
	}

	/**
	 * @apiNote Поиск пользователя по индексу
	 * @param ID - уникальный идентификатор, по которому будем искать пользователя
	 *           из БД
	 */
	@Override
	public User findUser(long ID) {
		return data.containsKey(ID) ? data.get(ID) : null;
	}
}
