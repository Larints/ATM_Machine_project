package Model;

public interface AtmInterface {

    void deposit(int account, double amount);

    double withdraw(int account, double amount);

    double checkBalance(int account);

    boolean validate(String username, String password);

}
