package info.sjd.circle;

import info.sjd.AbstractShape;

public class Circle extends AbstractShape {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

}
