package reverse;

import java.util.Scanner;

/** affiche le string miroir de celui entré */

public class ReverseAString {
	
	public static String reverse(String text) {
		char[] arr = text.toCharArray();

		int l = arr.length - 1;
		String resultat = "";
		for (int i=0; i<= l; i++) {
			resultat += arr[l-i];
		}
		return resultat;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		
		System.out.println(reverse(text));
		scanner.close();
	}

}
