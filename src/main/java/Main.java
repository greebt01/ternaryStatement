import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is your role?");
        Scanner scanner=new Scanner(System.in);
        String role= scanner.nextLine();
        switch (role) {
            case "admin" -> System.out.println("You're an admin");
            case "moderator" -> System.out.println("You're a moderator");
            default -> System.out.println("You're a guest");
        }
    }
}
