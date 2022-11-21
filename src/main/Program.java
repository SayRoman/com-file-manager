import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Authorization authorization = new Authorization();
        System.out.println("Welcome to the Accounting program. Please, log in! \n");

        authorization.checkAutorization();
        sc.close();
    }
}
