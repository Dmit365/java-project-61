package hexlet.code;

import org.apache.commons.lang3.StringUtils;

public class NumCheck {
    public static boolean numberCheck(String name, String answerPlayer, int answer, boolean exam) {
        if (!StringUtils.isNumeric(answerPlayer)) {
            System.out.println(answerPlayer + " is wrong answer ;(. Correct answer was " +  answer +
                    ". Let's try again, " + name + "!");
            exam = false;
        } else {
            if (Integer.parseInt(answerPlayer) == answer) {
                System.out.println("Correct!");
            } else {
                System.out.println(answerPlayer + " is wrong answer ;(. Correct answer was " + answer +
                        ". Let's try again, " + name + "!");
                exam = false;
            }
        }
        return exam;
        }
    }
