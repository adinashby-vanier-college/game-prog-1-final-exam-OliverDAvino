import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 600, 1);
        prepare();
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; // seems to be the default
        prepare();
    }
    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cannon canon =  new  Cannon();
        addObject(canon, 95, 92);
        Cannon canon2 =  new  Cannon();
        addObject(canon2, 321, 277);
        Cannon canon3 =  new  Cannon();
        addObject(canon3, 692, 107);
        Cannon canon4 =  new  Cannon();
        addObject(canon4, 708, 478);
        Cannon canon5 =  new  Cannon();
        addObject(canon5, 497, 52);
        canon3.setLocation(730, 171);
        canon2.setLocation(289, 316);
        FinishLocation finishLocation =  new  FinishLocation();
        addObject(finishLocation, 75, 324);
        Ladybug hero =  new  Ladybug();
        addObject(hero, 720, 286);
        canon3.setRotation(180);
        canon4.setLocation(737, 479);
        canon4.setRotation(180);
        canon5.setRotation(90);
        hero.setRotation(180);
        hero.setLocation(742, 58);
        hero.setLocation(734, 54);
        CannonBall cannonBall = new CannonBall();
        addObject(cannonBall,242,300);
        cannonBall.setLocation(625,16);
        removeObject(cannonBall);
    }
}
