package coffeeSet;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class cardGame extends JFrame {
	private static final String RED = null;
	private JLabel item2;
	private JButton[] myButtons = new JButton[18];
	
	public cardGame(){ 
		setLayout(new FlowLayout());
		
		item2 = new JLabel();
		add(item2); 
		
		JFrame coffee = new JFrame();
			coffee.setTitle("Coffee Shop Set");
			coffee.setLayout(new GridLayout(3,5));
			coffee.setSize(1200,800);
			coffee.setLocationRelativeTo(null);
			coffee.setVisible(true);
			coffee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
	for(int i=0; i<18; i++)	{
        ImageIcon card = new ImageIcon();
		myButtons[i] = new JButton(card);
		coffee.add(myButtons[i]);
		}
		
		
	}//closes public cardGame
}//closes public class cardGame
