package hexlet.code;
import java.util.Scanner;

public class Greet {
    public static String greetings(String name) {
        if (name == null) {
            System.out.println("Welcome to the Brain Games!\n May I have your name?");
            Scanner in = new Scanner(System.in);
            name = in.nextLine();
        }
        System.out.println("Hello " + name);
        return  name;
    }
}
