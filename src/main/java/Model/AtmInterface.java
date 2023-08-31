package Model;

public interface AtmInterface {

    void deposit(long account, double amount);

    double withdraw(long account, double amount);

    double checkBalance(long account);

    boolean validate(long account, String password);

}
