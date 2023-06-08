package hexlet.code;
import java.lang.Math;
import java.util.Scanner;

public class Even {
    public static void gameEven(String name) {
        boolean exam = true;
        byte numberGame = 0;
        Scanner in = new Scanner(System.in);
        String answer = null;
        System.out.println(" Answer 'yes' if the number is even, otherwise answer 'no'.");
        while ((exam) & (numberGame != 3)) {
            int number = (int) (Math.random() * 100);
            System.out.println("Question: " + number + "\n");
            String answerPlayer = in.nextLine();
            System.out.println("Your answer: " + answerPlayer + "\n");
            if (number % 2 == 0) {
                answer = "yes";
            }
            if (number % 2 == 1) {
                answer = "no";
            }
            exam = StringCheck.stringCheck(name, answerPlayer, answer, exam);
            numberGame++;
            Cong.congratulation(name, numberGame, exam);
        }
    }
}
