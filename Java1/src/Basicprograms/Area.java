package Basicprograms;
//indian
public class Area
{
		double area()
		{
			int r=10;
			double pi=3.142;
			double t=pi*r*r;
			return t;
		}
	public static void main(String[] args) 
	{
		Area a1=new Area();
			double x=a1.area();
			System.out.println(x);

	}
}

