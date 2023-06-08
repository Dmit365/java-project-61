package hexlet.code;
import java.lang.Math;
import java.util.Scanner;

public class Nod {
    public static void gameNode(String name) {
        Scanner in = new Scanner(System.in);
        boolean exam = true;
        byte numberGame = 0;
        int remainder = -1;
        byte maxGame = 3;
        int multiplicityNumber = 1000;
        int interimNumberOne = 0;
        int interimNumberTwo = 0;
        System.out.println("Find the greatest common divisor of given numbers.");
        while ((exam) & (numberGame != maxGame)) {
            int numberOne = (int) (Math.random() * multiplicityNumber);
            int numberTwo = (int) (Math.random() * multiplicityNumber);
            System.out.println("Question: " + numberOne + " " + numberTwo);
            String answerPlayer = in.nextLine();
            System.out.println("Your answer: " + answerPlayer);
            if (numberOne >= numberTwo) {
                interimNumberOne = numberOne;
                interimNumberTwo = numberTwo;
            } else {
                interimNumberOne = numberTwo;
                interimNumberTwo = numberOne;
            }
            while (remainder != 0) {
                remainder = interimNumberOne % interimNumberTwo;
                interimNumberOne = interimNumberTwo;
                interimNumberTwo = remainder;
            }
            exam = NumCheck.numberCheck(name, answerPlayer, interimNumberOne, exam);
            numberGame++;
            Cong.congratulation(name, numberGame, exam, maxGame);
            remainder = -1;
        }
    }
}
