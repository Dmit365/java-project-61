package hexlet.code;
import java.lang.Math;
import java.util.Scanner;

public class Nod {
    public static void gameNode(String name) {
        Scanner in = new Scanner(System.in);
        boolean exam = true;
        byte numberGame = 0;
        int remainder = -1;
        System.out.println("Find the greatest common divisor of given numbers.\n");
        while ((exam) & (numberGame != 3)) {
            int numberOne = (int) (Math.random() * 1000 + 10);
            int numberTwo = (int) (Math.random() * 100);
            System.out.println("Question: " + numberOne + " " + numberTwo + "\n");
            String answerPlayer = in.nextLine();
            System.out.println("Your answer: " + answerPlayer + "\n");
            int interimNumberOne = numberOne;
            int interimNumberTwo = numberTwo;
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
