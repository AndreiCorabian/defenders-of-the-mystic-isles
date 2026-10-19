import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    int health;
    int healthBarHeight=5;
    int healthBarWidth=100;
    int health_maxim;
    public HealthBar( obiecte_cu_viata curent)
    {
        health_maxim=curent.hp;
        health=curent.hp;
        curent.healthbar=this;
    }
    public void act()
    {
        if(health<=0)
            getWorld().removeObject(this);
        else
            update();
    }
    public void update()
    {
        GreenfootImage img= new GreenfootImage(healthBarWidth+2,healthBarHeight+2);
        img.setColor(Color.BLACK);
        img.drawRect(0,0,healthBarWidth+1,healthBarHeight);
        img.setColor(Color.RED);
        int val=(int)(1.0*health/health_maxim*health);
        img.fillRect(1,1,val,healthBarHeight);
        setImage(img);
    }
}
