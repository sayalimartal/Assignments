abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {
	void draw() {
		System.out.println("Draw a circle");
	}		
}

class Polygon extends Shape {
	void draw() {
		System.out.println("Draw a polygon");
	}		
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Draw a rectangle");
	}		
}

