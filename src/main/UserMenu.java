import java.util.*;

public class UserMenu {

    UserAction userAction = new UserAction();

    public void outConsol() {
        System.out.println("\nYou are in the User menu. Enjoy to using! \n");

        boolean isRun = true;
        while (isRun) {
            userAction.actionList();
            switch (userAction.sc.next()) {
                case "1": {
                    userAction.actionList2();
                    switch (userAction.sc.next()) {
                        case "1": {
                            userAction.showAllList();
                        }
                        break;
                        case "2": {
                        }
                        break;
                        case "0": {
                            outConsol();
                        }
                        break;
                    }
                }
                case "0": {
                    userAction.authorization.checkAutorization();
                    break;
                }
            }
        }
    }
}

