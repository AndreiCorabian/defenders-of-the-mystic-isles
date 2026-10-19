import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back_to_map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back_to_map extends Actor
{
    /**
     * Act - do whatever the back_to_map wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    harta world;
    public back_to_map(harta x)
    {
        world=x;
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)==true)
        {
            Greenfoot.playSound("button_clicked.mp3");
            Greenfoot.setWorld(world);
        }
    }
}
