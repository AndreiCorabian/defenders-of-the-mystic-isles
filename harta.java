import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class harta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class harta extends World
{

    static int[] enable = {0,1,0,0,0,0};
    int[] val_x ={0,435,517,355,103,210};
    int[] val_y ={0,440,216,100,144,360};
    int afiseaza;
    void afiseaza()
    {
        for(int i=1;i<=5;i++)
        {
            if(enable[i]==1)
            {
                addObject(new nivel(i,this),val_x[i],val_y[i]);
            }
        }
        
        
    }
    public harta()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        afiseaza=1;
    }
    public void act()
    {
        if(afiseaza==1)
        {
            afiseaza=0;
            afiseaza();
        }
    }
}
