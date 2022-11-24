import java.util.*;

public class AdminAction {
    private Map<Person, List<Salary>> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    Authorization authorization = new Authorization();
    public void ActionList(){
        System.out.println("Click 1 = Add new employee");
        System.out.println("Click 2 = Delete employee");
        System.out.println("Click 3 = Set employee's salary");
        System.out.println("Click 4 = Edit employee details");
        System.out.println("Click 5 = Watch the employee's list with the salary");
        System.out.println("Click 0 = Return to authorization menu");
    }
    public void addEmployee(){
        System.out.println("Write number employee: ");
        int number = sc.nextInt();
        System.out.println("Write fIO employee: ");
        String fIO = sc.next();
        if (map.containsKey(new Person(number, fIO))) {
            System.out.println("That employee is already has \n");
        } else {
            map.put(new Person(number, fIO), new ArrayList<>());
        }
    }
    public void deleteEmployee(){
        System.out.println("Write number employee: ");
        int number = sc.nextInt();

        System.out.println("Input FIO:");
        String fIO = sc.next();

        Person person = new Person(number, fIO);

        if (map.containsKey(person)) {
            map.remove(person);
        } else {
            System.out.println("Can't find employee");
        }
    }
    public void setSalary(){
        System.out.println("Input number employee");
        int number = sc.nextInt();
        System.out.println("Input FIO employee");
        String fIO = sc.next();
        Person person = new Person(number, fIO);
        if (map.containsKey(person)) {

            System.out.println("set salaray");
            double salary = sc.nextInt();
            map.get(person).add(new Salary(salary));
        } else {
            System.out.println("Такого участника не существует!");
        }
    }
    public void editDetails(){
        System.out.println("Write number employee who you want to edit: ");
        int number = sc.nextInt();

        System.out.println("Input FIO:");
        String fIO = sc.next();

        Person person = new Person(number, fIO);

        if (map.containsKey(person)) {
            map.remove(person);
        } else {
            System.out.println("Can't find employee");
        }

        System.out.println("Write number employee: ");
        number = sc.nextInt();
        System.out.println("Write fIO employee: ");
        fIO = sc.next();
        if (map.containsKey(new Person(number, fIO))) {
            System.out.println("That employee is already has \n");
        } else {
            map.put(new Person(number, fIO), new ArrayList<>());
        }
        System.out.println("set salaray");
        double salary = sc.nextInt();
        map.get(person).add(new Salary(salary));
    }
    public void showList(){
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
