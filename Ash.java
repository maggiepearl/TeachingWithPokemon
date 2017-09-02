import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ash extends Actor
{
    private int counter;
    private int shotTimer;
    /**
     * Act - do whatever the Ash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       moveAndTurn();
       eat();
       shoot();
    }
    public void moveAndTurn()
    {
         move(4);
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    public void eat()
    {
      
        
         Actor pokeball;
        pokeball = getOneObjectAtOffset(0,0,Pokeball.class);
        if(pokeball != null)
        {
            World world;
            world = getWorld();
            world.removeObject(pokeball);
            counter++;
            
           
        }
    }
       
    public void shoot()
    {
        if(shotTimer > 0)
        {
            shotTimer = shotTimer - 1;
        }
        else if(Greenfoot.isKeyDown("space") && counter > 0)
        {
          
             getWorld().addObject(new movingPokeball(), getX(), getY());
             counter--;
             shotTimer = 200;
           
            
            
        }
}
}
