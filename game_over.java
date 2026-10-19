import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game_over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game_over extends World
{

    /**
     * Constructor for objects of class game_over.
     * 
     */
    public game_over(harta x)
    {    
        super(900, 600, 1); 
        addObject(new back_to_map(x),750,300);
        GreenfootSound sound = new GreenfootSound("defeat.mp3");
        sound.play();
    }
}
