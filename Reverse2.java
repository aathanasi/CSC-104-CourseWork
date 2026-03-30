public class Reverse2
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

public static void main(String[] args)
{
try {
String input = "abc@123";
System.out.println(reverse(input));
} catch (IllegalCharacterException e)
{
System.out.println("Illegal Character in String: " + e.getMessage());
System.out.println("Class: Reverse2");
}
}
}
