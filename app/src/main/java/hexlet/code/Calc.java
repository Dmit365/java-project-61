package hexlet.code;
import java.lang.Math;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Calc {
    public static void gameCalc(String name) {
        Scanner in = new Scanner(System.in);
        int numberOne = 0;
        int numberTwo = 0;
        boolean exam = true;
        int numberGame = 0;
        byte sign = 0;
        int answer = 0;
        String answerPlayer = null;
        System.out.println("What is the result of the expression?\n");
        while ((exam) & (numberGame != 3)) {
            numberOne = (int) (Math.random() * 10);
            numberTwo = (int) (Math.random() * 10);
            sign = (byte) (Math.random() * 3 + 1);
            if (sign == 1) {
                System.out.println("Question: " + numberOne + "+" + numberTwo);
                answer = numberOne + numberTwo;
            }
            if (sign == 2) {
                System.out.println("Question: " + numberOne + "-" + numberTwo);
                answer = numberOne - numberTwo;
            }
            if (sign == 3) {
                System.out.println("Question: " + numberOne + "*" + numberTwo);
                answer = numberOne * numberTwo;
            }
            answerPlayer = in.nextLine();
            System.out.println("Your answer: " + answerPlayer + "\n");
            if (!StringUtils.isNumeric(answerPlayer)) {
                System.out.println(answerPlayer + " is wrong answer ;(. Correct answer was " +  answer +
                        ". Let's try again, " + name);
                exam = false;
            } else {
                if (Integer.parseInt(answerPlayer) == answer) {
                    System.out.println("Correct!\n");
                    numberGame++;
                } else {
                    System.out.println(answerPlayer + " is wrong answer ;(. Correct answer was " + answer +
                            ". Let's try again, " + name);
                    exam = false;
                }
                if ((numberGame == 3) & (exam)) {
                    System.out.println("Congratulations, " + name + "\n");
                }
            }


        }

    }
}