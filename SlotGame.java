import java.util.Scanner;

public class SlotGame 
{
private final Player player;
private final Scanner scanner;

public SlotGame()
{
this.player = new Player();
this.scanner = new Scanner(System.in);
}

public void play() 
{
while (true) 
{
System.out.println("Choose one of the following");
System.out.println("1: Push BetOne");
System.out.println("2: Push BetMax");
System.out.println("3: Push Spin");
System.out.println("4: Insert Coins");
System.out.println("5: Push CoinOut");
System.out.println("6: Exit");
System.out.print("? ");

int choice = scanner.nextInt();
switch (choice)
{
case 1 : 
player.pushBetOne();
break;

case 2 : 
player.pushBetMax();
break;

case 3 : 
player.pushSpin();
break;

case 4 : 
{
System.out.print("How many coins? ");
int amount = scanner.nextInt();
player.insertCoins(amount);
}
break;

case 5 : 
player.pushCoinsOut();
break;

case 6 : 
{
System.out.println("Thanks for playing!");
return;
}
default : System.out.println("Please Pick One of the Options.");
}
}
}
}
