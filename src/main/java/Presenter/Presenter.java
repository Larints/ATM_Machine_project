package Presenter;

import Model.Model;
import Viewer.ATM_Menu;

public class Presenter {

    private Model model;

    private ATM_Menu atmMenu;

    public Presenter() {
        model = new Model();
        atmMenu = new ATM_Menu();
    }

    public double withdrawCash(long id, double amount) {
        return model.takeCash(id, amount);
    }

    public void deposit(long id, double amount) {
        model.deposit(id, amount);
    }

    public double checkBalance(long id) {
        return model.checkBalance(id);
    }

    public boolean validate(long id, String password) {
        return model.validate(id, password);
    }
}
