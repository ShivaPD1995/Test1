package Basicprograms;
class KA
{
	 double area()
	{
		int r=10;
		double pi=3.142;
		double t=pi*r*r;
		return t;
	}
}

public class India 
{
	public static void main(String[] args) 
	{
		KA a=new KA();
		double x=a.area();
		System.out.println(x);

	}

}
