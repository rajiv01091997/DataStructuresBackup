package com.glo.Problems;

sealed abstract class Shape permits Circle,Square,Triangle
{
	public abstract void calculate();
}

final class Circle extends Shape
{
   private int rad;
    
    
	
	public Circle(int rad) {
		super();
		this.rad = rad;
	}



	@Override
	public void calculate() {
		
		System.out.println("Area of circle is:"+Math.PI*rad*rad);
		
	}
	
}
final class Square extends Shape
{
	private int side;
	
	
	public Square(int side) {
		super();
		this.side = side;
	}


	@Override
	public void calculate() {
		
		System.out.println("Area of Square is:"+side*side);
		
	}
}
final class Triangle extends Shape
{
	private int base,height;

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height= height;
	}

	@Override
	public void calculate() {
		

		System.out.println("Area of Triangle is:"+(base*height)/2.0);
	}
	
	
}

public class Problem4 {

	public static void main(String[] args) {
		
		Shape circle=new Circle(2);
		Shape square=new Square(8);
		Shape triangle=new Triangle(3,4);
		
		circle.calculate();
		square.calculate();
        triangle.calculate();
	}

}
