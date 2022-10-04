   // Guesser game 
// from Bharath Kumar S 
//Gopalan College of Engineering and Management




import java.util.Scanner;
class Guesser
  {
    int gnum;
    int result;
    int guessingNum()
      {
          System.out.println("Guesser, please guess a number from 0 to 10");
         Scanner scan= new Scanner(System.in);
         gnum=scan.nextInt();
             if(gnum>=11)
      {
             System.out.println("The number you have picked is a number which is greater than 10, please pick a number which is below 10. do not violate the rules, this is the last warning.");
         }
         else
         {
             result=gnum;
         }
         return gnum;
      }
}


class Player
    {
        int pnum;
        int x;
        int predictingNum()
          {
               System.out.println("Player, predict a number a number from 0 to 10");
               Scanner scan= new Scanner(System.in);
               pnum=scan.nextInt();
         if(pnum>=11)
      {
             System.out.println("The number you have picked is a number which is greater than 10, please pick a number which is below 10. do not violate the rules, this is the last warning.");
         }
         else{
         x=pnum;}
         return pnum;
          }
     }


class Umpire
  {
       int numFromGuesser;
      int numFromPlayer1;
      int numFromPlayer2;
      int numFromPlayer3;
      void collectNumFromGuesser()
         {
             Guesser g= new Guesser();
             numFromGuesser=g.guessingNum();
          }
      void collectNumFromPlayers()
         {
              Player p1= new Player();
              Player p2= new Player();
              Player p3= new Player();
              numFromPlayer1=p1.predictingNum();
              numFromPlayer2=p2.predictingNum();
              numFromPlayer3=p3.predictingNum();
          }
      void compare()
         {
               if(numFromPlayer1==numFromGuesser)
                     {
                               System.out.println(".........congratulations.................Player 1 you have guessed the write answer and hence won the game");
                     }
               else if(numFromPlayer2==numFromGuesser)
                    {
                              System.out.println(".........congratulations.................Player 2 you have guessed the write answer and hence won the game");
                     }
               else if(numFromPlayer3==numFromGuesser)
                               {System.out.println(".........congratulations.................Player 3 you have guessed the write answer and hence won the game");
                   }
                else
                  {
                           System.out.println(".............congratulations.............The Guesser has won the game, All the players have failed to guess the correct number");
                  }
         }
}
public class GuessingGameApp
{
     public static void main(String[] args) 
        {
             Umpire u= new Umpire();
            u.collectNumFromGuesser();
           u.collectNumFromPlayers();
          u.compare();
        }
}