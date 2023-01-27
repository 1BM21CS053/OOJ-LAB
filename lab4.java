import java.util.Scanner;
abstract class shape
{
	shape(){}
	int h,b;
	abstract void printArea();
	}
class rectangle extends shape
{
	Scanner s=new Scanner(System.in);
	void printArea()
		{
			System.out.println("Enter height and width of rectangle");
			h=s.nextInt();
			b=s.nextInt();
			System.out.println("Area of Rectangle is "+b*h);
			}
	rectangle(){}
}


class triangle extends shape
{
	Scanner s=new Scanner(System.in);
	void printArea()
		{
			System.out.println("Enter height and base of Triangle");
			h=s.nextInt();
			b=s.nextInt();
			System.out.println("Area of Triangle is "+0.5*b*h);
			}
		triangle(){}
}

class circle extends shape
{
	Scanner s=new Scanner(System.in);
	void printArea()
		{
			System.out.println("Enter radius of Circle");
			h=s.nextInt();
			System.out.println("Area of Circle is "+3.14*h*h);
			}
		circle(){}
}


class Lab4
{
public static void main(String xx[])
{
	rectangle r=new rectangle();
	r.printArea();
	triangle t=new triangle();
	t.printArea();
	circle c=new circle();
	c.printArea();
}
}