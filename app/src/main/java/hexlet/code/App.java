package hexlet.code;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = null; //checking if there was a name
        String gameNumber = null;
        do  {
            System.out.println("Please enter the game number and press Enter.\n" +
                    "1 - Greet\n" +
                    "2 - Even\n" +
                    "3 - Calc\n" +
                    "0 - Exit");
            gameNumber = in.nextLine();
            System.out.println("Your choice: " + gameNumber);
            if (gameNumber.equals("1")) {
                name = Greet.greetings(name);

            }
            if (gameNumber.equals("2")) {
                name = Greet.greetings(name);
                Even.gameEven(name);
            }
            if (gameNumber.equals("3")) {
                name = Greet.greetings(name);
                Calc.gameCalc(name);
            }
            if ((!StringUtils.isNumeric(gameNumber)) || (Integer.parseInt(gameNumber) > 6)){
                System.out.println("wrong choice please try again.\n");
            }
        } while (Integer.parseInt(gameNumber) !=0);


    }
}
