//R.Babitha Bach:2576
//lab test
//Question number 4
class Test1
{
public static void main(String[] args)
{
for(int i=1;i<=4;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print("*");
}
System.out.println();
}
}

//Question number3(b)

import java.util.Scanner;
class Test2
{
public static void main(String[] args)
{
int i=1,n;
System.out.println("Enter n");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(i<=10)
{
	System.out.println(n+"*"+i+"="+(n*i));
	i++;
}
}
}


//Question number3(c)
class Test3
{
public static void main(String[] args)
{
int i=1,sum=0;
while(i<=10)
{
sum=sum+i;
i++;
}
System.out.println(sum);
}
}



//Question number 2
import java.util.Scanner;
class Test4
{
public static void main(String[] args)
{
int num=9835,reverse=0;
while(num!=0)
{
int i=num%10;
reverse=reverse*10+i;
num/=10;

System.out.println("the reversed number is:"+reverse);
}
}
}

