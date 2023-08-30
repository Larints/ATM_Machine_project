package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Класс - загрузчик, реализует сохранение и загрузку в файл
 */
public class DataInFile implements DataLoader {
	/**
	 * Реализация метода сохранения
	 * Путь сохранения по умолчанию ("src/main/java/SavedDatabase/")
	 * @param data - Интерфейс БД для сохранения
	 * @param fileName - Имя сохраняемого файла
	 */
	@Override
	public void save(DataBaseInteface<Account> data, String fileName) {
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new FileOutputStream("src/main/java/SavedDatabase/" + fileName));
			objectOutputStream.writeObject(data);
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @apiNote Реализация метода загрузки
	 * Путь загрузки по умолчанию ("src/main/java/SavedDatabase/")
	 * @param fileName - имя загружаемого файла
	 */
	@Override
	public Object load(String fileName) {
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(
					new FileInputStream("src/main/java/SavedDatabase/" + fileName));
			return objectInputStream.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
