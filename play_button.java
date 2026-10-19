import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play_button extends Actor
{
    /**
     * Act - do whatever the play_button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    harta harta;
    int level;
    public play_button(harta x,int nivel)
    {
        harta=x;
        level=nivel;
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)==true)
        {
            Greenfoot.playSound("button_clicked.mp3");
            switch(this.level)
            {
                case 1: {Level1 world1= new Level1(harta); Greenfoot.setWorld(world1); break;}
                case 2: {Level2 world2= new Level2(harta); Greenfoot.setWorld(world2); break;}
                case 3: {Level3 world3= new Level3(harta); Greenfoot.setWorld(world3); break;}
                case 4: {Level4 world4= new Level4(harta); Greenfoot.setWorld(world4); break;}
                case 5: {Level5 world5= new Level5(harta); Greenfoot.setWorld(world5); break;}
                default : break;
                
            }
            
        }
    }
}
