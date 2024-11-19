import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
* Write a description of class CannonBall here.
* 
*/
public class CannonBall extends Actor
{
    private Point2D position;
    private Vector2D velocity;
    private Vector2D acceleration;
    
    private static final double GRAVITY = 9.8 * 200; // 200 pixels is 1 meter
    //this is the cannon ball constructor
    public CannonBall()
    {
        position = null;
        velocity = new Vector2D(0.0, 0.0);
        acceleration = new Vector2D(0.0, GRAVITY);
    }
    //this is the act
    public void act() 
    {
        updatePhysics();
        isGameLost();
    }    
    
    public void setVelocity(Vector2D newValue)
    {
        velocity = newValue;
    }
    
    public void updatePhysics()
    {
        if (position == null)
        {
            position = new Point2D(getX(), getY());
        }
        
        // Get time step duration
        MyWorld world = (MyWorld) getWorld();
        double dt = world.getTimeStepDuration();
        
        // Update velocity
        Vector2D velocityVariation = Vector2D.multiply(acceleration, dt);
        velocity = Vector2D.add(velocity, velocityVariation);

        // Update position
        Vector2D positionVariation = Vector2D.multiply(velocity, dt);
        position.add(positionVariation);
        
        // Set new actor position
        setLocation((int) position.getX(), (int) position.getY());        
    }
    public void isGameLost()
    //this calls the game lost world when the cannonball touches the ladybug 
    {
        if(isTouching(CannonBall.class)){
            transitionToGameLostWorld();
            Greenfoot.playSound("lose.wav");
        }
    }       
        
        public void transitionToGameLostWorld()
        //this transitions the world into the game lost worl
    {
        World gameLostWorld =  new  gameLostWorld();
        Greenfoot.setWorld(gameLostWorld);
    }
}
