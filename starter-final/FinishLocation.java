import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class FinishLocation extends Actor
{
    public void act()
    //This if statement calls the game won world when the lady bug touches the target
    {
       if(isTouching(Ladybug.class)){
           transitionToGameWonWorld();
           Greenfoot.playSound("win.wav");
       }
    }
    
    public void transitionToGameWonWorld()
    //this code transitions the world into the game  won world
        {
        {
            World gameWonWorld =  new gameWonWorld();
            Greenfoot.setWorld(gameWonWorld);
        }
    }
}
