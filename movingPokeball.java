import greenfoot.*;

/**
 * Write a description of class movingPokeball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class movingPokeball extends Actor
{
    /**
     * Act - do whatever the movingPokeball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(1); 
       eat();// Add your action code here.
    }    
    public void eat()
    {
         Actor pikachu;
        pikachu = getOneObjectAtOffset(0,0,Pikachu.class);
        if(pikachu != null )
        {
            World world;
            world = getWorld();
            world.removeObject(pikachu);
            getWorld().addObject(new Squirtle(), getX(), getY() + 50);
            
            
        }
        
         Actor squirtle;
        squirtle = getOneObjectAtOffset(0,0,Squirtle.class);
        if(squirtle != null )
        {
            World world;
            world = getWorld();
            world.removeObject(squirtle);
            getWorld().addObject(new Eevee(), getX(), getY() + 50);
           
            
        }
        
         Actor eevee;
        eevee = getOneObjectAtOffset(0,0,Eevee.class);
        if(eevee != null )
        {
            World world;
            world = getWorld();
            world.removeObject(eevee);
            getWorld().addObject(new Dratini(), getX(), getY() + 50);
 
            
        }
        
         Actor dratini;
        dratini = getOneObjectAtOffset(0,0,Dratini.class);
        if(dratini != null )
        {
            World world;
            world = getWorld();
            world.removeObject(dratini);
            
          
            
        }
    }
}
