import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends Actor
{
    starting_menu world;
    public void act()
    {
        if(Greenfoot.mouseClicked(this)==true)
        {
            Greenfoot.playSound("button_clicked.mp3");
            world.next=1;
        }
    }
}
