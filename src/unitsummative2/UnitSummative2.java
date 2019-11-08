/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unitsummative2;

import java.util.Scanner;

/**
 *
 * @author jogra6669
 */
public class UnitSummative2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int size = 2;
        int computerWins = 0;
        int userWins = 0;
        int [] userChoice = new int [size];
        for (int i = 0; i <= size; i++)
        {
         System.out.println("Rock, Paper, Scissors Game!");
         System.out.println("----------------------------");
         System.out.println("Welcome to the rock, paper, scissors game!");  
         System.out.println("The rules are simple. Pick one of the three options and try to win against a computer.");  
         System.out.println("Best two out of three, get ready!");  
         System.out.println("Enter choice: Rock = 1, Paper = 2, Scissors = 3");
         userChoice[size] = keyedInput.nextInt();
         int computerInput = (int) (Math.random() * 3) + 1;
         int userInput = keyedInput.nextInt();
         if(computerInput == userInput)
          {
            System.out.println("Tie!");
          } else if (userInput == rock){
                if(computerInput == 2){
                System.out.println("Computer picked paper, you lose!");
                computerWins = computerWins + 1;
                }
                } else if (computerInput == 3){
                System.out.println("Computer picked scissors, you win!");
                userWins = userWins + 1;
          } else if (userInput == paper){
                if(computerInput == 1){
                System.out.println("Computer picked rock, you win!");
                userWins = userWins + 1;
                }
                } else if (computerInput == 3){
                System.out.println("Computer picked scissors, you lose!");
                computerWins = computerWins + 1;
          } else if (userInput == scissors){
                if(computerInput == 1) {
                System.out.println("Computer picked rock, you lose!");
                computerWins = computerWins + 1;
                }
                } else if (computerInput == 2){
                System.out.println("Computer picked paper, you win!");
                userWins = userWins + 1;
        }
      }
      //System.out.println("Here are the results of your vigorous work:");
      //System.out.println("In the first round you picked" + ???? "while the computer picked" + ?????);
      
    }
    
}
