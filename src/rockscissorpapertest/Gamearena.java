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
class Gamearena {
  static boolean isGameOver;
  Gamer g1,g2;
  
    void addPlayers(Gamer g1, Gamer g2){
          this.g1=g1;
          this.g2=g2;
       }

    void startGame(){
        while(!isGameOver){
            
            g1.move();
            g2.move();
            processMoves();
        }
        displayScores();
    }

    private void processMoves() {
     if(isGameOver) return;
     if(g1.sign==Handsign.PAPER && g2.sign==Handsign.ROCK){
         g1.winsCounter++;
         System.out.println(g1.name+" Wins!");
     }else if(g1.sign==Handsign.SCISSOR && g2.sign==Handsign.PAPER){
         g1.winsCounter++;
                  System.out.println(g1.name+" Wins!");

     }else if(g1.sign==Handsign.ROCK && g2.sign==Handsign.SCISSOR){
         g1.winsCounter++;
                  System.out.println(g1.name+" Wins!");

     }else if(g1.sign==g2.sign){
         Gamer.draws++;
                  System.out.println(" Draw!");

     }else {
         g2.winsCounter++;
                  System.out.println(g2.name+" Wins!");

     }
     
        System.out.println(g1.name+" "+g1.sign+" | "+g2.name+" "+g2.sign);
     Gamer.trials++;
    }

    private void displayScores() {
        System.out.println("-----------------------------------");
        System.out.println(g1.name+"Wins: "+g1.winsCounter);
        System.out.println(g2.name+"Wins: "+g2.winsCounter);
        System.out.println("Draws: "+Gamer.draws);
        System.out.println("Trials: "+Gamer.trials);
        System.out.println("-----------------------------------");

    }
    
}
