package Model;

public class ATM implements AtmInterface {

    /**
     * @apinote Имя банкомата
     */

    private String name;

    /**
     * @apinote Количество наличных в банкомате
     */
    private long cash;

    /**
     * @apinote Экземпляр базы данных
     */
    private DataBase data;

    /**
     * @apinote Конструктор для создания банкомата
     */
    public ATM() {
        this.name = "ATM 24/7";
        this.cash = 10000000;
        this.data = new DataBase();
    }

    /**
     * Положить средства на счет. Получает на вход,
     * @param account
     * @param amount
     */
    @Override
    public void deposit(Account account, double amount) {
//        account.getMoney() = account.getMoney() + amount;
    }

    @Override
    public double withdraw(Account account, double amount) {
//        account.money = account.money - amount;
        return amount;
    }

    @Override
    public double checkBalance(Account account) {
        return account.getMoney();
    }


    //TODO доделать метод валидации
    @Override
    public boolean validate(String username, String password) {
        int count = 3;
        return false;
    }
}
