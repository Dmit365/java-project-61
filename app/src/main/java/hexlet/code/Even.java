package hexlet.code;
import java.util.Scanner;

public class Even {
    public static void gameEven(String name) {
        boolean exam = true;
        byte numberGame = 0;
        final byte maxGame = 3;
        Scanner in = new Scanner(System.in);
        String answer = null;
        final int multiplicityNumber = 100;
        System.out.println(" Answer 'yes' if the number is even, otherwise answer 'no'.");
        while ((exam) & (numberGame != maxGame)) {
            int number = (int) (Math.random() * multiplicityNumber);
            System.out.println("Question: " + number);
            String answerPlayer = in.nextLine();
            System.out.println("Your answer: " + answerPlayer);
            if (number % 2 == 0) {
                answer = "yes";
            }
            if (number % 2 == 1) {
                answer = "no";
            }
            exam = StringCheck.stringCheck(name, answerPlayer, answer, exam);
            numberGame++;
            Cong.congratulation(name, numberGame, exam, maxGame);
        }
    }
}
