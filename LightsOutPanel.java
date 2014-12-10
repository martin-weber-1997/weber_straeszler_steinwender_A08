/**
 * 
 */
package weber_straeszler_steinwender_A08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.*;


/**
 * View Klasse des Spieles Lights Out
 * @author Jan-Philipp Steinwender
 * @version 10.12.2014
 */
public class LightsOutPanel extends JPanel{

	private LightsOutController con;
	private JButton[] buttons;
	private JPanel mitte;
	

	public LightsOutPanel(LightsOutController c) {
		this.con = c;
		this.setLayout(new BorderLayout());
		this.buttons = new JButton[25];
		
		JLabel textOben = new JLabel("Lights Out Game");
		textOben.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(textOben, BorderLayout.NORTH);
		
		//Buttons generieren und einfuegen
		initial();
		
		JButton restart = new JButton("New Game");
		restart.addActionListener(con);
		restart.setActionCommand("new");
		this.add(restart, BorderLayout.SOUTH);
		
		for(int i = 5; i< buttons.length; i+=6){
			this.buttons[i].setBackground(Color.WHITE);
		}
	}

	
	/**
	 * Methode zum generieren der Buttons
	 */
	public void initial() {
		mitte = new JPanel(new GridLayout(5, 5, 5, 5));
		
		for(int i = 0; i< buttons.length; i++){
			this.buttons[i] = new JButton();				//neue buttons
			this.buttons[i].setBackground(Color.BLACK);
			this.buttons[i].addActionListener(con);				//add actionlistener
			this.buttons[i].setActionCommand(""+i);
			mitte.add(buttons[i], BorderLayout.CENTER);			//add buttons ins label
		}

		this.add(mitte, BorderLayout.CENTER);
	}

}
