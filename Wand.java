import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wand extends Actor
{
    public int Reichweite;
    public int Flugrichtung;

    public void act() 
    {
        bewegen();
        wandVerschwindet ();
    } 
    
    public Wand (int Flugrichtung)
    {
        Reichweite = 800 ;
        Flugrichtung=1;
    }

    public Wand()
    {

    }
    
    public void bewegen()
    {
        int x = getX();
        int y= getY();

        if (Flugrichtung == 1)
        {
            setLocation(x, y+5);
            Reichweite= Reichweite--;

        }
    }

    public void wandVerschwindet ()
    {
        if (Reichweite == 5) {
            getWorld().removeObject(this);

        }
    }   
}
