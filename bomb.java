import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Actor
{
    public int Reichweite; 
    public int flugrichtung;
    
    public bomb(int pFlugrichtung){
        Reichweite = 50;
        flugrichtung=pFlugrichtung;
    } 

    public void act() 
    {
        bewegen();
        bombVerschwindet();
    }   

    public void bewegen()
    {
        int x = getX();
        int y= getY();
        if(  flugrichtung == 1){
            setLocation (x+4, y);
            Reichweite= Reichweite -1;
        }
        else if(flugrichtung == 3 ){
            setLocation(x, y - 4 );
            Reichweite = Reichweite -1;
        } 
        else if ( flugrichtung == 4 ){
            setLocation (x, y+4);
            Reichweite = Reichweite -1;
        }
        else if (flugrichtung == 2){
            setLocation (x-4,y);
            Reichweite = Reichweite -1;
        }

    }

    public void bombVerschwindet(){
        Actor rocket = this.getOneObjectAtOffset(0,0,rocket.class);
        if(rocket!=null){
            getWorld().removeObject(this);
        }
        else if (Reichweite == -5){
            getWorld().removeObject(this);
        }

    }
}


