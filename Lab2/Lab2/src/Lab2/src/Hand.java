package Lab2.src;

import java.util.ArrayList;

public class Hand extends Deck{
	public static void Hand(){
		ArrayList<String> hand1= new ArrayList<String>();
		for (int i = 0; i < 7; i++){
			hand1.add(Deck.draw());
			}
		System.out.print(hand1);
	}
	public static int Ranker(Hand ahand){
		return 0;
		
	}
}