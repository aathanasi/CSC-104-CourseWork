import java.util.Scanner;
import java.util.Random;

public class Rodentia {
public static int nuts = 10;

public static void main(String[] args){
Scanner kb = new Scanner(System.in);

System.out.printf("Rondentia Crow Alliance for Nutty Squirrels");

while (true){
System.out.printf("Welcome squirrel! You have %d nuts. How many would you like to throw up in the air (0 to quit)%n", nuts);
int bet = getBet();
if (bet == 0){
break;
}

if (bet > nuts){
System.out.println("You don't have enough nuts to make that bet");
continue;
}

int die1 = rollDie();
int die2 = rollDie();
int die3 = rollDie();

System.out.printf("Rolling dice D1: %s D2: %s D3: %s%n", dieFaceToString(die1), dieFaceToString(die2), dieFaceToString(die3));

int payout = computerNutPayout(die1, die2, die3, bet);
if (payout > 0){
nuts += payout;
System.out.printf("Congradulations! You won %d nuts %n", payout);
}else{
nuts -= bet;
System.out.println("Sorry squirrel! You lost!");
}
}
System.out.printf("Bye Squirrel! You started with 10 nuts and ended with %d nuts. Caw Caw", nuts);
}

public static int rollDie() {
Random rng = new Random();
return rng.nextInt(6) + 1;
}

public static int getBet() {
Scanner kb = new Scanner(System.in);
int bet;
while(true) {
bet = kb.nextInt();
if (bet >= 0) {
break;
}
System.out.println("Please enter a valid bet (0 or more):");
}
return bet;
}

public static int computerNutPayout(int die1, int die2, int die3, int bet) {
if (die1 == 1){
if (die2 == 1 && die3 == 1) return bet * 8; 
if (die2 == 1 || die3 == 1) return bet * 4;
return bet * 2;

} else if (die1 == 2){
if (die2 == 2 && die3 == 2) return bet * 4;
return 0;

} else if (die1 == 3) {
if (die2 == 3 && die3 == 3) return bet * 16;
return 0;

} else if (die1 == 4) {
if (die2 == 4 && die3 == 4) return bet * 32;
return 0;

} else if (die1 == 5) {
if (die2 == 5 && die3 == 5) return bet * 64;
return 0;

} else if (die1 == 6) {
if (die2 == 6 && die3 == 6) return bet * 128;
return 0;
}

return 0;
}

public static String dieFaceToString(int face) {
switch (face) {
   case 1: return "Mercury";
   case 2: return "Venus";
   case 3: return "Earth";
   case 4: return "Mars";
   case 5: return "Jupiter";
   case 6: return "Sun";
   default: return "Unkown";
}
}
}