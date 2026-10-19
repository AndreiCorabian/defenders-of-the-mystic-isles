import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy_projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy_projectile extends Actor
{
    static int damage;
    int distanta_parcursa=0;
    public double getDistance(Actor actor) 
    {
        return Math.hypot(actor.getX() - getX(), actor.getY() - getY());
    }
    public void miscare(int speed)
    {
        move(speed);
        distanta_parcursa=distanta_parcursa+speed;
        if(distanta_parcursa>300)
            getWorld().removeObject(this);
    }
    public void act()
    {
        // Add your action code here.
    }
}
