package Model;

import Model.ModelExceptions.DiactivateAccountRequestException;
import Model.ModelExceptions.ValidateAccountException;

public interface AtmInterface {

    void deposit(long account, double amount) throws DiactivateAccountRequestException;

    double withdraw(long account, double amount) throws DiactivateAccountRequestException;

    double checkBalance(long account) throws DiactivateAccountRequestException;

    void validate(long account, String password) throws ValidateAccountException;

    void disableAccount(long id);

    boolean isActive(long account);

}
