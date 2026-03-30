import java.util.Stack;

public class PrintStack
{
public static void popAndPrint(Stack<String> s)
{
if (s.empty()) return;
String val = s.pop();
System.out.println(val);
popAndPrint(s);
}

public static void main(String[] args)
{
Stack<String> s = new Stack<>();
s.push("Jerry");
s.push("Elaine");
s.push("George");
s.push("Kramer");
s.push("Newman");

popAndPrint(s);
System.out.println("Stack size is now " + s.size());
}
}
