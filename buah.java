import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buah extends Actor
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY()+3);
        if(getY()>=getWorld().getHeight()-10){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
        }
        if(isTouching(keranjang.class)){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
            MyWorld.score.add(10);
        }
    }
}
