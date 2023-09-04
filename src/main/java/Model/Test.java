package Model;

import Model.ModelExceptions.DiactivateAccountRequestException;

public class Test {
	public static void main(String[] args) throws DiactivateAccountRequestException{
		DataBaseInteface<Account> data = new DataBase();
		long  check = data.addAccount(new User("Питар Паркер", "2314"));
//		System.out.println(check);
		data.addAccount(data.findUser(check));
//		data.findAccount(check).diactivate();
		System.out.println(data.findUser(check));
		data.findAccount(check).setMoney(150);
		System.out.println(data.findUser(check));
//		System.out.println(data.findUser(check).getListAccounts());
		
//		DataLoader loader = new DataInFile();
//		loader.save(data, "ususus");
//		DataBaseInteface<User> checkLoad = (DataBaseInteface<User>) loader.load("ususus");
//		System.out.println(checkLoad.findUser(check).getName());
		
	}
}
