package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void greetings() {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }
}
