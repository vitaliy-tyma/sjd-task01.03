package info.sjd;

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
		
		
	
		
	}

}
