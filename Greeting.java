import java.util.Scanner;
import java.io.Console;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Console console = System.console();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String ageInput = (console != null) ? console.readLine("Enter your age: ") : scanner.nextLine();
        int age = Integer.parseInt(ageInput);

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}