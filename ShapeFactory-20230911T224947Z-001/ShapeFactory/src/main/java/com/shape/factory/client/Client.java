package com.shape.factory.client;

import com.shape.factory.factory.ShapeFactory;
import com.shape.factory.service.Shape;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueTesting = true;

        while (continueTesting) {
            System.out.println("Choose a shape: ");
            System.out.println("1 - Circle");
            System.out.println("2 - Rectangle");
            System.out.println("3 - Triangle");
            System.out.println("4 - Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    testShape("circle");
                    break;
                case 2:
                    testShape("rectangle");
                    break;
                case 3:
                    testShape("triangle");
                    break;
                case 4:
                    continueTesting = false; // Exit the loop
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            if (continueTesting) {
                System.out.println("Do you want to continue testing? (Y/N)");
                String cont = sc.nextLine().trim();
                if (!cont.equalsIgnoreCase("Y")) {
                    continueTesting = false;
                }
            }
        }

        System.out.println("Thank you");
    }

    private static void testShape(String shapeType) {
        Shape shape = ShapeFactory.createShape(shapeType);

        if (shape != null) {
            System.out.println("Area of "+shapeType+": " + shape.calculateArea());
            System.out.println("Perimeter of "+shapeType+": " + shape.calculatePerimeter());
        } else {
            System.out.println("Invalid shape type."+shapeType);
        }
    }
}
