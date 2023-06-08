package hexlet.code;

public class Cong {
    public static void congratulation(String name, byte numberGame, boolean exam) {
        if ((numberGame == 3) & (exam)) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
