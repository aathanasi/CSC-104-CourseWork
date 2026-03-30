import java.util.Scanner;

public class Stocks
{
public static void main(String[] arg) throws Exception
{
Scanner kb = new Scanner(System.in);

System.out.println ("Please eneter an amount of money");
double stocks = kb.nextDouble();


if (stocks < 100) 
{
System.out.println ("Your Commission is $20");
} else if (stocks >= 100 && stocks < 1000) {
   stocks = stocks * .01 + 20;
System.out.println ("Your Commission is " + stocks);
} else if (stocks >= 1000 && stocks < 10000) {
   stocks = stocks * .05 + 30;
System.out.println ("Your Commission is " + stocks);
} else if (stocks >= 10000 && stocks < 100000) {
   stocks = stocks * .025 + 75;
System.out.println ("Your Commission is " + stocks);
} else if (stocks >= 100000) {
   stocks = stocks * .0125 + 100;
System.out.println ("Your Commission is " + stocks);
}

}
}