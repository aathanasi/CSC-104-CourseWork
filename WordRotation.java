import java.util.Scanner;

public class WordRotation
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);

System.out.print("Enter number of words to rotate ");
int n = kb.nextInt();
kb.nextLine();

System.out.print("Enter String ");
String string = kb.nextLine();

String[] words = string.split(" ");
int len = words.length;
n = n % len;

String[]rotated = new String[len];
for(int i = 0; i < len; i++)
{
rotated[(i + n) % len] = words[i];
}

System.out.println("Roatated " + n + "positions: " + String.join(" ", rotated));
}
}
