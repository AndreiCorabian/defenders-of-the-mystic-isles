import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class towers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class towers extends obiecte_cu_viata
{
    int range;
    int damage;
    int level;
    int attack_speed;
    enemies target;
    levels world;
    public void receive_damage(int damaged)
    {
        hp=hp-damaged;
        healthbar.health=this.hp;
        if(hp<=0)
        {
            getWorld().removeObject(this.healthbar);
            getWorld().removeObject(this);
        }
    }
    public double getDistance(Actor actor) 
    {
        return Math.hypot(actor.getX() - getX(), actor.getY() - getY());
    }
 void hitByProjectile() //primeste damage de la proiectilele inamicilor
     {
         List<enemy_projectile> Projectiles=getObjectsInRange(30,enemy_projectile.class);
         for(int i=0;i<Projectiles.size();i++)
         {
             hp=hp-Projectiles.get(i).damage;
             getWorld().removeObject(Projectiles.get(i));
             if(healthbar!=null)
                 healthbar.health=hp;
             
             if(hp<=0)
             {
                i=Projectiles.size();
                getWorld().removeObject(this.healthbar);
                getWorld().removeObject(this);
             }
         }
        }
public enemies getNearestActor(int range) //cauta cel mai apropiat inamic
{
    List<enemies> nearActors = getObjectsInRange(range, enemies.class);
    enemies nearestActor = null;
    double nearestDistance=range+1;
    double distance;
    for (int i = 0; i < nearActors.size(); i++) {
        distance = getDistance(nearActors.get(i));
        if (distance < nearestDistance) {
            nearestActor = nearActors.get(i);
            nearestDistance = distance;
        }
    }
    return nearestActor;
}
void attack(int damage,int tip) // ataca lansand un proiectil
    {
        
        projectile projectile;
        GreenfootSound sound;
        if(tip==1)
            {
                projectile= new sageata();
                sound = new GreenfootSound("sageata.mp3");
                sound.setVolume(40);
                sound.play();
            }
        else
            {
                projectile= new fireball();
                sound = new GreenfootSound("fireball.mp3");
                sound.setVolume(40);
                sound.play();
            }
        projectile.damage=damage;
        getWorld().addObject(projectile,this.getX(),this.getY());
        
        projectile.turnTowards(target.getX(),target.getY());
        if(target.hp<1&&target!=null)
        {
            world.gold=world.gold+target.bounty;
            getWorld().removeObject(target.healthbar);
            getWorld().removeObject(target);
        }
    }
    
void which_enemy(int range, int damage,int attack_speed,int tip) // stabileste care este inamicul pe care turnul il va ataca
    {
        if(getNearestActor(range)!=null)
            {
                target=getNearestActor(range);
                attack(damage,tip);
                sleepFor(attack_speed);
            }
        
    }



    
}
