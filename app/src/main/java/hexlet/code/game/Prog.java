package hexlet.code.game;
import hexlet.code.Cong;
import hexlet.code.NumCheck;

import java.util.Scanner;
import java.util.Arrays;

public class Prog {
    public static void gameProg(String name) {
        Scanner in = new Scanner(System.in);
        boolean exam = true;
        byte numberGame = 0;
        final byte maxGame = 3;
        final int maxSize = 10;
        final int minSize = 5;
        final int range = maxSize - minSize + 1;
        final int multiplicityNumber = 100;
        final int multiplicityStep = 100;
        while ((exam) & (numberGame != maxGame)) {
            byte sizeArray = (byte) ((Math.random() * range) + minSize);
            int firstNumber = (int) (Math.random() * multiplicityNumber);
            int step = (int) (Math.random() * multiplicityStep);
            String[] array = new String[sizeArray];
            array[0] = Integer.toString(firstNumber);
            byte answerIndex = (byte) (Math.random() * sizeArray - 1);
            System.out.println("What number is missing in the progression?");
            for (var i = 1; i < sizeArray; i++) {
                array[i] = Integer.toString(Integer.parseInt(array[i - 1]) + step);
            }
            String answer = array[answerIndex];
            array[answerIndex] = "..";
            String arrayToString = Arrays.deepToString(array).replace("[", "").replace("]", "").replace(",", "");
            System.out.println("Question: " + arrayToString);
            String answerPlayer = in.nextLine();
            System.out.println("Your answer: " + answerPlayer);
            exam = NumCheck.numberCheck(name, answerPlayer, Integer.parseInt(answer), exam);
            numberGame++;
            Cong.congratulation(name, numberGame, exam, maxGame);
        }
    }
}
