import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        Scanner sc = new Scanner(System.in);

        menu.outConsol();
        sc.close();
    }
}
