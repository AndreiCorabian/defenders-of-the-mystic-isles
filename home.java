import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class home extends Actor
{
    starting_menu world;
    public void act()
    {
        if(Greenfoot.mouseClicked(this)==true)
        {
            world = new starting_menu();
            Greenfoot.setWorld(world);
        }
    }
}
