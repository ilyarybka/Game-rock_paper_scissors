/*Iliya Klishin
 *Dr. Steinberg
 *COP 3330 Spring 2022
 *Programming Assignment 1
 */
 
 import java.util.Scanner;
 import java.util.Random;
 
 
 public class RockPaperScissor {
 
     Scanner input2;
     private int game2 = 1;
     private int userwins = 0;
     private int computerwins = 0;
     private int seed1;
     private int userchoice;
     private Random rand;
 
   public RockPaperScissor(int game, int seed, Scanner input) {
   
     input2 = input;
     game2 = game;
     seed1 = seed;
     rand = new Random(seed);
   }
 
   public static void greeting()
   {
     System.out.println("Welcome to the Rock...Paper...Scissor Game!");
     System.out.println("Let me tell you the rules to this game.");
     System.out.println("You and I will get to choose rock, paper, or scissor.");
     System.out.println("After we made a decision, we will then reveal the choices we both made and decide a winner based on these rules.");
     System.out.println("Rock beats Scissor!");
     System.out.println("Paper beats Rock!");
     System.out.println("Scissor beats Paper!");
     System.out.println("If we both pick the same option, then it is a tie.");
     System.out.println("Ready to play? Here we go! I've been told by users that I'm really good!");
   }
   
   public int userChoice()
   {
   
     System.out.println("It is your turn to choose.");
     do
     {
       System.out.println("1: Rock");
       System.out.println("2: Paper");
       System.out.println("3: Scissor");
       System.out.print("Enter your choice: ");
   
       userchoice = input2.nextInt();
   

     if(userchoice == 1)
         {
         System.out.println("You have selected rock.");
         break;
         }
     
     else if(userchoice == 2)
         {
         System.out.println("You have selected paper.");
         break;
         }
     
     else if(userchoice == 3)
         {
         System.out.println("You have selected scissor.");
         break;
         }
       
     else
       System.out.println("That is an invalid choice. Please try again.");
       
       }
       
       while(userchoice < 1 || userchoice > 3);
     
       return userchoice;
   }
   
   public int computerChoice()
   {
     //rand = new Random(seed1);
     //rand.setSeed(seed1);
     int compchoice = rand.nextInt(3) + 1;
   
     return compchoice;
   }
   
   public int choiceBattle(int p1, int p2)
   {
     
     //if (p1 == p2)
     //{
       if(p1 == 1 && p2 == 1)
         {
         System.out.println("Tie!");
         return 0;
         }
       
       else if(p1 == 2 && p2 == 2)
         {
         System.out.println("Tie!");
         return 0;
         }
       
       else if(p1 == 3 && p2 == 3)
         {
         System.out.println("Tie!");
         return 0;
         }
       
       
       //return 0;
     //}
     
     else if(p1 == 1 && p2 == 2)
       {
       System.out.println("You used Rock and I used Paper!");
       System.out.println("Paper beats Rock!");
       return 2;
       }
     
     else if(p1 == 1 && p2 == 3) 
       {
       System.out.println("You used Rock and I used Scissor!");
       System.out.println("Rock beats Scissor!");
       return 1;
       
       }
       
     else if(p1 == 2 && p2 == 3)
       {
       System.out.println("You used Paper and I used Scissor!");
       System.out.println("Scissor beats Paper!");
       return 2;
       
       }
       
     else if (p1 == 2 && p2 == 1){
       System.out.println("You used Paper and I used Rock!");
       System.out.println("Paper beats Rock!");
       
       return 1;
       
       }
       
     else if (p1 == 3 && p2 == 1)
       {
     
     System.out.println("You used Scissor and I used Rock!");
     System.out.println("Rock beats Scissor!");
     
       return 2;
       
       }
       
     else if(p1 == 3 && p2 == 2)
       {
         System.out.println("You used Scissor and I used Paper!");
         System.out.println("Scissor beats Paper!");
       return 1;
       
       }
   
     return 0;
   
   }
   
   
   
   
   public int getWinner()
   {
   
   if(userwins > computerwins)
     {
     //userwins = 0;
     //computerwins = 0;
     return 1;
     }
     
   else if(computerwins > userwins)
     {
     //userwins = 0;
     //computerwins = 0;
     
     return 2;
     }
   
     else
       return 0;
   }
   
   
   public void playRound()
   {
   
     int userCh;
     int computerCh;
     int choiceB;
   
     while((userwins != 3) && (computerwins != 3))
     {
     
     System.out.printf("Game %d Tally%n", game2);
     System.out.printf("Player 1: %5d%n", userwins);
     System.out.printf("Player 2: %5d%n", computerwins);
      
        userCh = userChoice();
        computerCh = computerChoice();
        choiceB = choiceBattle(userCh, computerCh);
      
      if(choiceB == 1){
        userwins++;
        System.out.println("Player 1 gets a point.");
        }
        
      else if(choiceB == 2){
        System.out.println("Player 2 gets a point.");
        computerwins++;
        
        }
        
      else if(choiceB == 0){
      
        System.out.println("A Tie Occur.");
        continue;
        }
        
     }
     
     //System.out.printf("userwins : %d%n", userwins);
     //System.out.printf("computerwins : %d%n", computerwins);
     
     getWinner();
     //System.out.printf("Winner: %d%n", winner);
   
   
   }
   
   
   
 
 
 
 }