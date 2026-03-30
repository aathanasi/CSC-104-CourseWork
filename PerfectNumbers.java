import java.util.Scanner;

public class PerfectNumbers
{
public static void main(String[] arg) throws Exception
{
Scanner kb = new Scanner(System.in);

System.out.println("The perfect numbers between 2 and 10,000 are:");

for(int number = 2; number <= 10000; number++)
{
int sum = 0;
for (int i = 1; i <= number / 2; i++) 
{
if (number % i == 0) 
{
sum += i;
}
}

if (sum == number) 
{
System.out.println(number);
}


}
}
}