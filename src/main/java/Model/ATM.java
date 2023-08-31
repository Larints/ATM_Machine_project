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
     * @param id     - лицевой счет пользователя
     * @param amount - вносимые средства
     * @apiNote Положить средства на счет. Получает на вход
     * два параметра, номер лицевого счета и средства.
     */

    @Override
    public void deposit(long id, double amount) {
        Account account = data.findAccount(id);
        account.setMoney(account.getMoney() + amount);
    }

    //TODO сделать исключения
    @Override
    public double withdraw(long id, double amount) {
        Account account = data.findAccount(id);
        account.setMoney(account.getMoney() - amount);
        return account.getMoney();
    }

    //TODO сделать исключения
    @Override
    public double checkBalance(long account) {
        return data.findAccount(account).getMoney();
    }

    //TODO доделать метод валидации c исключениями
    @Override
    public boolean validate(long id, String password) {
        return data.findAccount(id) != null & (data.findAccount(id).getUser().getPassword() == password.hashCode());
    }
}
