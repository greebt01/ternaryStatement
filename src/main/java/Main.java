import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is your role?");
        Scanner scanner=new Scanner(System.in);
        String role= scanner.nextLine();
        if (role.equals("admin")) {
            System.out.println("You're an admin");
        } else if (role.equals("moderator")) {
            System.out.println("You're a moderator");
        } else {
            System.out.println("You're a guest");
        }
    }
}
