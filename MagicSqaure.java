import java.util.Scanner;

public class MagicSqaure
{

public static void main(String[] args)
{

Scanner kb = new Scanner(System.in);

System.out.println("Please enter an odd int");
int n = kb.nextInt();
if (n % 2 == 0)

{
System.out.println("Sorry please make sure the int you entered is odd");
return;
}


int[][]magicSquare = createMagic(n);
printMagic(magicSquare);

}

public static int[][]createMagic(int n)
{
int[][]magicSquare = new int[n][n];

int row = 0;
int column = n/2;

for(int num = 1; num <= n * n; num++)
{
magicSquare[row][column] = num;

int newRow = (row - 1 + n) % n;
int newColumn = (column + 1) % n;

if(magicSquare[newRow][newColumn] != 0)
{
row = (row + 1) % n;
} else {
row = newRow;
column = newColumn;
}
}

return magicSquare;

}


public static void printMagic(int[][] magicSquare)
{
int n = magicSquare.length;

for(int i = 0; i < n; i++)
{
for(int j = 0; j < n; j++)
{
System.out.print(magicSquare[i][j] + "\t");
}
System.out.println();

}
}
}