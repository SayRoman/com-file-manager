import java.util.*;

public class Zooclub {

    private Map<Person, List<Pet>> map;
    Scanner sc = new Scanner(System.in);

    public Zooclub() {
        map = new HashMap<>();
        sc = new Scanner(System.in);
    }

    public void vyvodConsol() {
        boolean isRun = true;
        while (isRun) {
            System.out.println("Нажмите 1, чтобы добавить нового участника клуба");
            System.out.println("Нажмите 2, чтобы добавить питомца к участнику клуба ");
            System.out.println("Нажмите 3, чтобы удалить питомца у участника клуба");
            System.out.println("Нажмите 4, чтобы удалить участника клуба");
            System.out.println("Нажмите 5, чтобы удалить конкретного питомца у всех участников клуба");
            System.out.println("Нажмите 6, чтобы вывести на экран Зооклуб");
            System.out.println("Нажмите 0, чтобы выйти из программы");
            switch (sc.next()) {
                case "1": {
                    System.out.println("Введите имя участника:");
                    String name = sc.next();

                    System.out.println("Введите возраст участника");
                    int age = sc.nextInt();
                    if (map.containsKey(new Person(name, age))) {
                        System.out.println("Такой участник уже существует");
                    } else {
                        map.put(new Person(name, age), new ArrayList<>());
                    }
                }
                break;
                case "2": {
                    System.out.println("Введите имя участника:");
                    String name = sc.next();
                    System.out.println("Введите возраст участника");
                    int age = sc.nextInt();
                    Person person = new Person(name, age);
                    if (map.containsKey(person)) {

                        System.out.println("Введите  имя питомца");
                        String nickname = sc.next();
                        System.out.println("Введите  вид питомца");
                        String vid = sc.next();
                        map.get(person).add(new Pet(nickname, vid));
                    } else {
                        System.out.println("Такого участника не существует!");
                    }
                }

                break;
                case "3": {
                    System.out.println("Введите имя участника:");
                    String name = sc.next();
                    System.out.println("Введите возраст участника");
                    int age = sc.nextInt();
                    Person person = new Person(name, age);
                    if (map.containsKey(person)) {
                        System.out.println("Введите  имя питомца");
                        String nickname = sc.next();
                        System.out.println("Введите  вид питомца");
                        String vid = sc.next();
                        Pet pet = new Pet(nickname, vid);
                        map.get(person).remove(map.get(person).indexOf(pet));
                    } else {
                        System.out.println("Питомец не найден!");
                    }

                }
                break;
                case "4": {
                    System.out.println("Введите имя участника:");
                    String name = sc.next();
                    System.out.println("Введите возраст участника");
                    int age = sc.nextInt();

                    Person person = new Person(name, age);
                    if (map.containsKey(person)) {
                        map.remove(person);
                    } else {
                        System.out.println("Участника не найдено!");
                    }

                }
                break;
                case "5": {
                    System.out.println("Введите  вид питомца");
                    String vid = sc.next();
                    Set<Person> keySet = map.keySet();
                    for (Person key : keySet) {
                        ListIterator<Pet> iter = map.get(key).listIterator();
                        while (iter.hasNext()) {
                            Pet pet = (Pet) iter.next();
                            if (pet.getVid().equals(vid)) {
                                iter.remove();
                            }
                        }
                    }

                }
                break;
                case "6": {
                    // Set<Entry<Person, List<Pet>>> entrySet = map.entrySet();
                    // for (Entry<Person, List<Pet>> entry : entrySet) {
                    // for(Pet pet : entry.getValue()){
                    // System.out.println(entry.getKey()+ " "+ pet);
                    // }
                    //
                    // }
                    Set<Person> keySet = map.keySet();
                    for (Person key : keySet) {
                        for (Pet pet : map.get(key)) {
                            System.out.println(key + " " + pet);
                        }
                        if (map.get(key).isEmpty()) {
                            System.out.println(key);
                        }
                    }
                    if (map.isEmpty()) {
                        System.out.println("Участника не найдено!");
                    }
                }

                break;
                case "0": {
                    isRun = false;

                    break;
                }

                default:
                    System.out.println("Неверное значение");
                    break;
            }

        }

    }
}
class Pet {

    private String nickname;

    private String vid;

    public Pet(String nickname, String vid) {
        this.nickname = nickname;
        this.vid = vid;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
        result = prime * result + ((vid == null) ? 0 : vid.hashCode());
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
        Pet other = (Pet) obj;
        if (nickname == null) {
            if (other.nickname != null)
                return false;
        } else if (!nickname.equals(other.nickname))
            return false;
        if (vid == null) {
            if (other.vid != null)
                return false;
        } else if (!vid.equals(other.vid))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pet [nickname=" + nickname + ", vid=" + vid + "]";
    }

}
 class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }



}
//import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zooclub zooclub = new Zooclub();

        zooclub.vyvodConsol();
        sc.close();
    }

}