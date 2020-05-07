package ro.unitbv.shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Square("#ffffff", 10, 12));
		shapes.add(new Rectangle("#f0f2ff", 5, 8, 10));
		shapes.add(new Circle("#000000", 2, 7));
		
		//ArrayList<String> count = new ArrayList<String>();
		
		for (Shape s : shapes) {
			
		

			System.out.println("Name of the shape: ");
			System.out.println(s.getName());
			System.out.println("Area of the shape: ");
			System.out.println(s.getArea());
			System.out.println("Border width: ");
			System.out.println(s.getBorderWidth());
			System.out.println("Hex color: ");
			System.out.println(s.getHexFillColor());
			System.out.println();
			s.draw();
			System.out.println();

		}
		
		
		

	}

}