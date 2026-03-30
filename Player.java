public class Player 
{
private final SlotMachine machine;
private int bankroll;

public Player() 
{
this.machine = new SlotMachine();
this.bankroll = 100;
}

public void pushBetOne() 
{
machine.pushBetOne();
}

public void pushBetMax() 
{
machine.pushBetMax();
}

public void pushCoinsOut() 
{
machine.pushCoinsOut();
}

public void pushSpin() 
{
machine.pushSpin();
}

public void insertCoins(int amount) 
{
if (bankroll >= amount) 
{
machine.insertCoins(amount);
bankroll -= amount;
} else {
System.out.println("Not enough money in your wallet.");
}
}
}
