import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class encyclopedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class encyclopedia extends World
{

    /**
     * Constructor for objects of class encyclopedia.
     * 
     */
    public encyclopedia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        addObject(new home(),100,50);
    }
}
