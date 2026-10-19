import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mage_tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mage_tower extends towers
{
    public mage_tower()
    {
        range=300;
        damage=30;
        level=1;
        attack_speed=20;
        hp=150;
    }
    public void act()
    {
        hitByProjectile();
        if(hp<=0)
            return;
        which_enemy(range,damage,attack_speed,2);
        if(afiseaza==1)
        {
            afiseaza=0;
            show_healthbar(hp,getX(),getY(),getImage().getHeight());
        }
        else if(this.healthbar!=null)
            update_healthbar(hp);
    }
}
