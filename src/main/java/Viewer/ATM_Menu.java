package Viewer;

import java.util.Scanner;

public class ATM_Menu implements UI {

    Scanner in;

    @Override
    public void greetings() {

    }

    @Override
    public void showMenu() {
        System.out.println(MenuBar.TITLE);
    }

    @Override
    public String errorMessage() {
        return Messages.ERRORMESSAGE;
    }

    @Override
    public void validate() {

    }
}
