import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turn_din_magazin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turn_din_magazin extends Actor
{
    levels world;
    public turn_din_magazin()
    {
        world.archer=-1;
    }
    public void act()
    {
        verifica();        
    }
    public void verifica()
    {
        if(world.shop_open==0)
        {
            if(Greenfoot.mouseClicked(this)==true)
                world.archer*=(-1);
            if(world.archer==1)
                setImage("highlighted_archer.png");
            else
                setImage("archer_magazin.png");
        }
        
        
        
    }
}
