import java.util.*;
import java.io.*;
public class UnJumbler
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
String userInput;
StringPermuter sp = new StringPermuter();
String[] result;
String lineRead;
Scanner inputStream = null;
boolean found = false;

System.out.print("Please enter string");
userInput = kb.nextLine();
result = sp.permute(userInput);


try
{
inputStream = new Scanner(new FileInputStream("6of12.txt"));
}
catch(Exception e)
{
System.out.println("Issue with opening file, program will close.");
System.exit(0);
}



while(inputStream.hasNextLine())
{
lineRead = inputStream.nextLine();
for(int i = 0; i < result.length; i++)
{
if(lineRead.equals(result[i]))
{
System.out.println(result[i]);
found=true;
}
}
}

inputStream.close();
if(found == false)
System.out.println("Not found");
}
}
