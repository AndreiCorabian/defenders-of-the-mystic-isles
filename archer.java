import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class turn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class archer extends towers
{
    
    
    enemies target;
    public archer()
    {
        range=300;
        damage=10;
        level=1;
        attack_speed=7;
        hp=100;
        
    }
    public void act()
    {
        hitByProjectile();
        if(hp<=0)
            return;
        
        which_enemy(range,damage,attack_speed,1);
        if(afiseaza==1)
        {
            afiseaza=0;
            show_healthbar(hp,getX(),getY(),getImage().getHeight());
        }
        else if(this.healthbar!=null)
            update_healthbar(hp);
        
        //if(still_alive())
    }
}

