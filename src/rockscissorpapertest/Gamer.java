/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockscissorpapertest;

import java.util.Scanner;

enum Handsign {ROCK,SCISSOR,PAPER }
class Gamer {
  String name;
  Handsign sign;
  int winsCounter;
  static int draws;
  static int trials;
    public Gamer(String name){
        this.name = name;
    }

    void move(){
      if(Gamearena.isGameOver) return;
      boolean invalidInput=false;
      Scanner input= new Scanner(System.in);
      do{
           invalidInput=false;
          char playerChoice= input.next().toLowerCase().charAt(0);
            switch(playerChoice){
                case 'r':
                    this.sign = Handsign.ROCK;
                    break;
                case 's':
                    this.sign= Handsign.SCISSOR;
                    break;
                case 'p':
                    this.sign=Handsign.PAPER;
                    break;
                case 'q':
                    Gamearena.isGameOver=true;
                    break;
                default:
                    invalidInput=true;
                    break;
            }   
      }
      while(invalidInput);
      
      System.out.println(this.name+" 's"+ sign);
   }
}