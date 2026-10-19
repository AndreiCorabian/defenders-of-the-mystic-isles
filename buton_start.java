import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buton_start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buton_start extends Actor
{
    int level;
    levels world;
    public buton_start(int x)
    {
        level=x;
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)==true)
        {
            getWorld().removeObject(this);
            world.start_muzica=1;
            world.start_joc=1;
    
        }
    }
}
