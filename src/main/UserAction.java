import java.util.*;

public class UserAction {
    private Map<Person, List<Salary>> map = new HashMap<>();
    Authorization authorization = new Authorization();
    Scanner sc = new Scanner(System.in);
    public void actionList(){
        System.out.println("Click 1 = Watch the employee's list with the salary");
        System.out.println("Click 0 = Return to authorization menu");
    }
    public void actionList2(){
        System.out.println("Click 1 = show all list");
        System.out.println("Click 2 = search for an employee by FIO");
        System.out.println("Click 0 = return to the User Menu");
    }
    public void showAllList(){
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
}
