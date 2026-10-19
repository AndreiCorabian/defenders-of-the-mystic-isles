import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inamic1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inamic1 extends enemies
{
    boolean still_alive()
    {
        if(this.hp<=0)
            return false;
        else
            return true;
    }
    
    public inamic1()
    {
        hp=100;
        damage=15;
        bounty=10;
        range=10;
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
                stop();
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
