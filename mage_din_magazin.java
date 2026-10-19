import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mage_din_magazin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mage_din_magazin extends Actor
{
    levels world;
    public mage_din_magazin()
    {
        world.mage=-1;
    }
    public void act()
    {
        verifica_mouse();        
    }
    public void verifica_mouse()
    {
        if(world.shop_open==0)
        {
            if(Greenfoot.mouseClicked(this)==true)
                world.mage*=(-1);
            if(world.mage==1)
                setImage("highlighted_mage.png");
            else
                setImage("magetower_magazin.png");
        }
    }
}
