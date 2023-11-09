package com.company.liskov_1;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());
		
		Square square = new Square(10);
		System.out.println(square.computeArea());
		
		useRectangle(rectangle);
		
	}

	private static void useRectangle(Rectangle rectangle) {
		// tôi là rectangle 
		//  khi ông set width và get width -> ông sẽ có width
		//  khi ông set height và get height -> ông sẽ có height
		// ông set như nào ông sẽ có như thế lúc lấy -> square vi phạm contract

		rectangle.setHeight(20);
		rectangle.setWidth(30);
		assert rectangle.getHeight() == 20 : "Height Not equal to 20";
		assert rectangle.getWidth() == 30 : "Width Not equal to 30";
	}
}
