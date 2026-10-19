import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends levels
{
    
    int ct_archers=0;
    int ct_pirates=20;
    int i=30;
    int won;
    harta harta;
    GreenfootSound sound = new GreenfootSound("muzica1.mp3");
    public boolean stage_won()
    {
        if(ct_archers==0&&ct_pirates==0&&getObjects(enemies.class).size()==0)
            return true;
        else
            return false;
    }
    public void afisare_magazin()
    {
        addObject(new turn_din_magazin(),300,540);
        addObject(new mage_din_magazin(),400,540);
    }
    public void enemy_spawner()
    {
        if(i==35)
        {
            i=1;
            int x=50;
            int y=60+Greenfoot.getRandomNumber(380);
            if(ct_pirates>=1)
            {   
                ct_pirates--;
                addObject(new inamic1(),x,y);
            }
            if(ct_archers>=1&&ct_pirates<=10)
            {
                y=60+Greenfoot.getRandomNumber(380);
                ct_archers--;
                addObject(new enemy_archer(),x,y);
            }
        }
        else
            i++;   
    }
    public Level1(harta x)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        harta=x;
        addObject(new menu(),450,540);
        addObject(new gold(),60,540);
        showText("Gold",60,530);
        addObject(new shop(),170,540);
        shop_open=-1;
        gold=120;
        addObject(new buton_start(1),175,255);
        addObject(new baza(),820,240);
        start_joc=0;
        start_muzica=0;
        addObject(new stop_button(),825,530);
        won=0;
        lost=0;
    }
    public void winner()
    {
        addObject(new winner_screen() ,450,250);
        addObject(new back_to_map(harta),450,350);
        sound.stop();
        sound = new GreenfootSound("victory.mp3");
        sound.play();
    }
    public void act()
    {
        if(this.lost==1)
        {
            game_over lume= new game_over(harta);
            sound.stop();
            Greenfoot.setWorld(lume);
        }
        if(start_muzica==1)//porneste muzica?
        {
            start_muzica=0;
            sound.play();
        }
        if(start_joc==1)//porneste jocul (wave-ul de inamici)
        {
            enemy_spawner();
        }
        verifica_mouse();// verifica pozitia locului unde am apasat cu mouse-ul
        showText(""+gold,60,560);
        if(shop_open==1)//verfica daca magazinul este deschis, atunci il va afisa
        {
            afisare_magazin();
            shop_open=0;
        }
        else if(shop_open==-1)// daca este inchis, va sterge casutele de unde putem cumpara turnuri
        {
            List casute = getObjects(turn_din_magazin.class);
            removeObjects(casute);
            casute = getObjects(mage_din_magazin.class);
            removeObjects(casute);
        }
        if(stage_won()==true&&won==0)// verifica daca nivelul este castigat
        {
            harta.enable[2]=1;
            harta.afiseaza=1;
            winner();
            won=1;
        }
    }
    public void verifica_mouse()
    {
        if(Greenfoot.mouseClicked(null))
        {
            int x=Greenfoot.getMouseInfo().getX();
            int y=Greenfoot.getMouseInfo().getY();
            
             if(y<480&&shop_open==0)
            {
                if(gold>=50&&archer==1)
                {
                    gold-=50;
                    Greenfoot.playSound("tower_build.mp3");
                    addObject(new archer(), 30+x/60*60,30+y/60*60);
                    archer=-1;
                }
                else if(gold>=100&&mage==1)
                {
                    gold-=100;
                    Greenfoot.playSound("tower_build.mp3");
                    addObject(new mage_tower(), 30+x/60*60,30+y/60*60);
                    mage=-1;
                }
            }
            if(shop_open==-1)
                archer=-1;
            
            
        }
    }
}
