import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vespa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vespa extends Actor
{
    /**
     * Act - do whatever the Vespa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        {
            if(isAtEdge()){ //se a "Joaninha" atingir o limite da tela.
                turn(120); // gire a "Joaninha" para um valor de 120 graus.
            }

            move(Greenfoot.getRandomNumber(7) * -1); //move para um número aleatório de até 7, multiplicado por -1, para mover para trás.. 

            if(Greenfoot.getRandomNumber(100) < 10){ //Greenfoot irá gerar um número até 100 se caso for menor que 10.
                turn(-20); // irá girar a "Joaninha" para um valor de -20 graus.
            }

            if(Greenfoot.getRandomNumber(100) > 90){ //Greenfoot irá gerar um número até 100 se caso for maior que 90.
                turn(20); // irá girar a "Joaninha" para um valor de 20 graus.
            }

            if(isTouching(Borboleta.class)){ // se a "Joaninha" tocar a "Borboleta" deve seguir ações abaixo. 
                Placar.Pontos--; // diminuir um ponto.
                setLocation(Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(300)); //atribui um novo local, gerado automaticmanete pelo Greenfoot da posição x até 600 e y até 300.
            }
        }   
    }    
}
