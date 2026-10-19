import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shop extends Actor
{
    levels world;
    public void act()
    {
        if(Greenfoot.mouseClicked(this)==true)
        {
            if(world.shop_open==0)
                world.shop_open=-1;
            else if(world.shop_open==-1)
                world.shop_open=1;
        }
    }
}
