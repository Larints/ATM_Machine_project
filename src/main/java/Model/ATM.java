package Model;

public class ATM implements AtmInterface {

    private String name;

    private long cash;

    public ATM(String name, long cash) {
        this.name = name;
        this.cash = cash;
    }


    @Override
    public void takeCash(double amount) {

    }

    @Override
    public double giveCash(double amount) {
        return 0;
    }

    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public void help() {

    }
}
