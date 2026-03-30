import java.util.*;

public class Palindrome
{
public static boolean isPalindrome(String s)
{
Stack<Character> stack = new Stack<>();
String cleaned = "";

for (char ch : s.toCharArray())
{
if (Character.isLetter(ch))
{
cleaned += ch;
stack.push(ch);
}
}

for (int i = 0; i < cleaned.length(); i++)
{
if (cleaned.charAt(i) != stack.pop())
return false;
}

return true;
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
while (true)
{
System.out.print("Enter a string (xxx to exit): ");
String s = sc.nextLine();
if (s.equals("xxx"))
break;

if (isPalindrome(s))
System.out.println("Palindrome");
else
System.out.println("Not a palindrome");
}
}
}
