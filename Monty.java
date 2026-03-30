import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Monty
{
public static void main(String[]args)
{
Scanner kb = new Scanner (System.in);
boolean playAgain = true;

do {
int[] board = {1,0,0};
System.out.println("Hello, I am Monty Hall and welcome to Let's Make a Deal.Here is our first contestant.");
System.out.println("Welcome to the show. Now, in front of you are three doors. Behind two of these doors is a goat but behind the third door is a shiny new Jaguar. You may choose one of the doors. Which will it be : 1, 2, or 3?");

shuffle(board);
System.out.println("The doors are: 1, 2, 3");


int choice = kb.nextInt() - 1;

int goatChoice = goat(board, choice);
System.out.println("That's right. Goat is behind door " + (goatChoice + 1));

System.out.println("Would you like to switch? Y/N");
String switchChoice = kb.next();

int finalChoice = (switchChoice.equals("Y")) ? switchDoor(choice, goatChoice) : choice;


if (board[finalChoice] == 1) {
System.out.println("Congratulations you won the Car!");
} else {
System.out.println("Sorry, you got the goat.");
}


System.out.println("Do you want to play again? Y/N");
String playAgainChoice = kb.next();

if (playAgainChoice.equals("N")) {
playAgain = false; 
} else if (playAgainChoice.equals("Y")) {
playAgain = true;
} 
} while (playAgain);
System.out.println("Thank you for playing!");
}



public static void shuffle(int[]arrayPassed)
{
Random rng = new Random();
int temp, r1, r2;
for(int i = 0; i < arrayPassed.length; ++i)
{
r1 = rng.nextInt(arrayPassed.length);
r2 = rng.nextInt(arrayPassed.length);
temp = arrayPassed[r1];
arrayPassed[r1] = arrayPassed[r2];
arrayPassed[r2] = temp;
}
}

public static int goat(int[]board, int choice){
Random rng = new Random();
int goatChoice;
do {
goatChoice = rng.nextInt(board.length);
} while (goatChoice == choice || board[goatChoice] == 1);
return goatChoice;
}

public static int switchDoor(int choice, int goatChoice) {
for(int i = 0; i < 3; i++) {
if (i != choice && i != goatChoice) {
return i;
}
}

return choice;
}
}