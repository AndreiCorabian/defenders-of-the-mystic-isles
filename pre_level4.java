import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pre_level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pre_level4 extends World
{

    harta world;
    public pre_level4(harta x)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        world=x;
        addObject(new play_button(world,4),700,400);
        addObject(new back_to_map(world),700,460);
    }
}
