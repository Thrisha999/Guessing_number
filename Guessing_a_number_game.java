//guessing number
import java.util.*;
class GuessNumber
{
  void play()
  {
    int a,g,at=0;
    System.out.println("Welcome to **NUMBER GUESSING GAME**");
    System.out.println("Here you have to choose a number between 1 to 100");
    System.out.println("If your guess and computer guess coincide yo will win otherwise you will loose");
    System.out.println("You will have 5 attempts to play this game");
    Random ra = new Random();
    a = ra.nextInt(100)+1;
    System.out.println("Enter your guess :");
    Scanner sc = new Scanner(System.in);
    do
    {
      g = sc.nextInt();
      if(g==a)
      {
        System.out.println("WOHOOOO! YOU WON THE GAME,CONGRATULATIONS!!!!!");
        break;
      }
      else if(g>a)
      {
        System.out.println("Your guess is little high!!!\n Try some Lower numbers");
      }
      else if (g<a)
      {
        System.out.println("Your guess is little low!!!\n Try some higher numbers");
      }
      at++;
      if (at==5)
      {
       System.out.println("YOU HAVE EXCEEDED YOUR MAXIMUM LIMITS TO GUESS THE NUMBER");
       System.out.println("Computer's guess is "+a);
       break;
     }
      else
      {
        System.out.println("Enter your another guess :");
      }
    } while (g!=a);
  }
}
public class Guessing_a_number_game

{
  public static void main(String[] args)
  {
    int ans,guess,attempt=0;
    System.out.println("Welcome to **NUMBER GUESSING GAME**");
    System.out.println("Here you have to choose a number between 1 to 100");
    System.out.println("If your guess and computer guess coincide yo will win otherwise you will loose");
    System.out.println("You will have 5 attempts to play this game");
    Random r = new Random();
    ans = r.nextInt(100)+1;
    System.out.println("Enter your guess :");
    Scanner in = new Scanner(System.in);
    do
    {
      guess = in.nextInt();
      if(guess==ans)
      {
        System.out.println("WOHOOOO! YOU WON THE GAME,CONGRATULATIONS!!!!!");
        break;
      }
      else if(guess>ans)
      {
        System.out.println("Your guess is little high!!!\n Try some Lower numbers");
      }
      else if (guess<ans)
      {
        System.out.println("Your guess is little low!!!\n Try some higher numbers");
      }
      attempt++;
      if (attempt==5)
      {
       System.out.println("YOU HAVE EXCEEDED YOUR MAXIMUM LIMITS TO GUESS THE NUMBER");
       System.out.println("Computer's guess is "+ans);
       break;
     }
      else
      {
        System.out.println("Enter your another guess :");
      }
    } while (guess!=ans);
    System.out.println("Do you want to play again ?");
    System.out.println("Enter your option : yes or no");
    String choice;
    choice = in.next();
    GuessNumber g = new GuessNumber();
    switch (choice)
    {
        case "yes" : g.play();
        break;
        case "no" : System.out.println("Thankyou for playing this game !!!!");
    }
  }
}
