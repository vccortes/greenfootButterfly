import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Placar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Placar extends Actor
{
    public static int Pontos; { // variável estático com o nome "Pontos" e recebe o valor de 2.
        Pontos = 2;
    }
    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().showText("Pontuação: " + Pontos, 60, 10); //exibir texto mais os pontos já somados ,a posição x (60) e y (10).
        if(Pontos ==0){ // se os Pontos for igual a 0. 
            getWorld().showText("Game Over", getWorld().getWidth()/2, getWorld().getHeight()/2); // exebir texto "Game Over".
            Greenfoot.stop(); // parar o jogo.
        }
        else if(Pontos == 10){
            getWorld().showText("Ganhou!", getWorld().getWidth()/2, getWorld().getHeight()/2); // exibir o texto "Ganhou!".
            Greenfoot.stop(); // parar o jogo.

        }
    }    
}