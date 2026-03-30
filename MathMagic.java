import java.util.Scanner;

public class MathMagic
{
public static void main(String[] args) throws Exception
{
Scanner kb = new Scanner(System.in);


System.out.println("Choose 4 digits -- just think of them");
System.out.println("Mentally make two four-digit numbers with these digits");
System.out.println("Mentally subtract the smaller from the larger.");
System.out.println("Secretly pick a non-zero digit from the difference.");
System.out.println("Enter the remaining three digits, one per line");

int digit1 = kb.nextInt();
int digit2 = kb.nextInt();
int digit3 = kb.nextInt();

int sum = digit1 + digit2 + digit3;

int secret = sum % 9; 

System.out.println("The missing digit is " + secret);

}
}