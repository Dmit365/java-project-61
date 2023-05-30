package hexlet.code;
import java.lang.Math;
import java.util.Scanner;

public class Even {
    public static void gameEven(String name) {
        int number = 0;
        boolean exam = true;
        int numberGame = 0;
        Scanner in = new Scanner(System.in);
        String choise = null;
        System.out.println(" Answer 'yes' if the number is even, otherwise answer 'no'.");
        while ((exam) & (numberGame != 3)) {
            number = (int) (Math.random() * 100);
            System.out.println("Question: " + number + "\n");
            choise = in.nextLine();
            System.out.println("Your answer: " + choise + "\n");
            if (((number % 2 == 0) & (choise.equals("yes"))) || ((number % 2 == 1) & (choise.equals("no")))) {
                System.out.println("Correct!\n");
                numberGame++;
            }
            if ((number % 2 == 1) & (choise.equals("yes"))) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again " + name);
                exam = false;
            }
            if ((number % 2 == 0) & (choise.equals("no"))) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again " + name);
                exam = false;
            }
            if (!((choise.equals("no")) || (choise.equals("yes")))) {
                System.out.println("The answer is not correct, you must enter 'yes' or 'no'.\n" +
                        "Let's try again " + name);
                exam = false;
            }
        }
        if ((numberGame == 3) & (exam)) {
            System.out.println("Congratulations, " + name + "\n");
        }


    }
}
