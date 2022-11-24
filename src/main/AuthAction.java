import user.Account;

import java.util.Scanner;

public class AuthAction {
    Scanner sc = new Scanner(System.in);
    AdminMenu adminMenu = new AdminMenu();
    UserMenu userMenu = new UserMenu();
    Account admin = new Account("admin", "admin");
    Account notadmin = new Account("user", "user");
    public void listAction(){
        System.out.println("Click 1 = Enter to Log In.");
        System.out.println("Click x = Exit");
    }

    public void logIn(){
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
    }
}
