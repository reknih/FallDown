import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runer extends Actor
{
    public int yellowPointVorhanden = 0 ;
    public boolean  yellowPointVoll = false;
    public int look = 1 ;
    
    
    
    public void act() 
    {
       bombWerfen();
       bewegen();
       aufsammeln();
       wurfRichtungFestlegen();
       bombWerfen();
    } 
    
    public void bewegen(){
    
    int x = getX();
    int y = getY();
    if(Greenfoot.isKeyDown("w") && getOneObjectAtOffset(10,0,rocket.class) == null )
// überprüft ob vom Mittelpunkt des Actor 5 in x richtung eine Rocket  vorhanden ist (null heißt das etwas nicht vorhanden ist) daher bewegt er sich nur wenn keine rocket im Weg ist 
    {
        setLocation(x, y - 2 ); // verändert den Standpunkt hier : y richtung - 2
    }
    else if (Greenfoot.isKeyDown("s") && getOneObjectAtOffset(-10,0,rocket.class) == null ) 
// jenachdem wie man die Koordinaten bzw. die Richtungen verändert wird geprüft ob die Rocket unter oder neben einem ist oder sonst wo :D
    {
        setLocation( x , y + 2);
    }
    else if (Greenfoot.isKeyDown("a") && getOneObjectAtOffset(0,-10,rocket.class) == null )
    {
        setLocation( x - 2 , y );
    }
    else if (Greenfoot.isKeyDown("d") && getOneObjectAtOffset(0,10,rocket.class) == null )
    {
        setLocation( x + 2 , y );
    }
   }

   public void aufsammeln(){
    Actor yellowPoint = this.getOneObjectAtOffset(0,0, yellowPoint.class); // actor yellowpoint sagt ,dass wir mit dem actor yellowpoint etwas machen
                                                                            //  this heißt,dass das sich das ganze nur auf das objekt hier den runner bezieht 
                                                                            // getOneObjectAtOffset(0,0, yellowPoint.class);  prüft dauerhaft ob ein yellowpoint unter uns ist
    if ( yellowPoint!= null){                                                  // heißt, dass ein yellowPoint vorhanden ist 
        if(yellowPointVorhanden ++ <= 5){                                      // wenn zu den vorhandenen yellowPoints vnoch einer aufgenommen werden kann under Wert noch kleiner gleich 10 ist
        getWorld().removeObject(yellowPoint);                                   // dann wird der yellowPoint gelöscht 
        yellowPointVorhanden =yellowPointVorhanden ++;                          // und zu dem zähler yellowPoint vorhanden einer drauf addiert 
        }
    }
    
}

public void wurfRichtungFestlegen(){
if (Greenfoot.isKeyDown("left")){
        look =2;}
        else if (Greenfoot.isKeyDown("up")){
        look = 3 ;}
        else if (Greenfoot.isKeyDown("down")){
        look= 4;}
        else if (Greenfoot.isKeyDown("right")){
        look =1;}
}


public void bombWerfen(){

    int x = getX();
    int y = getY();
    
    if(Greenfoot.isKeyDown("space")){
if (  yellowPointVorhanden > 0  ){
    if (look == 1){
    bomb s = new bomb(1);
    getWorld().addObject(s, x + 5,y);
    yellowPointVorhanden--;
}
else if (look == 2){
    bomb s = new bomb(2);
    getWorld().addObject(s, x - 5,y);
    yellowPointVorhanden--;
}
else if (look == 3){
    bomb s = new bomb(3);
    getWorld().addObject(s, x ,y -5);
    yellowPointVorhanden--;
}
else if (look == 4){
    bomb s = new bomb(4);
    getWorld().addObject(s, x ,y + 5);
    yellowPointVorhanden--;
}
}
}
}
}
