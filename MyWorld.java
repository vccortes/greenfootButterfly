import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 350, 1);Borboleta borboleta = new Borboleta(); //criar "Borboleta".
        addObject(borboleta, 35, 175); //adicionar "Borboleta" no mundo. 

        criarVespa(); //chama o método "criarVespa".
        criarVespa(); //chama o método "criarVespa".
        addObject(new Flor(), 503, 328); //criar e adicionar "Flor" no mundo. 
        addObject(new Placar(), 0, 0); //criar e adicionar "Placar" no mundo.

    }

    public void criarVespa(){ //Instruções do método "CriarJoaninha".
        int y = Greenfoot.getRandomNumber(500); // a posição "Y" será aleatório dentro de um número até 500.
        Vespa vespa = new Vespa(); // criar nova "Joaninha".
        vespa.setRotation(380); // "Rotação em 380".
        addObject(vespa, 571, y); // adicionar a "Joaninha" na posição x (571) e y (número inteiro aleatório).

    }
}