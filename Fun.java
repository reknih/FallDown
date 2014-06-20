import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fun extends World
{

    /**
     * Constructor for objects of class Fun.
     * 
     */
    public Fun()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        Greenfoot.setSpeed(10);
    }

    public void act(){
        if(Greenfoot.getRandomNumber(36)<23)
        {
            addObject(new Wand(),Greenfoot.getRandomNumber(800),0);
        }
        if(Greenfoot.getRandomNumber(36)<23)
        {
            addObject(new Wand(),Greenfoot.getRandomNumber(700),0);
        }
        if(Greenfoot.getRandomNumber(36)<23)
        {
            addObject(new Wand(),Greenfoot.getRandomNumber(600),0);
        }

        if(Greenfoot.getRandomNumber(36)<23)
        {
            addObject(new Wand(),Greenfoot.getRandomNumber(500),0);
        }

        if(Greenfoot.getRandomNumber(36)<23)
        {
            addObject(new Wand(),Greenfoot.getRandomNumber(400),0);
        }

        if(Greenfoot.getRandomNumber(36)<23)
        {
            addObject(new Wand(),Greenfoot.getRandomNumber(300),0);
        } 

        if(Greenfoot.getRandomNumber(36)<23)
        {
            addObject(new Wand(),Greenfoot.getRandomNumber(200),0);
        }

        if(Greenfoot.getRandomNumber(36)<23)
        {
            addObject(new Wand(),Greenfoot.getRandomNumber(100),0);
        }
        if(Greenfoot.getRandomNumber(36)<23)
        {
            addObject(new Wand(),Greenfoot.getRandomNumber(1),0);
        }
    }
}



