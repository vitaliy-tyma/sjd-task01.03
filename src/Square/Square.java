package Square;

import info.sjd.AbstractShape;

public class Square extends AbstractShape {

	double side;
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	
	public Square(double d){
		this.side = d;
	}
	
		//@Override
		public double getArea(){
			return side*side;
		}

}
