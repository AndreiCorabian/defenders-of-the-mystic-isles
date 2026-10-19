import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nivel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nivel extends Actor
{
    int level;
    harta harta;
    public nivel(int x, harta y)
    {
        this.level=x;
        harta=y;
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)==true)
        {
            Greenfoot.playSound("button_clicked.mp3");
            switch(this.level)
            {
                case 1: {pre_level1 world1= new pre_level1(harta); Greenfoot.setWorld(world1); break;}
                case 2: {pre_level2 world2= new pre_level2(harta); Greenfoot.setWorld(world2); break;}
                case 3: {pre_level3 world3= new pre_level3(harta); Greenfoot.setWorld(world3); break;}
                case 4: {pre_level4 world4= new pre_level4(harta); Greenfoot.setWorld(world4); break;}
                case 5: {pre_level5 world5= new pre_level5(harta); Greenfoot.setWorld(world5); break;}
                default : break;
                
            }
            
        }
    }
}
