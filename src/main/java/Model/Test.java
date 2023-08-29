package Model;

public class Test {
	public static void main(String[] args){
		DataBaseInteface<User> data = new DataBase();
		long  check = data.addUser("Эчпочмак", "1234");
		DataLoader loader = new DataInFile();
		loader.save(data, "ususus");
		DataBaseInteface<User> checkLoad = (DataBaseInteface<User>) loader.load("ususus");
		System.out.println(checkLoad.findUser(check).getName());	
	}
}
