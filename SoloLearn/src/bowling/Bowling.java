package bowling;

import java.util.*;
import java.util.Map.Entry;

public class Bowling {
	

	HashMap<String, Integer> players = new HashMap<String, Integer>();
	

	public void addPlayer(String name, int p) {
		players.put(name, p);

	}
	
	/** tri d'une hashmap par valeur */
	public static HashMap<String, Integer> triAvecValeur( HashMap<String, Integer> map ){
		
		   List<Map.Entry<String, Integer>> list =
		        new LinkedList<Map.Entry<String, Integer>>( map.entrySet() );
		   
		   Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
		      public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ){
		          return (o1.getValue()).compareTo( o2.getValue());
		      }
		   });
		   
		   HashMap<String, Integer> map_apres = new LinkedHashMap<String, Integer>();
		   for(Map.Entry<String, Integer> entry : list)
		     map_apres.put( entry.getKey(), entry.getValue() );
		   return map_apres;
		}
	
		   
	//TODO
	public void getWinner() {
		// Set<String> winners = players.keySet();


		/*
		 * int max = 0; Set<Entry<String,Integer>> splayers = players.entrySet();
		 * System.out.println("players size avant: " + splayers.size());
		 * 
		 * Iterator<Entry<String,Integer>> iplayer = splayers.iterator(); while
		 * (iplayer.hasNext()) {
		 * 
		 * System.out.println("nouveau max: " + max); Entry<String, Integer> eplayer =
		 * iplayer.next(); int iValeur = (int) eplayer.getValue();
		 * System.out.println("iValeur: "+iValeur+" max: "+max); if (iValeur<max) {
		 * splayers.remove(eplayer); System.out.println(eplayer.getKey() + " removed");
		 * } max = iValeur;
		 * 
		 * } System.out.println("players size apres: " + splayers.size());
		 * 
		 * Iterator<Entry<String,Integer>> iWinner = splayers.iterator(); while
		 * (iWinner.hasNext()) { System.out.println(iWinner.next().getKey()); }
		 */
		
		List<Map.Entry<String, Integer>> list =
		        new LinkedList<Map.Entry<String, Integer>>( players.entrySet() );
		   
		   Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
		      public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ){
		          return (o1.getValue()).compareTo( o2.getValue());
		      }
		   });
		   
		  Map.Entry<String, Integer> winner = list.get(2);
		  System.out.println("And the winner is " + winner.getKey() + " avec un score de: " + winner.getValue());

	}
}
