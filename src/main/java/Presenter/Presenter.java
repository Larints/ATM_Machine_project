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

    public double withdrawCash() {
        return 0;
    }

    public void deposit(double amount) {

    }

    public double checkBalance() {
        return 0;
    }

    public boolean validate() {
        return false;
    }

}
