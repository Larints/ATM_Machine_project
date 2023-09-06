package Model;

import Model.ModelExceptions.DiactivateAccountRequestException;
import Model.ModelExceptions.ValidateAccountException;

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
    private DataBaseInteface<Account> data;

    /**
     * @apinote Конструктор для создания банкомата
     */
    public ATM() {
    	DataLoader loader = new DataInFile();
        this.name = "ATM 24/7";
        this.cash = 10000000;
        this.data = (DataBaseInteface<Account>) loader.load("firstData");
    }

    /**
     * @param id     лицевой счет пользователя
     * @param amount вносимые средства
     * @apiNote Положить средства на счет. Получает на вход
     * два параметра, номер лицевого счета и средства.
     */

    @Override
    public void deposit(long id, double amount) throws DiactivateAccountRequestException {
        Account account = data.findAccount(id);
        account.setMoney(account.getMoney() + amount);
    }

    @Override
    public double withdraw(long id, double amount) throws DiactivateAccountRequestException {
        Account account = data.findAccount(id);
        account.setMoney(account.getMoney() - amount);
        return account.getMoney();
    }


    @Override
    public double checkBalance(long account) throws DiactivateAccountRequestException {
        return data.findAccount(account).getMoney();
    }

    @Override
    public void validate(long id, String password) throws ValidateAccountException {
        if (data.findAccount(id).getUser().getPassword() != password.hashCode()) {
            throw new ValidateAccountException("Неверный пароль, введите еще раз");
        }
    }

    @Override
    public void disableAccount(long id) {
        data.findAccount(id).diactivate();
    }

}
