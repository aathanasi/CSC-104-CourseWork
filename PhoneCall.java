import java.util.Scanner;

public class PhoneCall
{
public static void main(String[] arg) throws Exception
{
Scanner kb = new Scanner(System.in);

System.out.println("Please enter call duration");
double length = kb.nextDouble();

System.out.println("Please enter rate code");
int code = kb.nextInt();

double cost = 0;


switch (code){
   case 0:
   cost = length * .15;
   System.out.println("The cost of the call is $ " + cost);
   break;

   
   case 1:
   cost = length * .07;
   System.out.println("The cost of the call is $ " + cost);
   break;

   
   case 2:
   cost = length * .05;
   System.out.println("The cost of the call is $ " + cost);
   break;


default: 
System.out.println("Sorry that is invalid. Try again");
break;

}



}
}