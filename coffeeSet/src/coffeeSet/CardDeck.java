package coffeeSet;

import java.util.Arrays;
import java.util.Collections;

import javax.swing.ImageIcon;

public class CardDeck {
	final int cardDecklength = 81;
	 public static ImageIcon[] images = new ImageIcon[81];
	 
	 public CardDeck(){
	 	for(int i= 0; i < cardDecklength; i++) {
	 		images[i] = new ImageIcon(i + ".jpg");
	 	}
	 	
	 	for(int i=0; i<cardDecklength; i++){
	 		int r = i + (int) (Math.random() * (cardDecklength-i));
	 		ImageIcon t = images[r];
	 		images[r] = images[i];
	 		images[i] = t;
	 		//System.out.println(t);
	 	}
	 	
	}
}
