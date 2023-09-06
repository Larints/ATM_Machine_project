package Viewer;

import Model.ModelExceptions.DiactivateAccountRequestException;
import Model.ModelExceptions.ValidateAccountException;
import Presenter.Presenter;

import java.util.Scanner;

public class ATM_Menu implements UI {

    private Scanner in;

    private Presenter presenter;

    public ATM_Menu() {
        in = new Scanner(System.in);
        presenter = new Presenter();
    }

    @Override
    public void validate() {
        greetings();
        int count = 0;
        while (count <= 3) {
            System.out.print(Messages.AUTHENTICATION_LOGIN);
            long id = in.nextLong();
            System.out.print(Messages.AUTHENTICATION_PASSWORD);
            String password = in.next();
            try {
                presenter.validate(id, password);
            } catch (ValidateAccountException e) {
                System.out.println(e.getMessage());
                count++;
                System.out.println("У вас осталось " + (3 - count) + " попыток ");
            }
            if (count == 3) {
                System.out.println(Messages.AUTHENTICATION_FAILURE);
                System.out.println(Messages.ACCOUNT_DISABLED);
                presenter.disableAccount(id);
            }
            showMenu();
        }
    }

    @Override
    public void greetings() {
        System.out.println(Messages.GREETINGMESSAGE);
    }

    @Override
    public void showMenu() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(MenuBar.TITLE);
            System.out.println();
            System.out.println(Messages.INPUTMESSAGE);
            switch (in.nextInt()) {
                case 1:
                    System.out.println(Messages.AUTHENTICATION_LOGIN);
                    long id4 = in.nextLong();
                    boolean find = presenter.isAccountActive(id4);
                    if (find) System.out.println("Счет " + id4 + " доступен");
                    else System.out.println("Счет " + id4 + " недоступен");
                case 2:
                    System.out.print(Messages.AUTHENTICATION_LOGIN);
                    long id2 = in.nextLong();
                    double amount = in.nextDouble();
                    try {
                        System.out.println(presenter.withdrawCash(id2, amount));
                        break;
                    } catch (DiactivateAccountRequestException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print(Messages.AUTHENTICATION_LOGIN);
                    long id3 = in.nextLong();
                    double amount2 = in.nextDouble();
                    try {
                        presenter.deposit(id3, amount2);
                        System.out.println(Messages.SUCCESSDEPOSIT);
                        break;
                    } catch (DiactivateAccountRequestException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print(Messages.AUTHENTICATION_LOGIN);
                    long id = in.nextLong();
                    try {
                        System.out.println(presenter.checkBalance(id));
                        break;
                    } catch (DiactivateAccountRequestException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println(Messages.OUTPUTMESSAGE);
                    return;
            }
        }
    }

    @Override
    public String errorMessage() {
        return Messages.ERRORMESSAGE;
    }

}
