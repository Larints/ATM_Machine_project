package Model;

import Model.ModelExceptions.DiactivateAccountRequestException;
import Model.ModelExceptions.ValidateAccountException;

public interface AtmInterface {

    void deposit(long account, double amount) throws DiactivateAccountRequestException;

    double withdraw(long account, double amount) throws DiactivateAccountRequestException;

    double checkBalance(long account) throws DiactivateAccountRequestException;

    boolean validate(long account, String password) throws ValidateAccountException;

}
