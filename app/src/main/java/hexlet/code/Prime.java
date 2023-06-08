package hexlet.code;
import java.lang.Math;
import java.util.Scanner;

public class Prime {
    public static void gamePrime(String name) {
        Scanner in = new Scanner(System.in);
        byte numberGame = 0;
        int remainder = -1;
        boolean exam = true;
        boolean examAnswer = false;
        int number = 0;
        String answer = null;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.\n");
        while ((exam) & (numberGame != 3)) {
            answer = "no";
            examAnswer = false;
            number = (int) (Math.random() * 100 + 1);
            System.out.println("Question: " + number + "\n");
            String answerPlayer = in.nextLine();
            System.out.println("Your answer: " + answerPlayer);
            if ((number == 2) || (number == 3)){
                answer = "yes";
            } else if ((number % 2) == 0) {
                examAnswer = true;
            } else {
                for (var i = 3; i < number; i = i + 2) {
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
            Cong.congratulation(name, numberGame, exam);
            /*if (answerPlayer.equals(answer)) {
                System.out.println("Correct!\n");
                numberGame++;
            } else {
                System.out.println(answerPlayer + " is wrong answer ;(. Correct answer was " + answer +
                        ". Let's try again, " + name);
                exam = false;
            }
            if ((numberGame == 3) & (exam)) {
                System.out.println("Congratulations, " + name + "\n");
                }*/
            }
        }
    }

