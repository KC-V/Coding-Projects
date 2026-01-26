import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /* EXERCISE 1b: Basic Resource Miner Game
         * Create a Basic "Resource Miner" Game. This is of course open to interpretation.
         *
         * The Basic idea is as follows: Via a random number generated, the "player" has one of (at least) three "blocks"
         * in front of them. Let's call them Clay, Stone, Cobweb as examples. The player must then decide which tool to use
         * Sword, Shovel, Pickaxe. Is the correct tool chosen then the player moves onto the next randomly selected block.
         * They should mine three blocks and then the game outputs the score on how many they mined correctly!
         *
         * When the player types in their tool, make sure to do a small amount of error correction. Make sure that both
         * lower and uppercase for the tool names are basically ignored! (Lesson: String Methods)
         *
         * For ease of use this, generates a number between 1 and 3, feel free to use it:
         * int min = 1;
         * int max = 3;
         * int randomBlock = (int) (Math.random() * (max - min + 1)) + min;
         *
         * Estimated Time ~60+ minutes
         *
         */
        for (int Correct = 0; Correct < 3; Correct++) {
            System.out.println("Current Points:" + Correct);
            int min = 1;
            int max = 3;
            int randomBlock = (int) (Math.random() * (max - min + 1)) + min;

            switch (randomBlock) {
                case 1:
                    int blockOut = randomBlock;
                    System.out.println("Mine The Clay");
                    break;
                case 2:
                    int blockOut2 = randomBlock;
                    System.out.println("Mine The Stone");
                    break;
                case 3:
                    int blockOut3 = randomBlock;
                    System.out.println("Mine The Cobweb");
                    break;
                default:
                    System.out.println("Error: block not found");
                    break;
            }

                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose The Tool You Want to Use");
                String sword = "sword";
                String shovel = "shovel";
                String pickaxe = "pickaxe";
                String tool = scanner.next();
                String toolFilter = tool.toLowerCase();
                if (toolFilter.equals(sword) && randomBlock == 3) {
                    System.out.println("sword is the right choice");
                    int swordCorrect = 1;
                } else if (toolFilter.equals(shovel) && randomBlock == 1) {
                    System.out.println("shovel is the right choice");
                    int shovelCorrect = 1;
                } else if (toolFilter.equals(pickaxe) && randomBlock == 2) {
                    System.out.println("pickaxe is the right choice");
                    int pickaxeCorrect = 1;
                } else {
                    Correct--;
                    Correct--;
                    System.out.println("Error: Not A Tool Please pick between sword shovel or pickaxe");
                }

        }
        System.out.println("YOU WIN!");
    }
}
