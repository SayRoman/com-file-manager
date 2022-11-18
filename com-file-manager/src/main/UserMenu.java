import java.util.*;

public class UserMenu {
    private Map<Person, List<Salary>> map;
    Scanner sc = new Scanner(System.in);

    public UserMenu() {
        map = new HashMap<>();
        sc = new Scanner(System.in);
    }

    public void outConsol() {
        System.out.println("\nYou are in the User menu. Enjoy to using! \n");

        boolean isRun = true;
        while (isRun) {
            System.out.println("Click 1 = Watch the employee's list with the salary");
            System.out.println("Click 0 = Exit");
            switch (sc.next()) {
                case "1": {

                    System.out.println("Click 1 = show all list");
                    System.out.println("Click 2 = search for an employee by FIO");
                    System.out.println("Click 0 = return to the User Menu");

                    switch (sc.next()) {
                        case "1": {
                            Set<Person> keySet = map.keySet();
                            for (Person key : keySet) {
                                for (Salary salary : map.get(key)) {
                                    System.out.println(key + " " + salary);
                                }
                                if (map.get(key).isEmpty()) {
                                    System.out.println(key);
                                }
                            }
                            if (map.isEmpty()) {
                                System.out.println("That employee isn't found \n");
                            }
                        }

                        break;
                        case "2":{

                        }
                        break;
                        case "0": {outConsol();

                        }
                        break;
                    }

                }

                case "0": {
                    isRun = false;

                    break;
                }
            }
        }
    }
}

