/*Pattern-1*/
/*class B  
{
public static void main(String[] args)
{
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}*/


/*Pattern-2*/
/*class B
{
public static void main(String[] args)
{
for(int i=1;i<6;i++)
{
for(int j=0;j<5;j++)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}*/


/*Pattern-3*/
/*class B
{
public static void main(String[] args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}*/



/*Pattern-4*/
/*class B
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(num+"\t");
num++;
}
System.out.println();
}
}
}*/



/*Pattern-5*/
/*class B
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(num+" ");
num++;
if(num==10)
{
num=1;
}
}
System.out.println();
}
}
}*/


/*Pattern-6*/
/*class B
{
public static void main(String[] args)
{
int num=1;
for(int i=0;i<5;i++) 
{
for(int j=0;j<5;j++) 
{
System.out.print(num+"\t");
num+=2;
}
System.out.println();
}
}
}*/


/*Pattern-7*/
/*class B
{
public static void main(String[] args)
{
for(int i=0;i<5;i++) 
{
for(int j=0;j<5;j++) 
{
System.out.print((i+j)%2+" ");
}
System.out.println();
}
}
}*/


/*Pattern-8*/
/*class B
{
public static void main(String[] args) 
{
int n=5;
for(int i=1;i<=n;i++) 
{
for(int j=i;j<n;j++) 
{
System.out.print(" ");
}
for(int k=1;k<=i;k++) 
{
System.out.print("* ");
}
System.out.println();
}
}
}*/


/*Pattern-9*/
/*class B
{
public static void main(String[] args) 
{
int n=5,num=2;
for(int i=1;i<=n;i++) 
{
for(int j=i;j<n;j++) 
{
System.out.print(" ");
}
for(int k=1;k<=i;k++) 
{
System.out.print(" "+num);
num+=2;
}
num=2;
System.out.println();
}
}
}*/



/*Pattern-10*/
/*class B
{
public static void main(String[] args) 
{
String word="INDIA";
int n=word.length();
for(int i=1;i<=n;i++) 
{
for(int j=0;j<i;j++) 
{
System.out.print(word.charAt(j)+" ");
}
System.out.println();
}
}
}*/



/*Pattern-11*/
/*class B
{
public static void main(String[] args) 
{
int n=5;
for(int i=1;i<=n;i++) 
{
for(int space=n-i;space>0;space--) 
{
System.out.print("  ");
}
for(int star=1;star<=(2 * i - 1);star++) 
{
System.out.print("* ");
}
System.out.println();
}
}
}*/




/*Pattern-12*/
/*class B
{
public static void main(String[] args) 
{
int n = 4;
for(int i=1;i<=n;i++) 
{
int spaces=13-2*i;
for(int s=0;s<spaces;s++)
{
System.out.print(" ");
}
for(int j=1;j<=2*i-1;j++) 
{
System.out.print("* ");
}
System.out.println();
}
for(int i=n-1;i>=1;i--) 
{
int spaces=13-2*i;
for(int s=0;s<spaces;s++) 
{
System.out.print(" ");
}
for(int j=1;j<=2*i-1;j++) 
{
System.out.print("* ");
}
System.out.println();
}
}
}*/




/*Pattern-13*/
/*class B 
{
public static void main(String[] args) 
{
int n=7;
int mid=n/2;
for(int i=0;i<n;i++) 
{
int outerSpaces=Math.abs(mid-i);
int innerSpaces=n-2*outerSpaces-1;
for(int j=0;j<outerSpaces;j++) 
{
System.out.print("  ");
}
System.out.print("*");
if(innerSpaces>0) 
{
for(int j=0;j<innerSpacesj++) 
{
System.out.print("  ");
}
System.out.print("*");
}
System.out.println();
}
}
}*/



                
/*Pattern-14*/
/*class B 
{
public static void main(String[] args) 
{
int n=5;
for(inti=0;i<n;i++) 
{
for(int j=0;j<n;j++) 
{               
if(i==0||i==n-1||j==0||j==n-1) 
{
System.out.print("* ");
} 
else 
{
System.out.print("  ");
}
}
System.out.println();
}
}
}*/



/*Pattern-15*/
/*class B 
{
public static void main(String[] args) 
{
int n=7;
int mid=n/2;
for(int i=0;i<n;i++) 
{
if(i==mid) 
{
System.out.print("   ");
for(int j=0;j<n;j++) 
{
System.out.print("* ");
}
} 
else 
{
System.out.print("         *");
}
System.out.println();
}
}
}*/




/*Pattern-16*/
/*class B 
{
public static void main(String[] args) 
{
int n=7;
int mid=n/2;
for(int i=0;i<n;i++) 
{
for(int j=0;j<n;j++) 
{
if(j==i||j==n-1-i) 
{
System.out.print("*");
} 
else 
{
System.out.print(" ");
}
}
System.out.println();
}
}
}*/




/*Pattern-17*/
/*class B 
{
public static void main(String[] args) 
{
int n=7;
int mid=n/2;
for(int i=0;i<n;i++) 
{
for(int j=0;j<n;j++) 
{
if(i==0||i==3||i==6) 
{
System.out.print("* ");
}
else 
{
if(j==0||j==mid||j==n-1) 
{
System.out.print("*");
if(j!=n-1) 
{
System.out.print("     ");
}
} 
else 
{
}
}
}
System.out.println();
}
}
}*/




/*Pattern-18*/
/*class B 
{
public static void main(String[] args) 
{
for(int i=0;i<8;i++) 
{
System.out.print("* ");
}
System.out.println();
int spaces=8;
for(int i=0;i<5;i++) 
{
System.out.print("*");
for(int j=0;j<spaces;j++) 
{
System.out.print(" ");
}
System.out.println("*"); 
spaces-=2;
}
System.out.println("*");
}
}*/



/*Pattern-19*/
/*class B
{
public static void main(String[] args) 
{
for(int i=0;i<=5;i++) 
{
for(int j=0;j<i;j++) 
{
System.out.print("* ");
}
System.out.println(i);
}
}
}*/



/*Pattern-20*/
/*class B
{
public static void main(String[] args) 
{
for(int i=0;i<7;i++) 
{
System.out.print("* ");
}
System.out.println();
for(int i=0;i<6;i++) 
{
System.out.print("*"); 
for(int j=0;j<(2*i);j++) 
{
System.out.print(" ");
}
System.out.println("*");
}
}
}*/







