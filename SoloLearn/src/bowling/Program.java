package bowling;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour entrez les 3 joueurs:");
		Bowling game = new Bowling();
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<3; i++) {
			String input = sc.nextLine();
			String[] values = input.split(" ");
			String name = values[0];
			int points = Integer.parseInt(values[1]);
			game.addPlayer(name, points);
		}
		System.out.println("On y va:");
		game.getWinner();
		sc.close();
	}

}
