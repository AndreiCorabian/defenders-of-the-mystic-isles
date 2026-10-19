import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obiecte_cu_viata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obiecte_cu_viata extends Actor
{
    public int hp;
    int afiseaza=1;
    HealthBar healthbar;
    void show_healthbar(int health,int x, int y,int height)
    {
        HealthBar healthbar= new HealthBar(this);
        getWorld().addObject(healthbar,x,y-height/2-2);
    
    }
    void update_healthbar(int health)
    {
        healthbar.update();
    }
    public void act()
    {
        
    }
}
