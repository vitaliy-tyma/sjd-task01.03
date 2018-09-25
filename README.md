# sjd-task01.03
sjd-task01.03

Educational project.





	/* Task 4 - Collections... */
		
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
			
			if (foo.getArea() < minShape.getArea()) {
				minShape = foo;
			}
		}
		
		logger.log(Level.INFO, "");

		logger.info("Max area is for " + maxShape.getClass().getSimpleName() +
				" and is equal " + maxShape.getArea());
		
		logger.info("Min area is for " + minShape.getClass().getSimpleName() +
				" and is equal " + minShape.getArea());

