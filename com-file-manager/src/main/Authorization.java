import java.util.Scanner;

import user.Account;

public class Authorization {

    public void checkAutorization() {

        AdminMenu adminMenu = new AdminMenu();
        UserMenu userMenu = new UserMenu();
        Scanner sc = new Scanner(System.in);
        Account admin = new Account("admin", "admin");
        Account notadmin = new Account("user", "user");


        boolean isRun = true;

        while (isRun) {
            System.out.println("Click 1 = Enter to Log In.");
            System.out.println("Click x = Exit");
            switch (sc.next()) {
                case "1": {
                    //System.out.print("Input your login: ");
                    //String login = sc.nextLine();
                    System.out.print("Input your login: ");
                    String login = sc.next();
                    System.out.print("Input your password: ");
                    String password = sc.next();


                    if (login.equals(admin.login) && password.equals(admin.password)) {
                        adminMenu.outConsol();
                    } else if (login.equals(notadmin.login) && password.equals(notadmin.password)) {
                        userMenu.outConsol();
                    } else {
                        System.out.println("You aren't in the authorization list");
                    }
                    break;

                }
                case "x": {
                    isRun = false;
                }
                break;
            }
        }

    }
}
