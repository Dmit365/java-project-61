package hexlet.code;
import java.util.Scanner;

public class Calc {
    public static void gameCalc(String name) {
        Scanner in = new Scanner(System.in);
        boolean exam = true;
        byte numberGame = 0;
        final byte maxGame = 3;
        int answer = 0;
        final int multiplicityNumber = 10;
        final byte numberPossibleSign = 3;
        final byte minus = 2;
        final byte plus = 1;
        final byte multiply = 3;

        System.out.println("What is the result of the expression?");
        while ((exam) & (numberGame != maxGame)) {
           int numberOne = (int) (Math.random() * multiplicityNumber);
            int numberTwo = (int) (Math.random() * multiplicityNumber);
            byte sign = (byte) (Math.random() * numberPossibleSign + 1);
            if (sign == plus) {
                System.out.println("Question: " + numberOne + " + " + numberTwo);
                answer = numberOne + numberTwo;
            }
            if (sign == minus) {
                    System.out.println("Question: " + numberOne + " - " + numberTwo);
                    answer = numberOne - numberTwo;
            }
            if (sign == multiply) {
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
