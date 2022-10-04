// Guesser game 
// from Bharath Kumar S 
//Gopalan College of Engineering and Management
// java program on a game with 4 people
import java.util.Scanner;
class GuessingGameApp
{
     public static void main(String[] args) 
        {

             Umpire u= new Umpire();
             u.collectNumFromGuesser();
             u.collectNumFromPlayers();
             u.compare();
        }
        
}


class Umpire
  {
      byte numFromGuesser;
      byte numFromPlayer1;
      byte numFromPlayer2;
      byte numFromPlayer3;
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
class Guesser
  {
    byte gnum;
    byte result;
    byte guessingNum()
      {
          System.out.println("Guesser, please guess a number from 0 to 10\n");
         Scanner scan= new Scanner(System.in);
         gnum=scan.nextByte();
             if(gnum>10)
      {
             System.out.println("Please pick a number below 10.\n");
              guessingNum();
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
        byte pnum;
        byte  x;
        byte predictingNum()
          {
               System.out.println("Player, predict a number a number from 0 to 10");
               Scanner scan= new Scanner(System.in);
               pnum=scan.nextByte();
         if(pnum>=11)
      {
             System.out.println("please pick a number below 10.\n");
             predictingNum();
         }
         else{
         x=pnum;}
         return pnum;
          }
     }
