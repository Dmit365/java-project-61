package hexlet.code;
import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.Nod;
import hexlet.code.game.Prime;
import hexlet.code.game.Prog;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = null; //checking if there was a name
        String gameNumber = null;
        final byte numberSubmenus = 6;
        do  {
            System.out.println("Please enter the game number and press Enter.\n"
                    + "1 - Greet\n"
                    + "2 - Even\n"
                    + "3 - Calc\n"
                    + "4 - GCD\n"
                    + "5 - Progression\n"
                    + "6 - Prime\n"
                    + "0 - Exit");
            gameNumber = in.nextLine();
            System.out.println("Your choice: " + gameNumber);
            if (gameNumber.equals("1")) {
                name = Greet.greetings(name);
                gameNumber = "0";
            }
            if (gameNumber.equals("2")) {
                name = Greet.greetings(name);
                Even.gameEven(name);
                gameNumber = "0";
            }
            if (gameNumber.equals("3")) {
                name = Greet.greetings(name);
                Calc.gameCalc(name);
                gameNumber = "0";
            }
            if (gameNumber.equals("4")) {
                name = Greet.greetings(name);
                Nod.gameNode(name);
                gameNumber = "0";
            }
            if (gameNumber.equals("5")) {
                name = Greet.greetings(name);
                Prog.gameProg(name);
                gameNumber = "0";
            }
            if (gameNumber.equals("6")) {
                name = Greet.greetings(name);
                Prime.gamePrime(name);
                gameNumber = "0";
            }
            if ((!StringUtils.isNumeric(gameNumber)) || (Integer.parseInt(gameNumber) > numberSubmenus)) {
                System.out.println("wrong choice please try again.");
            }
        } while (Integer.parseInt(gameNumber) != 0);


    }
}
