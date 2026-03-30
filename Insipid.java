import java.util.Scanner;

public class Insipid {

public static void main(String[] args) {
Scanner kb = new Scanner(System.in);
int runAgain = 1;

while (runAgain == 1) {

System.out.print("Number (1 to 99): ");
int n = kb.nextInt();

System.out.printf("The sequence starting at %d is: ", n);
printInsipid(n);

System.out.print("Run again (1 for yes)? ");
runAgain = kb.nextInt(); 
}

System.out.println("Thank you for playing!");

}

public static void printInsipid(int n) {
boolean Insipid = false;
int[] cycleNumbers = {58, 89, 145, 42, 20, 4, 16, 37};

while (true) {

System.out.print(n + " ");

if (n == 1) {
Insipid = true;
break;
}

for (int num : cycleNumbers) {
if (n == num) {
Insipid = false; 
break;
}
}

n = sumOfDigits(n);

if (!Insipid && n == 58) {
break; 
}
}

if (Insipid) {
System.out.println("\nIt is Insipid!");
} else {
System.out.println("\nIt is Not Insipid!");
}
}

public static int sumOfDigits(int n) {
int sum = 0;
while (n > 0) {
int digit = n % 10; 
sum += digit * digit; 
n /= 10; 
}
return sum;
}
}
