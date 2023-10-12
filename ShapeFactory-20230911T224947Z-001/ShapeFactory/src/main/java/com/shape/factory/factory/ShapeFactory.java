package com.shape.factory.factory;

import java.util.Scanner;

import com.shape.factory.service.Shape;
import com.shape.factory.service.impl.Circle;
import com.shape.factory.service.impl.Rectangle;
import com.shape.factory.service.impl.Triangle;

public class ShapeFactory {
	
	static Scanner sc=new Scanner(System.in);
    public static Shape createShape(String shapeType) {
        /* create the logic to create the objects of the class
           based on shapeType
        */
    	if(shapeType.trim().equalsIgnoreCase("Circle"))
    	return new Circle(5);
    	
    	else if(shapeType.trim().equalsIgnoreCase("Rectangle"))
    	return new Rectangle(3,4);
    	
    	else if(shapeType.trim().equalsIgnoreCase("Triangle"))
    	return new Triangle(4, 5, 6);
    	
    	else
    	return null;
    	
    	
      
    }
}
