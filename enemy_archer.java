import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy_archer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy_archer extends enemies
{
    public enemy_archer()
    {
        hp=80;
        damage=10;
        bounty=15;
        range=150;
        attack_speed=10;
    }
    public void act()
    {
        hitByProjectile();
        if(getNearestActor()!=null)
        {   target=getNearestActor();
            turnTowards(target.getX(),target.getY());
        }
        if(target!=null)
        {
            if(pozitie_stop(range)==true)
                ranged_attack();
            else
                move(5);
        }
        else
            move(5);
        if(afiseaza==1)
        {
            show_healthbar(hp,getX(),getY(),getImage().getHeight());
            afiseaza=0;
        }
        else if(this.healthbar!=null)
            {   healthbar.update();
                healthbar.setLocation(getX(),getY()-getImage().getHeight()/2-2);
            }
        
        
    }
}
