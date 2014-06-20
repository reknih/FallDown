import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wand extends Actor
{
    public int reichweite;
    public int flugrichtung;
    public final int GESCHWINDIGKEIT = 5;

    public void act() 
    {
        bewegen();
        wandVerschwindet ();
    } 
    
    public Wand ()
    {
        reichweite = 800;
        flugrichtung = 1;
    }
    
    public void bewegen()
    {
        int x = getX();
        int y= getY();

        if (flugrichtung == 1)
        {
            setLocation(x, y + GESCHWINDIGKEIT);
            reichweite = reichweite - GESCHWINDIGKEIT;

        }
    }

    public void wandVerschwindet ()
    {
        if (reichweite <= 5) {
            getWorld().removeObject(this);

        }
    }   
}
