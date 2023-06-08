package hexlet.code;

public class Cong {
    public static void congratulation(String name, byte numberGame, boolean exam, byte maxGame) {
        if ((numberGame == maxGame) & (exam)) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
