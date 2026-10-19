import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stop_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stop_button extends Actor
{
    int ok;
    public stop_button()
    {
        ok=-1;
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)==true)
        {
            ok=ok*(-1);
            if(ok==1)
                Greenfoot.stop();
            else
                Greenfoot.start();
        }
    }
}
