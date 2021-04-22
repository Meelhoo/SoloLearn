package tobinary;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		System.out.println(Converter.toBinary(x));
		sc.close();
		
	}

}
