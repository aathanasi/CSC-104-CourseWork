import java.util.Scanner;

public class PlayGame 
{
private String player1, player2;
private int turn;
private Game game;
private Scanner input;

public PlayGame() 
{
input = new Scanner(System.in);
        
System.out.print("Enter name of Player 1: ");
player1 = input.nextLine();
System.out.print("Enter name of Player 2: ");
player2 = input.nextLine();
        
turn = 1;

System.out.print("Enter number of piles: ");
int numPiles = input.nextInt();
int[] piles = new int[numPiles];

for (int i = 0; i < numPiles; i++) 
{
System.out.print("Enter number of sticks in pile " + (i + 1) + ": ");
piles[i] = input.nextInt();
}

game = new Game(numPiles, piles);
}

public void play() 
{
while (game.gameOver() == false) 
{
game.printPiles();

String currentPlayer;
if (turn == 1) 
{
currentPlayer = player1;
} else {
currentPlayer = player2;
}

System.out.println(currentPlayer + " has a turn");
            
int pile, numSticks;
do {
System.out.print("Enter pile number to take from: ");
pile = input.nextInt() - 1;
System.out.print("Enter number of sticks to remove: ");
numSticks = input.nextInt();
} while (game.remove(pile, numSticks) == false);


if (turn == 1) 
{
turn = 2;
} else {
turn = 1;
}
}

String winner;
if (turn == 1) 
{
winner = player2;
} else {
winner = player1;
}
System.out.println("Game is over. " + winner + " wins");


System.out.print("Enter yes to play another game or no to end the game: ");
String response = input.next();
if (response.equals("yes")) {
new PlayGame().play();
} else {
System.out.println("Thank you for playing");
}
}

public static void main(String[] args) 
{
PlayGame game = new PlayGame();
game.play();
}
}
