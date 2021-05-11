import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Borboleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Borboleta extends Actor
{
    /**
     * Act - do whatever the Borboleta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3); 
        if(Greenfoot.isKeyDown("left")){ // mover para esquerda quando clicar na tecla a esquerda.
            turn(-10); // girar a -10 graus.
            
        }else if(Greenfoot.isKeyDown("right")){ // mover para direita quando clicar na tecla direita.
            turn(10); // girar a 10 graus.
            
        }
        if(isTouching(Flor.class)){ //se a "Borboleta" tocar realizar as seguintes ações.
            Placar.Pontos++; // somar um ponto.
            removeTouching(Flor.class); // remover o "Nectar".
            getWorld().addObject(new Flor(), Greenfoot.getRandomNumber(getWorld().getWidth()), getWorld().getHeight()); // criar outra "Nectar" em um lugar aleatório da tela.
        }
    }
}    

