import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fireball extends projectile
{
    int distanta_parcursa=0;
    public double getDistance(Actor actor) 
    {
        return Math.hypot(actor.getX() - getX(), actor.getY() - getY());
    }
    public void act()
    {
        miscare(20);
    }
}
