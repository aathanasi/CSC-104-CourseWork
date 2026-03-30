public class Reverse3
{
public static String reverse(String input)
{
try
{
for (char c : input.toCharArray())
{
if (!Character.isLetterOrDigit(c))
{
throw new IllegalCharacterException("Illegal Character in String: " + input);
}
}
return new StringBuilder(input).reverse().toString();
} catch (IllegalCharacterException e) {
System.out.println("Illegal Character in String: " + e.getMessage());
System.out.println("Class: Reverse3");
return "";
}
}

public static void main(String[] args)
{
String input = "abc!123";
System.out.println(reverse(input));
}
}
