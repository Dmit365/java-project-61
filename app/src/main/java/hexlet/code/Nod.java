package hexlet.code;
import java.lang.Math;
import java.util.Scanner;

public class Nod {
    public static void gameNode(String name) {
        Scanner in = new Scanner(System.in);
        int numberOne = 0;
        int numberTwo = 0;
        int interimNumberOne = 0;
        int interimNumberTwo = 0;
        boolean exam = true;
        byte numberGame = 0;
        int remainder = -1;
        String answerPlayer = null;
        System.out.println("Find the greatest common divisor of given numbers.\n");
        while ((exam) & (numberGame != 3)) {
            numberOne = (int) (Math.random() * 1000 + 10);
            numberTwo = (int) (Math.random() * 100);
            System.out.println("Question: " + numberOne + " " + numberTwo + "\n");
            answerPlayer = in.nextLine();
            System.out.println("Your answer: " + answerPlayer + "\n");
            interimNumberOne = numberOne;
            interimNumberTwo = numberTwo;
            while (remainder != 0) {
                remainder = interimNumberOne % interimNumberTwo;
                interimNumberOne = interimNumberTwo;
                interimNumberTwo = remainder;
            }
            exam = NumCheck.numberCheck(name, answerPlayer, interimNumberOne, exam);
            numberGame++;
            Cong.congratulation(name, numberGame, exam);
            remainder = -1;
        }
    }
}
