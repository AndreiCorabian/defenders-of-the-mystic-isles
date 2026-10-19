import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class starting_menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class starting_menu extends World
{

    int start_music=1;
    static int next;
    static int music;
    GreenfootSound sound=new GreenfootSound("Land_ahoy.mp3"); 
    public starting_menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        addObject(new start(),720,350);
        addObject(new clopedia(),720,420);
        next=0;
        music=1;
    }
    public void act()
    {
        if(start_music==1)
            {
                start_music=0;
                sound.play();
            }
        if(music==0)
        {
            sound.stop();
            encyclopedia world= new encyclopedia();
            Greenfoot.setWorld(world);
        }
        if(next==1)
        {
            harta world= new harta();
            sound.stop();
            Greenfoot.setWorld(world);
        }
    }
}
