import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class gameWonWorld extends World
{

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public gameWonWorld()
    {
        super(600, 400, 1);
        showTextWithBigBlackFont("You won the game!", 100, 200);
    }

    /**
     * This method will add font and colour to the winning text.
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
