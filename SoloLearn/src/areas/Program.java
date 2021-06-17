package areas;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int x = 0; int y=0;
		try {
		x = sc.nextInt();
	    y = sc.nextInt();
		} catch( Exception e) {}
		finally {
		Square a = new Square(x);
		a.area();
		Circle b = new Circle(y);
		b.area();}
		
		sc.close();
	}

}
