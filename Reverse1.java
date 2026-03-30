public class Reverse1
{
public static String reverse(String input) throws IllegalCharacterException
{
for (char c : input.toCharArray())
{
if (!Character.isLetterOrDigit(c))
{
throw new IllegalCharacterException("Illegal Character in String: " + input);
}
}
return new StringBuilder(input).reverse().toString();
}

public static void main(String[] args) throws IllegalCharacterException 
{
String input = "abc123!";
System.out.println(reverse(input));
}
}