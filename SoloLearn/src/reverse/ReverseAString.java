package reverse;

import java.util.Scanner;

/** affiche le string miroir de celui entré */

public class ReverseAString {
	
	public static String reverse(String text) {
		char[] arr = text.toCharArray();

		int longueur = arr.length;
		String resultat = "";
		for (int i=0; i<longueur; i++) {
			resultat += arr[longueur-1-i];
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
