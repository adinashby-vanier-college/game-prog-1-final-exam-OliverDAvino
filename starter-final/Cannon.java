import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Cannon extends Actor
{
    private int fireRate;
    private int timer;
    public Cannon (int fireRate)
    {
        this.fireRate = fireRate;
        this.timer = timer; 
        }
    public void act(){
        //sets a timer for the shots
        if(timer==0){
            fireCannonball();
            timer = fireRate;
        }
        else{
           timer--; 
            }
        }
          private void fireCannonball()
          //fires the cannonball
        {

            Cannonball cannonball = new Cannonball();

        }
        private int getSpeed()
        //gets the speed of the cannonball
        
        
        return 5 + (10 - fireRate); 
    }
    }
