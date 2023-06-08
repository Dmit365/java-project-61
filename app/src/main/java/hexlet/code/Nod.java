package hexlet.code;
import java.lang.Math;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Nod {
    public static void gameNode(String name) {
        Scanner in = new Scanner(System.in);
        int numberOne = 0;
        int numberTwo = 0;
        int interimNumberOne = 0;
        int interimNumberTwo = 0;
        boolean exam = true;
        int numberGame = 0;
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
            if (!StringUtils.isNumeric(answerPlayer)) {
                System.out.println(answerPlayer + " is wrong answer ;(. Correct answer was " +  interimNumberOne +
                        ". Let's try again, " + name);
                exam = false;
            } else {
                if (Integer.parseInt(answerPlayer) == interimNumberOne) {
                    System.out.println("Correct!\n");
                    numberGame++;
                } else {
                    System.out.println(answerPlayer + " is wrong answer ;(. Correct answer was " + interimNumberOne +
                            ". Let's try again, " + name);
                    exam = false;
                }
                if ((numberGame == 3) & (exam)) {
                    System.out.println("Congratulations, " + name + "\n");
                }
            }
            remainder = -1;
        }
    }

}
