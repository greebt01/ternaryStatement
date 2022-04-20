import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is your income?");
        Scanner scanner = new Scanner(System.in);
        int income = scanner.nextInt();
        String className=income>100_000 ?"First":"Economy";

        System.out.println("Class: " + className);
    }
}
