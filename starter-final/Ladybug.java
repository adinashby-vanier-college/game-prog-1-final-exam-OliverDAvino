import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }

    /**
     * this moves the lady bug
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("up")){
            move (3);
        }
        if (Greenfoot.isKeyDown("down")){
            move(-3);
        }
        if(Greenfoot.isKeyDown("left")){
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(3);
        }
    }
    
}
