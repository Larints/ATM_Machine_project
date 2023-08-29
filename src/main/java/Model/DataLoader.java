package Model;
/**
 * Интерфейс - загрузчик базы данных
 * Содержит методы загрузки и сохранения в файл
 * @param <T> - Передаваемая БД
 */
public interface DataLoader {
	void save(DataBaseInteface<User> data, String fileName);
	Object load(String fileName);
}
