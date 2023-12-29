import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Counter score = new Counter("score: ");
    static Counter health = new Counter("health: ");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1); 
        prepare();
    }
    
    private void prepare(){
        keranjang keranjang = new keranjang();
        addObject(keranjang,350,625);
        buah buah = new buah();
        addObject(buah,94,97);
        buah buah2 = new buah();
        addObject(buah2,277,100);
        buah buah3 = new buah();
        addObject(buah3,184,85);
        bomb bomb = new bomb();
        addObject(bomb,343,49);
        addObject(score,50,100);
        addObject(health,50,140);
        health.setValue(3);
        score.setValue(0);
    }
}
