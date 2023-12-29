import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY()+2);
        if(getY()>=getWorld().getHeight()-10){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
    }
    if(isTouching(keranjang.class)){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
            MyWorld.health.add(-1);
            if(MyWorld.health.getValue()==0){
                getWorld().showText("Score : " +MyWorld.score.getValue(),getWorld().getWidth()/2,getWorld().getHeight()/3);
                getWorld().addObject(new gameover(),350,350);
                Greenfoot.stop();
            }
        }
  }
}
