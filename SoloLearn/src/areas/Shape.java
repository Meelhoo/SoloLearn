package areas;

public abstract class Shape {
	
	int width;
	abstract void area();

}

class Square extends Shape{
	
	Square(int w){
		this.width = w;
	}
	void area(){
		System.out.println("Test" + 1);
		System.out.println("Aire du carré: " + width*width);
	}
}

class Circle extends Shape{
	
	Circle(int w){
		this.width = w;
	}
	void area(){
		System.out.println("Test" + 2);
		System.out.println("Aire du cercle: " + width*width*Math.PI);
	}
}