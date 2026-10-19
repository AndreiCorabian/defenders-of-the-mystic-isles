import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemies extends obiecte_cu_viata
{
    public int damage;
    public int bounty;
    public int attack_speed;
    public int range;
    public boolean alive=true;
    levels world;
    towers target;
    int i=1;
    int merge=1;
    public double getDistance(Actor actor)
    {
    return Math.hypot(actor.getX() - getX(), actor.getY() - getY());
    }
    public void stop()//se opreste si ataca turnul pe care il are la tinta 
    {
        if(i==attack_speed)
        {
            i=1;
            if(target!=null)
                {
                    target.receive_damage(this.damage);
                    Greenfoot.playSound("stab.mp3"); 
                }
        }
        else
            i++;
        
    }
    public boolean pozitie_stop(int distanta)// verifica daca piratii se opresc pentru a ataca turnul din fata lor
    {
        if(target!=null){
            if(getDistance(target)<=target.getImage().getWidth()/2+distanta)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    void ranged_attack()// atac de la distanta
    {
        if(i==attack_speed)
        {
            i=1;
            if(target!=null)
                {
                    enemy_sageata projectile = new enemy_sageata();
                    projectile.damage=this.damage;
                    getWorld().addObject(projectile,this.getX(),this.getY());
                    projectile.turnTowards(target.getX(),target.getY());
                    
                    Greenfoot.playSound("stab.mp3");
                }
        }
        else
            i++;
    }
     void hitByProjectile()// primesc damage de la turnuri
     {
         List<projectile> Projectiles=getObjectsInRange(20,projectile.class);
         for(int i=0;i<Projectiles.size();i++)
         {
             hp=hp-Projectiles.get(i).damage;
             if(healthbar!=null)
                 healthbar.health=hp;
             getWorld().removeObject(Projectiles.get(i));
             if(hp<=0)
             {
                 i=Projectiles.size();
                
                
             }
         }
         
        }
    
public towers getNearestActor() //cauta cel mai apropiat turn
{
    List<towers> nearActors = getObjectsInRange(1000, towers.class);//here you can use the radius you want and maybe another class;
    towers nearestActor = null;
    double nearestDistance=1000;
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

    
}
