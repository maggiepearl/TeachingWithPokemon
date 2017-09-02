import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AshWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AshWorld extends World
{

    /**
     * Constructor for objects of class AshWorld.
     * 
     */
    
    
    public AshWorld()
    {    
        super(560, 560, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Ash ash = new Ash();
        addObject(ash, 199, 300);
        Pikachu pikachu = new Pikachu();
        addObject(pikachu, 392, 160);
        Pikachu pikachu2 = new Pikachu();
        addObject(pikachu2, 415, 387);
        Pikachu pikachu3 = new Pikachu();
        addObject(pikachu3, 303, 388);
        Pikachu pikachu4 = new Pikachu();
        addObject(pikachu4, 202, 79);
        Pikachu pikachu5 = new Pikachu();
        addObject(pikachu5, 431, 302);
        Pikachu Pikachu6 = new Pikachu();
        addObject(Pikachu6, 237, 443);
        Pikachu Pikachu7 = new Pikachu();
        addObject(Pikachu7, 161, 222);
        Pokeball pokeball = new Pokeball();
        addObject(pokeball, 100, 100);
        Pokeball pokeball2 = new Pokeball();
        addObject(pokeball2, 200, 200);
        Pokeball pokeball3 = new Pokeball();
        addObject(pokeball3, 400, 100);
        Pokeball pokeball4 = new Pokeball();
        addObject(pokeball4, 350, 100);
    }
}
    