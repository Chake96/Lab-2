package Lab2.src;

import java.util.Arrays;
import java.util.Collections;

public class Deck extends Card{
	
	public String[] fullDeck = new String[]{};
	
	public void makeHearts(){
		for (int i = 1; i <= 13; i++){
			fullDeck[i] = Rank[i]+ ", Hearts";
		}
	}
	public void makeSpades(){
		for (int i = 1; i <= 13; i++){
			fullDeck[i] = Rank[i]+ ", Spades";
		}
	}
	public void makeDiamonds(){
		for (int i = 1; i <= 13; i++){
			fullDeck[i] = Rank[i]+ ", Diamonds";
		}
	}
	public void makeClubs(){
		for (int i = 1; i <= 13; i++){
			fullDeck[i] = Rank[i]+ ", Clubs";
		}
	}
	
	public void shuffleDeck(){
		Collections.shuffle(Arrays.asList(fullDeck));
	}
	
	public void makeDeck(){
		makeClubs();
		makeHearts();
		makeSpades();
		makeDiamonds();	
		shuffleDeck();
	}
	
	public String draw(){
		
		return null ;
		
	}
	
	public int cardsLeft(){
		return fullDeck.length;
	}
	
	
}
