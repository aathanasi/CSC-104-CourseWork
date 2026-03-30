import java.util.Random;

public class SlotMachine 
{
private int cash;
private int bet;
private final Random rand;

public SlotMachine() 
{
this.cash = 0;
this.bet = 0;
this.rand = new Random();
}

public void insertCoins(int amount) 
{
if (amount > 0) 
{
cash += amount;
System.out.println("$" + amount + " inserted. Cash in machine is $" + cash);
} else {
System.out.println("Invalid coin amount.");
}
}

public void pushBetOne() 
{
if (cash > 0 && bet < 3) 
{
bet++;
cash--;
System.out.println("Bet is now $" + bet);
} else if (cash <= 0) 
{
System.out.println("Not enough cash.");
} else {
System.out.println("Maximum bet.");
}
}

public void pushBetMax() 
{
if (cash >= (3 - bet)) 
{
cash -= (3 - bet);
bet = 3;
System.out.println("Bet is now $3");
} else {
System.out.println("Not enough cash to bet max.");
}
}

public void pushSpin() 
{
if (bet == 0) 
{
System.out.println("Must make a bet before spinning.");
return;
}

String[] symbols = {"777", "7", "$$$", "$$", "$", "@"};
String[] result = new String[3];

for (int i = 0; i < 3; i++) 
{
int num = rand.nextInt(18);
if (num == 0) result[i] = "777";
else if (num <= 2) result[i] = "7";
else if (num <= 5) result[i] = "$$$";
else if (num <= 9) result[i] = "$$";
else if (num <= 14) result[i] = "$";
else result[i] = "@";
}

System.out.println("S L O T  M A C H I N E");
System.out.println(result[0] + " " + result[1] + " " + result[2]);
int payout = calculatePayout(result);
cash += payout;
System.out.println("BET: " + bet);
System.out.println("PAYOUT: " + payout);
System.out.println("CASH REMAINING IN MACHINE: " + cash);
bet = 0;
}

private int calculatePayout(String[] result) 
{
if (result[0].equals("777") && result[1].equals("777") && result[2].equals("777")) return bet * 200;
if (result[0].equals("7") && result[1].equals("7") && result[2].equals("7")) return bet * 50;
if (result[0].equals("$$$") && result[1].equals("$$$") && result[2].equals("$$$")) return bet * 30;
if (result[0].equals("$$") && result[1].equals("$$") && result[2].equals("$$")) return bet * 20;
if (result[0].equals("$") && result[1].equals("$") && result[2].equals("$")) return bet * 15;
if (result[0].equals("@") && result[1].equals("@") && result[2].equals("@")) return bet * 10;
if ((result[0].equals("@") && result[1].equals("@")) || (result[1].equals("@") && result[2].equals("@")) || (result[0].equals("@") && result[2].equals("@"))) return bet * 5;
if (result[0].equals("@") || result[1].equals("@") || result[2].equals("@")) return bet * 2;
return 0;
}

public void pushCoinsOut() 
{
System.out.println("Returning $" + cash);
cash = 0;
}
}
