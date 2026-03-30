import java.util.*;

public class InFix
{
public static int precedence(String op)
{
switch (op)
{
case "+": case "-": return 1;
case "*": case "/": return 2;
default: return 0;
}
}

public static String infixToPostfix(String infix)
{
StringTokenizer st = new StringTokenizer(infix, "()+-*/", true);
Stack<String> ops = new Stack<>();
String postfix = "";

while (st.hasMoreTokens())
{
String token = st.nextToken().trim();
if (token.isEmpty()) continue;

if (token.matches("\\d+"))
{
postfix += token + " ";
} else if (token.equals("("))
{
ops.push(token);
} else if (token.equals(")"))
{
while (!ops.isEmpty() && !ops.peek().equals("("))
{
postfix += ops.pop() + " ";
}
ops.pop();
} else if ("+-*/".contains(token))
{
while (!ops.isEmpty() && precedence(token) <= precedence(ops.peek()))
{
postfix += ops.pop() + " ";
}
ops.push(token);
}
}

while (!ops.isEmpty())
{
postfix += ops.pop() + " ";
}

return postfix.trim();
}

public static int evaluatePostfix(String postfix)
{
Scanner sc = new Scanner(postfix);
Stack<Integer> stack = new Stack<>();

while (sc.hasNext())
{
String token = sc.next();
if (token.matches("\\d+")) {
stack.push(Integer.parseInt(token));
} else {
int b = stack.pop();
int a = stack.pop();
switch (token)
{
case "+": stack.push(a + b); break;
case "-": stack.push(a - b); break;
case "*": stack.push(a * b); break;
case "/": stack.push(a / b); break;
}
}
}

return stack.pop();
}

public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.print("Enter expression: ");
String infix = input.nextLine();
String postfix = infixToPostfix(infix);
System.out.println("Post: " + postfix);
System.out.println("Answer: " + evaluatePostfix(postfix));
}
}
