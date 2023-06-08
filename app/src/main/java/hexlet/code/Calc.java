package hexlet.code;
import java.util.Scanner;

public class Calc {
    public static void gameCalc(String name) {
        Scanner in = new Scanner(System.in);
        boolean exam = true;
        byte numberGame = 0;
        byte maxGame = 3;
        int answer = 0;
        int multiplicityNumber = 10;
        byte numberPossibleSign = 3;
        System.out.println("What is the result of the expression?");
        while ((exam) & (numberGame != maxGame)) {
           int numberOne = (int) (Math.random() * multiplicityNumber);
            int numberTwo = (int) (Math.random() * multiplicityNumber);
            byte sign = (byte) (Math.random() * numberPossibleSign + 1);
            if (sign == 1) {
                System.out.println("Question: " + numberOne + " + " + numberTwo);
                answer = numberOne + numberTwo;
            }
            if (sign == 2) {
                    System.out.println("Question: " + numberOne + " - " + numberTwo);
                    answer = numberOne - numberTwo;
            }
            if (sign == 3) {
                System.out.println("Question: " + numberOne + " * " + numberTwo);
                answer = numberOne * numberTwo;
            }
            String answerPlayer = in.nextLine();
            System.out.println("Your answer: " + answerPlayer);
            exam = NumCheck.numberCheck(name, answerPlayer, answer, exam);
            numberGame++;
            Cong.congratulation(name, numberGame, exam, maxGame);
        }
    }
}
