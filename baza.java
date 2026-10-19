import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baza extends towers
{
    levels world;
    public baza()
    {
        hp=200;
        afiseaza=1;
    }
    public void act()
    {
        hitByProjectile();
        if(this.hp<=50)
        {
            world.lost=1;
        }
        if(afiseaza==1)
        {
            afiseaza=0;
            show_healthbar(hp,getX(),getY(),getImage().getHeight());
        }
        else if(this.healthbar!=null)
            update_healthbar(hp);
    }
}
