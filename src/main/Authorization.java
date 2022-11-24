import java.util.Scanner;

import user.Account;

public class Authorization {

    public void checkAutorization() {

        AuthAction authAction = new AuthAction();

        boolean isRun = true;

        while (isRun) {
            authAction.listAction();
            switch (authAction.sc.next()) {
                case "1": {
                    //System.out.print("Input your login: ");
                    //String login = sc.nextLine();
                    authAction.logIn();
                    break;

                }
                case "x": {
                    isRun = false;
                    System.exit(0);
                }
                break;
            }
        }

    }
}
