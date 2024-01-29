import java.util.*;
public class snakeladder {
    public static void main(String[] args) {
        System.out.println("Player starts at postion 0");
        int playerposition = 0;
        boolean presentturn = true;
        while (playerposition != 100) {
            if (presentturn == true) {
                System.out.println("Current position" + playerposition);
                int RollDice = (int) (Math.random() * 6 + 1);
                System.out.println("Dice number after rolling: " + RollDice);
                int Option = (int) (Math.random() * 3 + 1);

                switch (Option) {
                    case 1:
                        System.out.println("NO PLAY: " + playerposition);
                        System.out.println("Player stays in the same position");
                        break;
                    case 2:
                        System.out.println("LADDER: " + (RollDice + playerposition));
                        System.out.println("Player moves ahead by: " + RollDice);
                        playerposition = playerposition + RollDice;
                        break;
                    case 3:
                        System.out.println("SNAKE: " + (RollDice + playerposition));
                        System.out.println("Player moves behind by: " + RollDice);
                        playerposition = playerposition - RollDice;
                        break;
                }
                if (playerposition < 0) {
                    playerposition = 0;
                }
                System.out.println();
            }
        }
        System.out.println("PLAYER WINS");
    }
}


