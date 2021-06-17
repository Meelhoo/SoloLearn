package areas;

public abstract class Shape {
	
	int width=0;
	abstract void area();

}

class Square extends Shape{
	
	
	Square(int w){
		this.width = w;
	}
	void area(){
		if (width>=0)
		System.out.println("Aire du carré: " + width*width);
	}
}

class Circle extends Shape{
	
	Circle(int w){
		this.width = w;
	}
	void area(){
		if (width>=0)
		System.out.println("Aire du cercle: " + width*width*Math.PI);
	}
}