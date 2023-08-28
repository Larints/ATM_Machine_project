package Model;

public interface AtmInterface {

    void deposit(Account account, double amount);

    double withdraw(Account account, double amount);

    double checkBalance(Account account);

    boolean validate(String username, String password);

}
