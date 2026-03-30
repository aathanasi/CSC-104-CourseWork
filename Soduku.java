import java.util.Arrays;

public class Soduku
{
public static void main(String[]args)
{

int[][] solution =
{{4,2,9,8,1,3,5,6,7},
{5,1,6,4,7,2,9,3,8},
{7,8,3,6,5,9,2,4,1},
{6,7,2,1,3,4,8,5,9},
{3,9,5,2,8,6,1,7,4},
{8,4,1,7,9,5,6,2,3},
{1,5,8,3,6,7,4,9,2},
{9,3,4,5,2,8,7,1,6},
{2,6,7,9,4,1,3,8,5}};

System.out.println(validArray(solution[0]));
System.out.println(validRows(solution));
System.out.println(validColumns(solution));
System.out.println(validSubGrids(solution));


}

public static boolean validArray(int[] arrayPassed)
{
int[]correct = {1,2,3,4,5,6,7,8,9};
int[]copy = Arrays.copyOf(arrayPassed, arrayPassed.length);
Arrays.sort(copy);
return Arrays.equals(copy, correct);

}

public static boolean validRows(int[][]arrayPassed)
{
for(int r = 0; r < arrayPassed.length; ++r)
{
if (validArray(arrayPassed[r]) == false)
return false;
}
return true;
}

public static boolean validColumns(int[][]arrayPassed)
{
int[] temp = new int[arrayPassed.length];
for(int r = 0; r < arrayPassed.length; ++r)
{
for(int c = 0; c < arrayPassed.length; ++c)
{
temp[c] = arrayPassed[c][r];
}
if(validArray(temp) == false)
return false;
}
return true;
}

public static boolean validSubGrids(int[][]arrayPassed)
{
for(int row = 0; row < arrayPassed.length; row += 3)
{
for(int column = 0; column < arrayPassed.length; column += 3)
{
int[]subGrid = new int[9];
int index = 0;

for(int r = row; r < row + 3; r++)
{
for(int c = column; c < column + 3; c++)
{
subGrid[index++] = arrayPassed[r][c];
}
}

if(validArray(subGrid) == false)
return false;
}
}
return true;
// // // }
// // // // // // // // }