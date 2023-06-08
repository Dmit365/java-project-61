package hexlet.code;
import java.util.Scanner;

public class Prime {
    public static void gamePrime(String name) {
        Scanner in = new Scanner(System.in);
        byte numberGame = 0;
        boolean exam = true;
        final byte maxGame = 3;
        final int multiplicityNumber = 100;
        final int three = 3;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while ((exam) & (numberGame != maxGame)) {
            String answer = "no";
            boolean examAnswer = false;
            int number = (int) (Math.random() * multiplicityNumber + 1);
            System.out.println("Question: " + number);
            String answerPlayer = in.nextLine();
            System.out.println("Your answer: " + answerPlayer);
            if ((number == 2) || (number == three)) {
                answer = "yes";
            } else if ((number % 2) == 0) {
                examAnswer = true;
            } else {
                for (var i = three; i < number; i = i + 2) {
                    if (number % i == 0) {
                        examAnswer = true;
                    }
                }
            }
            if (!examAnswer) {
                answer = "yes";
            }
            exam = StringCheck.stringCheck(name, answerPlayer, answer, exam);
            numberGame++;
            Cong.congratulation(name, numberGame, exam, maxGame);
            }
        }
    }

