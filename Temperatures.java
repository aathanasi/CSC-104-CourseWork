import java.util.Scanner;
import java.util.Random;

public class Temperatures
{
public static void main(String[] arg)
{
Random rng = new Random();
double c;

System.out.println("Farenheit\tCelsius");

for (int f = 0; f <= 100; f++)

{

c = (f - 32) * (5.0/9);

System.out.printf("%d\t\t%.1f%n", f, c);

}


}

}