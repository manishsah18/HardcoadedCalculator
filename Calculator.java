class Calculator
{
	int a=5;
	int b=10;
	
	public static void main(String[] args)
	{
		Calculator calc =new Calculator();
		calc.addition();
		calc.substraction();
		calc.multiplication();
		calc.division();
		
	}
	public void addition()

	{
		int c= a+b;
		System.out.print("sum of no is:"+c);
		
	}
	public void substraction()
	{
		int d=a-b;
		System.out.print("difference of no is:"+d);
	}
	public void multiplication()
	{
		int e= a*b;
		System.out.print("product of no is:"+e);
	}
	public void division()
	{
		int f= a/b;
		System.out.print("division of no is:"+f);
	}
}