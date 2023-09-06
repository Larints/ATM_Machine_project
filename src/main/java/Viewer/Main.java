package Viewer;

/**
 * Основной класс входа в программу
 */

public class Main {
    public static void main(String[] args) {
//    	DataBaseInteface<Account> data = new DataBase();
//    	User first = new User("Петр", "1111");
//    	User second = new User("Маша", "1211");
//    	User third = new User("Виталий", "1131");
//    	User fourth = new User("Игорь", "4111");
//    	System.out.println(data.addAccount(first));
//    	System.out.println(data.addAccount(second));
//    	System.out.println(data.addAccount(third));
//    	System.out.println(data.addAccount(fourth));
//    	System.out.println(data.addAccount(fourth));
//    	DataLoader loader = new DataInFile();
//    	loader.save(data, "firstData");

        ATM_Menu atmMenu = new ATM_Menu();
        atmMenu.validate();
    }
}
