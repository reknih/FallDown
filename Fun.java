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
    private int step;
    public final int MAXSTEP = 20;
    
    public final int WIDTH   = 1200;
    public final int HEIGHT  = 800;

    public Fun()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        Greenfoot.setSpeed(10);
        step = MAXSTEP;
    }

    public void act(){
        step--;
        if (step != 0)
            return;
        step = MAXSTEP;
        for (int i = WIDTH; i >= 0; i = i - 100) {
            if(Greenfoot.getRandomNumber(36) < 23)
            {
                addObject(new Wand(), i, 0);
            }
        }
    }
}



