import java.util.Scanner;

public class RightTriangle
{
public static void main(String[] arg) throws Exception
{
Scanner kb = new Scanner(System.in);

System.out.print("Enter the value of n: ");
int n = kb.nextInt();

for (int i = 1; i <= n; i++) {
for (int j = 1; j <= i; j++) {
System.out.print("X");
}
System.out.println();
}








}
}