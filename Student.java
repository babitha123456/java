//Babitha jsvs batch 2576
import java.util.Scanner;
class student
{
	public static void main(String[] args)
	{
		String name;
		int id;
		float attendennce;
		Scanner sc = new Scanner(System.in);//System.in is a standard input stream
		System.out.println("enter the student name:");
		name = sc.nextLine();
		System.out.println("enter the student id:");
		id = sc.nextInt();
				System.out.println("enter the student attendennce:");
				attendennce = sc.nextFloat();
				System.out.println("the name of the student:"+name);
				System.out.println("the id of the student id:"+id);
	System.out.println("the attendennce of the student:"+attendennce);
	}
}
		
		