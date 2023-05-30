package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = null; //checking if there was a name
        int gameNumber = 0;
        do  {
            System.out.println("Please enter the game number and press Enter.\n" +
                    "1 - Greet\n" +
                    "2 - Even\n" +
                    "0 - Exit");
            gameNumber = in.nextInt();
            System.out.println("Your choice: " + gameNumber);
            if (gameNumber == 1) {
                name = Greet.greetings(name);

            }
            if (gameNumber == 2) {
                name = Greet.greetings(name);
                Even.gameEven(name);
            }
        } while (gameNumber !=0);


    }
}
