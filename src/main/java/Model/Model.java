package Model;

import Model.ModelExceptions.DiactivateAccountRequestException;
import Model.ModelExceptions.ValidateAccountException;

public class Model {

    private ATM atm;

    public Model() {
        atm = new ATM();
    }

    public double takeCash(long id, double amount) throws DiactivateAccountRequestException {
        return atm.withdraw(id, amount);
    }

    public void deposit(long id, double amount) throws DiactivateAccountRequestException {
        atm.deposit(id, amount);
    }

    public double checkBalance(long id) throws DiactivateAccountRequestException {
        return atm.checkBalance(id);
    }

    public void validate(long id, String password) throws ValidateAccountException {
        atm.validate(id, password);
    }

    public void disableAccount(long id) {
        atm.disableAccount(id);
    }

    public boolean isActive(long id) {
        return atm.isActive(id);
    }

}
