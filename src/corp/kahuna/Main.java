package corp.kahuna;

/**
 * @author Learn Programming Academy Team
 * @see <a href="https://learnprogramming.academy">https://learnprogramming.academy</a>
 */
public class Main {

    public static void main(String[] args) {

        boolean playAgain = true;

        while (playAgain) {
            corp.kahuna.BitcoinMiner game = new corp.kahuna.BitcoinMiner();
            game.play();
            playAgain = corp.kahuna.BitcoinMiner.getYesOrNo("Would you like to play again?");
        }

        System.out.println("Goodbye");
    }
}
