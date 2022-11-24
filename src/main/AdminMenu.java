import java.util.*;

public class AdminMenu {
    AdminAction adminAction = new AdminAction();

    public void outConsol() {
        System.out.println("\nYou are in the Administration menu. Enjoy to using! \n");

        boolean isRun = true;
        while (isRun) {
            adminAction.ActionList();
            switch (adminAction.sc.next()) {
                case "1": {
                    adminAction.addEmployee();
                }
                break;
                case "2": {
                    adminAction.deleteEmployee();
                }
                break;
                case "3": {
                    adminAction.setSalary();
                }
                break;
                case "4": {
                    adminAction.editDetails();
                }
                break;
                case "5": {
                    adminAction.showList();
                }
                break;
                case "0": {
                    adminAction.authorization.checkAutorization();

                    break;
                }
            }
        }
    }


}