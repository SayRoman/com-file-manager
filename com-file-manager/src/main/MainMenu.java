import java.util.*;

public class MainMenu {
    private Map<Person, List<Salary>> map;
    Scanner sc = new Scanner(System.in);

    public MainMenu() {
        map = new HashMap<>();
        sc = new Scanner(System.in);
    }

    public void outConsol() {
        boolean isRun = true;
        while (isRun) {
            System.out.println("Click 1 = Add new employee");
            System.out.println("Click 2 = Delete employee");
            System.out.println("Click 3 = Set employee's salary");
            System.out.println("Click 4 = Edit employee details");
            System.out.println("Click 5 = Watch the employee's list with the salary");
            System.out.println("Click 0 = Exit");
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
                    System.out.println("Введите имя участника:");
                    String name = sc.next();

                    Person person = new Person(name);
                    if (map.containsKey(person)) {
                        map.remove(person);
                    } else {
                        System.out.println("Участника не найдено!");
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
                    isRun = false;

                    break;
                }
            }
        }
    }

    public class Person {
        private int number;
        private String fIO;

        public Person(String fIO) {
            this.fIO = fIO;
        }

        public Person(int number, String fIO) {
            this.fIO = fIO;
            this.number = number;
        }

        public String getfIO() {
            return fIO;
        }

        public void setfIO(String fIO) {
            this.fIO = fIO;
        }

        public int getSalary() {
            return number;
        }

        public void setSalary(int salary) {
            this.number = number;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return number == person.number && Objects.equals(fIO, person.fIO);
        }

        @Override
        public int hashCode() {
            return Objects.hash(number, fIO);
        }

        @Override
        public String toString() {
            return number + fIO;
        }
    }


    public class Salary {
        private double salary;

        public Salary(double salary) {
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((int) salary);
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Salary other = (Salary) obj;
            if (salary != 0) {
                if (other.salary != 0)
                    return false;
            } else if (salary == (other.salary)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "salary=" + salary;
        }
    }
}