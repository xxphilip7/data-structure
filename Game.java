import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    public static void main(String [] args)
    {
        int userScore=0;
        int computerScore=0;
        int roundNumber=1;

        System.out.println("R for Roker, S for scissor, P for papper");
        System.out.println("please enter one character:");
        
       while(roundNumber<=7 )
      {
        System.out.println("Round "+roundNumber);
        Scanner keyboard= new Scanner(System.in);
        String userCharacter=keyboard.next();
        char i =userCharacter.charAt(0);
        char j=computerRandom();
        
        if(userScore==3)
        {
            j=computerCheating(i);
        }
        
        if(i=='S')
        {
            if(j=='R')
            {
                System.out.println("You Lose, Computer Win");
                computerScore+=1;
                roundNumber+=1;
                System.out.println("Computer Score: "+computerScore);
                System.out.println("User Score: "+userScore);
            }
            
            else if(j=='P')
            {
                System.out.println("You Win,Computer Lose");
                userScore+=1;
                roundNumber+=1;
                System.out.println("Computer Score: "+computerScore);
                System.out.println("User Score: "+userScore);
            }
            else 
            System.out.println("Tie, Don't count");
        }
        
        if (i=='P')
        {
            if(j=='R')
            {
                System.out.println("You Win, Computer Lose");
                userScore+=1;
                roundNumber+=1;
                System.out.println("Computer Score: "+computerScore);
                System.out.println("User Score: "+userScore);
            }
            
            else if(j=='S')
            {
                System.out.println("You Lose,Computer Win ");
                computerScore+=1;
                roundNumber+=1;
                System.out.println("Computer Score: "+computerScore);
                System.out.println("User Score: "+userScore);
            }
            else 
            System.out.println("Tie, Don't count");
        }
        
        if (i=='R')
        {
            if(j=='P')
            {
                System.out.println("You Lose, Computer Win");
                computerScore+=1;
                roundNumber+=1;
                System.out.println("Computer Score: "+computerScore);
                System.out.println("User Score: "+userScore);
            }
            
            else if(j=='S')
            {
                System.out.println("You Win,Computer Lose ");
                userScore+=1;
                roundNumber+=1;
                System.out.println("Computer Score: "+computerScore);
                System.out.println("User Score: "+userScore);
            }
            else 
            System.out.println("Tie, Don't count");
        }
        
         if(computerScore==4)
        {
            break;
        }
    }
    System.out.println("Game over, you lose");
  
    }
    
    private static char computerRandom()
    {
        Random computerRandom=new Random();
        int r=computerRandom.nextInt(3);
        char i='o';
        if (r==1)
        i='R';
        if (r==2)
        i='S';
        if(r==0)
        i='P';
        return i;
    }
    
    private static char computerCheating (char i)
    {
        
        if(i=='S')
        return 'R';
        if(i=='R')
        return 'P';
        if(i=='P');
        return 'S';
       
    }
}
