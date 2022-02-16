/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockscissorpapertest;

/**
 *
 * @author USER
 */
public class RockScissorPaperTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Play!");
       Gamer g1= new Gamer("Player 1");
       Gamer g2= new Gamer("Player 2");
       Gamearena arena= new Gamearena();
       arena.addPlayers(g1,g2);
       arena.startGame();
    }
    
}
