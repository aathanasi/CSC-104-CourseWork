import java.util.Scanner;

public class Planets
{

static double[] gravity = {0.39, 0.91, 1.00, 0.38, 2.87, 1.32, 0.93, 1.23, 0.03};
static String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};



public static void displayMenu() {
System.out.println("Welcome to the Planet Calculator!");
System.out.println("Enter 1 to find your weight on a given planet.");
System.out.println("Enter 2 to see your weight on all planets.");
System.out.println("Enter 3 to display all planets and gravity factors.");
System.out.println("Enter 4 to show this menu at any time.");
System.out.println("Enter any other number to exit.");
}


public static void main(String[] args) {
Scanner kb = new Scanner(System.in);
int choice;

displayMenu();

while (true) {
System.out.print("Choice: ");
choice = kb.nextInt();

switch (choice) {
case 1:
showWeight(kb);
break;

case 2:
showAll(kb);
break;

case 3:
showPlanetsandGravity();
break;

case 4:
displayMenu();
break;

default:
System.out.println("Have a nice day!");
kb.close();
return;
}
}
}


public static void showWeight(Scanner kb) {
System.out.println("Enter your weight on Earth, in pounds: ");
double earthWeight = kb.nextDouble();
System.out.println("Enter the code of the planet you want: ");
int code = kb.nextInt();

if (code >= 0 && code < planets.length) {
double planetWeight = earthWeight * gravity[code];
System.out.println("Your weight on " + planets[code] + " is " + planetWeight + " pounds.");
} else {
System.out.println("Double check panet code.");
}
}


public static void showAll(Scanner kb) {
System.out.println("Enter your weight on Earth, in pounds:");
double earthWeight = kb.nextDouble();

for (int i = 0; i < planets.length; i++) {
double planetWeight = earthWeight * gravity[i];
System.out.println("Your weight on different planets " + planets[i] + ": " + planetWeight + " pounds");
}
}


public static void showPlanetsandGravity() {
for (int i = 0; i < planets.length; i++) {
System.out.println("The planets and gravity factors are:" + i + " (" + planets[i] + ") " + gravity[i]);
}
}
}