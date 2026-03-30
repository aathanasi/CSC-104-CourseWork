public class Pascal 
{
public static int Pascal(int r, int e) 
{
if(e == 0 || e == r)
{
return 1;
}

return Pascal(r - 1, e - 1) + Pascal (r - 1, e);
}

public static void main(String[]args)
{
int rows = 5;

for(int r = 0; r < rows; r++)
{
for(int spaces = 0; spaces < rows - r - 1; spaces++)
{
System.out.print(" ");
}

for(int e = 0; e <= r; e++)
{
System.out.print(Pascal(r,e) + " ");
}

System.out.println();
}
}
}