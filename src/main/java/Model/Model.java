package Model;

public class Model {

    private ATM atm;

    public Model() {
        atm = new ATM();
    }

    public double takeCash(long id, double amount) {
        return atm.withdraw(id, amount);
    }

    public void deposit(long id, double amount) {
        atm.deposit(id, amount);
    }

    public double checkBalance(long id) {
        return atm.checkBalance(id);
    }

    public boolean validate(long id, String password) {
        return atm.validate(id, password);
    }


}
