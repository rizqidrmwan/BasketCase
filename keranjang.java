import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BasketBanana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class keranjang extends Actor
{
    /**
     * Act - do whatever the BasketBanana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        setLocation(getX()-3,getY());
        if(Greenfoot.isKeyDown("right"))
        setLocation(getX()+3,getY());
        
    }
}
