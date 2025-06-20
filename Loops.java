/*Loops-1
class L
{
public static void main(String[] args) 
{
for(int i=0;i<10;i++) 
{
System.out.println("Bright IT Career");
}
}
}*/


/*Loops-2
class L 
{
public static void main(String[] args) 
{
int i=1;
while(i<=20) 
{
System.out.println(i);
i++;
}
}
}*/



/*Loops-3
import java.util.Scanner;
class L
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.print("Enter first number: ");
int num1=s.nextInt();
System.out.print("Enter second number: ");
int num2=s.nextInt();
if(num1==num2) 
{
System.out.println("Equal operator");
} 
else 
{
System.out.println("Not equal operator");
}
}
}*/




/*Loops-4
import java.util.Scanner;
class L
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number:");
int n=s.nextInt();
if(n%2==0)
{
System.out.println("Even Number:"+n);
}
else
{
System.out.println("Odd Number:"+n);
}
}
}*/



/*Loops-5
class L 
{
public static void main(String[] args) 
{
int a=10,b=20,c=15;
if(a>=b && a>=c)
{
System.out.println("Largest is:"+ a);
}
else 
{
if(b>=a && b>=c)
{
System.out.println("Largest is: " + b);
}
else
{
System.out.println("Largest is: " + c);
}
}
}
}*/




/*Loops-6
class L 
{
public static void main(String[] args) 
{
int i=10;
while(i<=100) 
{
if(i%2==0)
System.out.println(i);
i++;
}
}
}*/


	

/*Loops-7
class L 
{
public static void main(String[] args) 
{
int i=1;
do 
{
System.out.println(i);
i++;
} 
while (i <= 10);
}
}*/



/*Loops-8
import java.util.Scanner;
class L
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
int num=s.nextInt();
int digits=String.valueOf(num).length();
int sum=0;
int temp=num;
while(temp!=0)
{
int digit=temp%10;
sum+=Math.pow(digit,digits);
temp/=10;
}
if(sum==num) 
{
System.out.println(num + " is an Armstrong number.");
} 
else 
{
System.out.println(num + " is not an Armstrong number.");
}
}
}*/



/*Loops-9
import java.util.Scanner;
class L 
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
int num=s.nextInt();
boolean isPrime=true;
if(num<=1) 
{
isPrime = false;
} 
else 
{
for(int i=2;i<=Math.sqrt(num);i++) 
{
if(num%i==0) 
{
isPrime=false;
break;
}
}
}
if(isPrime)
System.out.println(num + " is a Prime number");
else
System.out.println(num + " is NOT a Prime number");
}
}*/



/*Loops-10
import java.util.Scanner;
class L 
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a string: ");
String input=s.nextLine();
String cleanedInput=input.replaceAll("\\s+", "").toLowerCase();
if(isPalindrome(cleanedInput)) 
{
System.out.println("The string is a palindrome.");
} 
else 
{
System.out.println("The string is not a palindrome.");
}
}
public static boolean isPalindrome(String str) 
{
int left=0;
int right=str.length()-1;
while(left<right) 
{
if(str.charAt(left)!=str.charAt(right))
{
return false;
}
left++;
right--;
}
return true;
}
}*/


/*Loops-11
import java.util.Scanner;
class L
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
int num=s.nextInt();
switch(num%2) 
{
case 0:
System.out.println(num + " is an even number.");
break;
case 1:
System.out.println(num + " is an odd number.");
break;
default:
System.out.println("Invalid input.");
}
}
}
*/

/*Loops-12
import java.util.Scanner;
class L 
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.print("Enter gender (M/F): ");
char gender=s.next().charAt(0);
switch(Character.toUpperCase(gender)) {
case 'M':
System.out.println("Gender is Male");
break;
case 'F':
System.out.println("Gender is Female");
break;
default:
System.out.println("Invalid input. Please enter M or F.");
}
}
}*/

/*Loops-13
class L
{
public static void main(String[] args) {
int a= 10,b=20,c=30;
if (a>=b && a>=c) 
{
System.out.println(a + " is the largest number.");
} 
else if(b>=a && b>=c) 
{
System.out.println(b + " is the largest number.");
} 
else 
{
System.out.println(c + " is the largest number.");
}
}
}*/
