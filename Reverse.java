import java.util.Scanner;

public class Reverse 
{

public static void reverse(int[] a, int lo, int hi) 
{
if (lo >= hi) 
{
return; 
}

int temp = a[lo];
a[lo] = a[hi];
a[hi] = temp;

reverse(a, lo + 1, hi - 1);
}

public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = input.nextInt();


int[] a = new int[n];
for (int i = 0; i < n; i++) 
{
a[i] = i + 1;
}


System.out.println("Array from 1 to " + n + ":");
for (int i = 0; i < n; i++) {
System.out.print(a[i] + " ");
}

System.out.println(); 

reverse(a, 0, n - 1);

System.out.println("Reversed array:");
for (int i = 0; i < n; i++) {
System.out.print(a[i] + " ");
}
}
}