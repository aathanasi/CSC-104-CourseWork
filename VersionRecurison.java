import java.util.Scanner;

public class VersionRecurison
{

public static void versionOfRecursion(int n)
{
if(n <= 0)
{
return;
}

System.out.println("There is a version of recursion.");

versionOfRecursion(n - 1);

}

public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);
   System.out.println("Enter number of times to repeat:");
   int n = input.nextInt();
   versionOfRecursion(n);
}
}