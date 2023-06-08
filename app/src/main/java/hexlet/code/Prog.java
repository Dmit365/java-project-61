package hexlet.code;
import java.lang.Math;
import java.sql.Array;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;

public class Prog {
    public static void gameProg(String name) {
        Scanner in = new Scanner(System.in);
        byte sizeArray = 0;
        int firstNumber = 0;
        boolean exam = true;
        int numberGame = 0;
        int step = 0;
        byte answerIndex = 0;
        String answer = null;
        while ((exam) & (numberGame != 3)) {
            sizeArray = (byte) (Math.random() * 5 + 5);
            firstNumber = (int) (Math.random() * 100);
            step = (int) (Math.random() * 100);
            String[] array = new String[sizeArray];
            array[0] = Integer.toString(firstNumber);
            answerIndex = (byte) (Math.random() * sizeArray - 1);
            System.out.println("What number is missing in the progression?\n");
            if (firstNumber >= 50) {
                for (var i = 1; i < sizeArray; i++) {
                    array[i] = Integer.toString(Integer.parseInt(array[i-1]) + step);
                }
            } else {
                for (var i = 1; i < sizeArray; i++) {
                    array[i] = Integer.toString(Integer.parseInt(array[i-1]) * (int) (step / 10));
                }
            }
            answer = array[answerIndex];
            array[answerIndex] = "..";
            System.out.println("Question: " + Arrays.deepToString(array));
            String answerPlayer = in.nextLine();
            System.out.println("Your answer: " + answerPlayer);
            if (!StringUtils.isNumeric(answerPlayer)) {
                System.out.println(answerPlayer + " is wrong answer ;(. Correct answer was " +  answer +
                        ". Let's try again, " + name);
                exam = false;
            } else {
                if (answerPlayer.equals(answer) ) {
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
