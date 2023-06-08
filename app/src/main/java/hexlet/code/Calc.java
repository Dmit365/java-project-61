package hexlet.code;
import java.lang.Math;
import java.util.Scanner;

public class Calc {
    public static void gameCalc(String name) {
        Scanner in = new Scanner(System.in);
        boolean exam = true;
        byte numberGame = 0;
        int answer = 0;
        System.out.println("What is the result of the expression?");
        while ((exam) & (numberGame != 3)) {
           int numberOne = (int) (Math.random() * 10);
            int numberTwo = (int) (Math.random() * 10);
            byte sign = (byte) (Math.random() * 3 + 1);
            if (sign == 1) {
                System.out.println("Question: " + numberOne + "+" + numberTwo);
                answer = numberOne + numberTwo;
            }
            if (sign == 2) {
                if (numberOne >= numberTwo) {
                    System.out.println("Question: " + numberOne + "-" + numberTwo);
                    answer = numberOne - numberTwo;
                } else {
                    System.out.println("Question: " + numberTwo + "-" + numberOne);
                    answer = numberTwo - numberOne;
                }
            }
            if (sign == 3) {
                System.out.println("Question: " + numberOne + "*" + numberTwo);
                answer = numberOne * numberTwo;
            }
            String answerPlayer = in.nextLine();
            System.out.println("Your answer: " + answerPlayer);
            exam = NumCheck.numberCheck(name, answerPlayer, answer, exam);
            numberGame++;
            Cong.congratulation(name, numberGame, exam);
        }
    }
}
