package FirstTestNgTutorial;

public class Subtraction 
{
	public static void main(String[] args) {
		int a,b,c;
		a=7;
		b=3;
		int result=subtraction(a,b);
		
		System.out.println("substraction of entered integers = "+result);
	}
		public static int subtraction(int m,int n)
		{
		int p=m-n;
		return p;
	}
}
