package Presenter;

import Model.Model;
import Model.ModelExceptions.DiactivateAccountRequestException;
import Model.ModelExceptions.ValidateAccountException;
import Viewer.ATM_Menu;

public class Presenter {

    private Model model;

    private ATM_Menu atmMenu;

    public Presenter() {
        model = new Model();
        atmMenu = new ATM_Menu();
    }

    public double withdrawCash(long id, double amount) throws DiactivateAccountRequestException{
        return model.takeCash(id, amount);
    }

    public void deposit(long id, double amount) throws DiactivateAccountRequestException{
        model.deposit(id, amount);
    }

    public double checkBalance(long id) throws DiactivateAccountRequestException{
        return model.checkBalance(id);
    }

    public boolean validate(long id, String password) throws ValidateAccountException{
        return model.validate(id, password);
    }
}
