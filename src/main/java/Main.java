import org.w3c.dom.ls.LSOutput;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int income = 120_000;
        String className;
        if (income > 100_000) {
            className = "First";
        } else {
            className = "Economy";
        }
        System.out.println("Class: " + className);
    }
}
