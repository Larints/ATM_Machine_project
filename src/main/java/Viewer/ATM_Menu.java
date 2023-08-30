package Viewer;

import java.util.Scanner;

public class ATM_Menu implements UI {

    Scanner in;


    @Override
    public void validate() {
        greetings();
        Scanner in = new Scanner(System.in);
        System.out.println(Messages.AUTHENTICATION_LOGIN);

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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println(Messages.OUTPUTMESSAGE);
            }
        }

    }

    @Override
    public String errorMessage() {
        return Messages.ERRORMESSAGE;
    }


}
