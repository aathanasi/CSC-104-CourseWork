import java.util.Scanner;

public class TemperatureConverter
{
public static void main(String[] args)
{


Scanner kb = new Scanner(System.in);

System.out.println("Welcome to the Temperature Converter!");
System.out.println("Enter your temperature degrees Fahrenheit: ");

double fahrenheit = kb.nextInt();
double result = (fahrenheit - 32) * 5 / 9;

System.out.println("Ok, that is " + result + ". Bye!");

}
}