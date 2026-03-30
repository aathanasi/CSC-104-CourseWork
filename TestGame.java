import java.util.Scanner;

public class TestGame
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
Playgame1 game;

while (true)
{
System.out.print("Enter P, B or C -- anything else to quit: ");
String choice = input.nextLine();

if (!(choice.equals("P") || choice.equals("B") || choice.equals("C")))
break;

System.out.print("Enter Bet: ");
int bet = input.nextInt();
input.nextLine(); 

if (choice.equals("P"))
game = new Poker(bet);
else if (choice.equals("B"))
game = new Blackjack(bet);
else
game = new Craps(bet);
game.play();
}
input.close();
}
}
