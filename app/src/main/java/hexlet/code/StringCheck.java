package hexlet.code;

public class StringCheck {
    public static boolean stringCheck(String name, String answerPlayer, String answer, boolean exam) {
        if (answerPlayer.equals(answer)) {
            System.out.println("Correct!");
        } else {
            System.out.println(answerPlayer
                    + " is wrong answer ;(. Correct answer was "
                    + answer
                    + ". Let's try again, "
                    + name
                    + "!");
            exam = false;
        }
        return exam;
    }

}
