import java.util.Scanner;

public class SquareRoot
{
public static void main(String[] args) throws Exception
{

Scanner kb = new Scanner(System.in);

System.out.println("For what number would you like the square root?");
double N = kb.nextInt();

if (N < 0) {
System.out.println("Please enter a positive number");
return; 
}

System.out.println("Enter your first guess:");
double oldguess = kb.nextInt();

double newguess;

System.out.println("The approximations are");

while (true){

newguess = (oldguess + N / oldguess) / 2;

System.out.println(newguess);

if (Math.abs(newguess - oldguess) < 0.0001){
break;
}

oldguess = newguess;

}
}
}