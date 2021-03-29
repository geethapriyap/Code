import java.util.Scanner;

public class Calculator {

	int c;
	int add(int a,int b)
	{
		c=a+b;
		return c;
	}
	void sub(int a,int b)
	{
		c=a-b;
		System.out.println("Sub="+c);
	}
	int a,b;
	static Scanner sc=new Scanner(System.in);
	int mul()
	{
		System.out.println("Enter the values of a and b:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		return c;
	} 
	void div()
	{
		System.out.println("Enter the vaalues of a and b:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Div="+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.println("Enter the values of i and j:");
		i=sc.nextInt();
		j=sc.nextInt();
		Calculator x=new Calculator();
		System.out.println("Add="+x.add(i, j));
		x.sub(i, j);
		System.out.println("Mul="+x.mul());
		x.div();
	}

}
