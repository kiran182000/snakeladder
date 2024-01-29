import java.util.*;
public class snakeladder {
    public static void main(String[] args){
        int RollDice=(int)(Math.random()*6+1);
        System.out.println("Dice number after rolling: "+RollDice);
        int Option=(int)(Math.random()*3+1);
        int position=0;
        switch(Option)
        {
            case 1:
                System.out.println("NO PLAY: "+position);
                System.out.println("Player stays in the same position");
                break;
            case 2:
                System.out.println("LADDER: "+(RollDice+position));
                System.out.println("Player moves ahead by: "+RollDice);
                break;
            case 3:
                System.out.println("SNAKE: "+(RollDice+position));
                System.out.println("Player moves behind by: "+RollDice);

        }
    }
}
