package hexlet.code;

import java.util.Arrays;

public class Cong {
    public static void congratulation(String name, byte numberGame, boolean exam) {
        if ((numberGame == 3) & (exam)) {
            System.out.println("Congratulations, " + name + "\n");
        }
    }
}
