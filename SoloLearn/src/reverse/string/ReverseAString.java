package reverse.string;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		int l = arr.length - 1;
		String resultat = "";
		for (int i=0; i<= l; i++) {
			resultat += arr[l-i];
		}
		
		System.out.println(resultat);
		scanner.close();
	}

}
