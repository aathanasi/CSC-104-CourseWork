import java.util.Scanner;

public class TestAdd
{
public static void main(String[] args)
{
try
{
Scanner input = new Scanner(System.in);
System.out.println("Enter two integers (use 'max' or 'min' as shortcuts):");

String num1 = input.next();
String num2 = input.next();
int a, b;

if (num1.equals("max")) a = Integer.MAX_VALUE;
else if (num1.equals("min")) a = Integer.MIN_VALUE;
else a = Integer.parseInt(num1);

if (num2.equals("max")) b = Integer.MAX_VALUE;
else if (num2.equals("min")) b = Integer.MIN_VALUE;
else b = Integer.parseInt(num2);

int sum = Add.add(a, b);
System.out.println("Sum = " + sum);

} catch (NumberFormatException e) {
System.out.println("Invalid input format.");
} catch (OverflowException | UnderflowException e) {
System.out.println(e.getMessage());
}
}
}
