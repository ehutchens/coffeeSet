package coffeeSet;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Controller {
	public static void main (String [] args)
	{	
		CardDeck card = new CardDeck();
		JFrame shop = new JFrame();
		shop.getContentPane().setBackground(Color.DARK_GRAY );
		ImageIcon ii = new ImageIcon("coffee-shop.jpg");//displays the image, code borrowed from Stack Overflow
		JLabel lable = new JLabel(ii);
		JScrollPane jsp = new JScrollPane(lable);
    	shop.getContentPane().add(jsp);
    	shop.setSize(1200, 800);
    	shop.setLocationRelativeTo(null);
		shop.setTitle("Coffee Set");
		shop.setLocationRelativeTo(null);
		shop.setVisible(true);
		shop.setLayout(new FlowLayout());
		shop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel (new GridBagLayout());
    	shop.add(panel);
    GridBagConstraints c = new GridBagConstraints ();
    
    //making the button for the JFrame
    JButton button1 = new JButton("Start Game");
    	panel.add(button1, c);
    	button1.addActionListener (new Action1());
    
    JButton button2 = new JButton("Exit Game");
	panel.add(button2, c);
    button2.addActionListener (new Action2());
}
	static class Action1 implements ActionListener {        
		  public void actionPerformed (ActionEvent e) {  
			  cardGame run = new cardGame();
			  
		   	    } 
	}
		  
   static class Action2 implements ActionListener {        
			  public void actionPerformed (ActionEvent e) {     
		                System.exit(0);{
		             
		            }
			  }
   }
}