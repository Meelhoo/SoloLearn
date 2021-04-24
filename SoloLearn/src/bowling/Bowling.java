package bowling;

import java.util.*;
import java.util.Map.Entry;

public class Bowling {
	HashMap<String, Integer> players;
	Bowling(){
		players = new HashMap<String, Integer>();
	}
	public void addPlayer(String name, int p) {
		players.put(name, p);
		System.out.println("player ajouté: " + name);
	}
	//TODO
	public void getWinner() {
		// Set<String> winners = players.keySet();

		int max = 0;
		Set<Entry<String,Integer>> splayers = players.entrySet();
		System.out.println("players size avant: " + splayers.size());
		
		Iterator<Entry<String,Integer>> iplayer = splayers.iterator();
        while (iplayer.hasNext()) {
        	
          System.out.println("nouveau max: " + max);
          Entry<String, Integer> eplayer = iplayer.next();
          int iValeur = (int) eplayer.getValue();
          System.out.println("iValeur: "+iValeur+" max: "+max);
          if (iValeur<max) {
        	  splayers.remove(eplayer);
              System.out.println(eplayer.getKey() + " removed");
          } 
          max = iValeur;
          
        } 
        System.out.println("players size apres: " + splayers.size());

        Iterator<Entry<String,Integer>> iWinner = splayers.iterator();
        while (iWinner.hasNext()) {
        	System.out.println(iWinner.next().getKey());
        }

	}
}
