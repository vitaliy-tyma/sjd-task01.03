package info.sjd;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import info.sjd.circle.Circle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;

public class ApplicationRunner {

	private static Logger logger = Logger.getLogger(
			ApplicationRunner.class.getName());
	
	public static void main(String[] args) {

		Circle circle = new Circle(10.0);
		Square square = new Square(10.0);
		Triangle tri = new Triangle(10.0, 5.0);
		
		
		logger.info("Circle with radius " + circle.getRadius() +
				" has area of " + circle.getArea());
		
		logger.info("Sqiure with side " + square.getSide() + 
				" has area of " + square.getArea());
		
		logger.info("Triangle with base " + tri.getBase() + 
				" and height " + tri.getHeight() + 
				" has area of " + tri.getArea());
		
	/* Task 4 - Collections.. */
		
		Circle circle1 = new Circle(11.0);
		Circle circle2 = new Circle(7.0);
		
		Square square1 = new Square(12.0);
		Square square2 = new Square(16.0);

		Triangle tri1 = new Triangle(11.0, 6.0);
		Triangle tri2 = new Triangle(5.0, 1.0);
		
		
		
		List<Shape> shapes = new ArrayList(9);
 		shapes.add(circle);
 		shapes.add(circle1);
 		shapes.add(circle2);
 		shapes.add(square);
 		shapes.add(square1);
 		shapes.add(square2);
 		shapes.add(tri);
 		shapes.add(tri1);
 		shapes.add(tri2);
 		
 		
		Shape maxShape = shapes.get(0);;
		Shape minShape = shapes.get(0);
		
		
		
		for (Shape foo : shapes) {
			if (foo.getArea() > maxShape.getArea()) {
				maxShape = foo;
			}
		}
	
		for (Shape foo : shapes) {
			if (foo.getArea() < minShape.getArea()) {
				minShape = foo;
			}
		}
		
		logger.log(Level.INFO, "");

		logger.info("Max area is for " + maxShape.getClass().getSimpleName() +
				" and is equal " + maxShape.getArea());
		
		logger.info("Min area is for " + minShape.getClass().getSimpleName() +
				" and is equal " + minShape.getArea());
		
		
		
	}

}
