package com.glo.Problems;

//interface can be sealed or non sealed but not final
sealed interface Shapes permits Rectangle,EquilateralTriangle
{
	public abstract void calculate();
	public void perimeter();
}

//can be sealed/non-sealed/final
final class Rectangle implements Shapes
{
   private int length,breadth;
    
	public Rectangle(int length,int breadth) {
		super();
		this.length = length;
		this.breadth=breadth;
		
	}

	@Override
	public void calculate() {
		
		System.out.println("Area of Rectangle is:"+length*breadth);
		
	}

	@Override
	public void perimeter() {
		
		System.out.println("Perimiter of Rectangle is:"+ 2*(length+breadth));
		
	}
	
}
final class EquilateralTriangle implements Shapes
{
	private int side;
	

	public EquilateralTriangle(int side) {
		super();
		this.side = side;
	}

	@Override
	public void calculate() {
		
		System.out.println("Area of Equilateral triangle is:"+(Math.sqrt(3)*side*side)/4);
		
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of Equilateral Triangle is:"+ side*3);
		
		
	}
}


public class Problem5 {

	public static void main(String[] args) {
		Shapes rectangle=new Rectangle(5,6);
		Shapes triangle=new EquilateralTriangle(3);
		
		rectangle.calculate();
		rectangle.perimeter();
		
		triangle.calculate();
		triangle.perimeter();
		

	}

}
