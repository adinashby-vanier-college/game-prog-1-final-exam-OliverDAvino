import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class gameLostWorld extends World
{

    /**
     * Constructor for objects of class GameLostWorld.
     */
    public gameLostWorld()
    {
        super(600, 400, 1);
        showTextWithBigRedFont("Game Over!", 150, 200);
    }

    /**
     * This method will add font and colour to the losing text.
     */
    public void showTextWithBigRedFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(message, x, y);
    }
}
