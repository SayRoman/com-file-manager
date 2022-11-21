import java.util.*;

public class AdminMenu {


    private Map<Person, List<Salary>> map;
    Scanner sc = new Scanner(System.in);
    Authorization authorization = new Authorization();

    public AdminMenu() {
        map = new HashMap<>();
        sc = new Scanner(System.in);
    }

    public void outConsol() {
        System.out.println("\nYou are in the Administration menu. Enjoy to using! \n");

        boolean isRun = true;
        while (isRun) {
            System.out.println("Click 1 = Add new employee");
            System.out.println("Click 2 = Delete employee");
            System.out.println("Click 3 = Set employee's salary");
            System.out.println("Click 4 = Edit employee details");
            System.out.println("Click 5 = Watch the employee's list with the salary");
            System.out.println("Click 0 = Return to authorization menu");
            switch (sc.next()) {
                case "1": {
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
                break;
                case "2": {
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


                break;
                case "3": {
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

                break;
                case "4":{
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
                break;
                case "5": {
                    // Set<Entry<Person, List<Pet>>> entrySet = map.entrySet();
                    // for (Entry<Person, List<Pet>> entry : entrySet) {
                    // for(Pet pet : entry.getValue()){
                    // System.out.println(entry.getKey()+ " "+ pet);
                    // }
                    //
                    // }
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
                case "0": {
                    authorization.checkAutorization();

                    break;
                }
            }
        }
    }





}