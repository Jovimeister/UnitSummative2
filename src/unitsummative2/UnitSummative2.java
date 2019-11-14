/*
 * Jovan Gradojevic
 * 12/11/2019
 * Game that allows user to play rock, paper, scissors against a computer then outputs statistics.
 */

package unitsummative2;

import java.util.Scanner;
/**
 *
 * @author jogra6669
 */
public class UnitSummative2 {
    static int computerWins = 0;
    static int userWins = 0;
    static int [] userChoice = new int [3];
    static int computerInput = computerRandom();
    
    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        //Variable declaration area
        Scanner keyedInput = new Scanner(System.in);
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        
        //Loops three times. User plays rock, paper, scissors three times
        for (int i = 0; i <= 2; i++)
        {
        System.out.println("Rock, Paper, Scissors Game!");
        System.out.println("----------------------------");
        System.out.println("Welcome to the rock, paper, scissors game!");  
        System.out.println("The rules are simple. Pick one of the three options and try to win against a computer.");  
        System.out.println("Best two out of three, get ready!");  
        System.out.println("Enter choice: Rock = 1, Paper = 2, Scissors = 3");
        userChoice[i] = keyedInput.nextInt();
         //Randomizes computer input
         int computerInput = computerRandom();
         //Checks if the computer chose the same thing as the user
         if(computerInput == userChoice[i])
          {
            System.out.println("Tie!");
          }
         //Check if the user input rock then checks what the computer chose
         else if (userChoice[i] == rock){
            if(computerInput == 2){
                System.out.println("Computer picked paper, you lose!");
                computerWins = computerWins + 1;
                    } else if (computerInput == 3){
                    System.out.println("Computer picked scissors, you win!");
                    userWins = userWins + 1;
                } 
            } 
         //Check if the user input paper then checks what the computer chose
         else if (userChoice[i] == paper){
                if(computerInput == 1){
                System.out.println("Computer picked rock, you win!");
                userWins = userWins + 1;
                    } else if (computerInput == 3){
                    System.out.println("Computer picked scissors, you lose!");
                    computerWins = computerWins + 1;
                    }
            } 
         //Check if the user unput scissors then checks what the computer chose
         else if (userChoice[i] == scissors){
                if(computerInput == 1) {
                System.out.println("Computer picked rock, you lose!");
                computerWins = computerWins + 1;
                    } else if (computerInput == 2){
                    System.out.println("Computer picked paper, you win!");
                    userWins = userWins + 1;
                    }
                }
        }
        //Results
        resultsView();
        firstResponse();
        secondResponse();
        thirdResponse();
      }  
    /**
     * Returns a random number that will be used as the computers 
     * @return 
     */
    public static int computerRandom(){
    int computerInput1 = (int) (Math.random() * 3) + 1;
    return computerInput1;
    }
    
    /**
     * Displays results based on wins and loses of boh the computer and the person
     */
    public static void resultsView(){
    if(userWins < computerWins){
        System.out.println("Overall, the computer won more times.");    
        } else if(userWins > computerWins){
        System.out.println("Overall, you won more times.");    
        } else if(userWins == computerWins){
        System.out.println("Overall, it was a tie.");     
        }
    }
    
    /**
     * Allows user to view what they input during the first round using an array
     */
    public static void firstResponse(){
    if(userChoice[0] == 1){
        System.out.println("You picked rock first");
        } else if (userChoice[0] == 2){
        System.out.println("You picked paper first");
        } else if (userChoice[0] == 3){
        System.out.println("You picked scissors first");
        }  
    }
    
     /**
     * Allows user to view what they input during the second round using an array
     */
    public static void secondResponse(){
    if(userChoice[1] == 1){
        System.out.println("You picked rock second");
        } else if (userChoice[1] == 2){
        System.out.println("You picked paper second");
        } else if (userChoice[1] == 3){
        System.out.println("You picked scissors second");
        } 
    }
    
     /**
     * Allows user to view what they input during the third round using an array
     */
    public static void thirdResponse(){
    if(userChoice[2] == 1){
        System.out.println("You picked rock third");
        } else if (userChoice[2] == 2){
        System.out.println("You picked paper third");
        } else if (userChoice[2] == 3){
        System.out.println("You picked scissors third");
        }
    }
    
  }
        

