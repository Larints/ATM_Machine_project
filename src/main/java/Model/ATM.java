package Model;

public class ATM implements AtmInterface {

    /**
     * @apinote Имя банкомата
     */

    private String name;

    /**
     * @apinote Количество наличных в банкомате
     */
    private double cash;

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
     *
     * @param account
     * @param amount
     */
    @Override
    public void deposit(int account, double amount) {

    }

    //TODO доделать метод проверки счета
    @Override
    public double withdraw(int account, double amount) {
//        account.money = account.money - amount;
        return amount;
    }


    //TODO доделать метод проверки баланса
    @Override
    public double checkBalance(int account) {
        return 0;
    }


    //TODO доделать метод валидации
    @Override
    public boolean validate(String username, String password) {
        int count = 3;
        return false;
    }
}
