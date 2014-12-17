/**
 * 
 */
package weber_straeszler_steinwender_A08;

import java.awt.*;
import javax.swing.*;


/**
 * View Klasse des Spieles Lights Out
 * @author Jan-Philipp Steinwender
 * @version 10.12.2014
 */
public class LightsOutPanel extends JPanel{

	private LightsOutController con;
	private JButton[][] buttons;
	private JPanel mitte;
	

	public LightsOutPanel(LightsOutController c) {
		this.con = c;
		this.setLayout(new BorderLayout());
		this.buttons = new JButton[5][5];
		
		//label oben
		JLabel textOben = new JLabel("Lights Out Game");
		textOben.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(textOben, BorderLayout.NORTH);
		
		//Buttons generieren und einfuegen
		initial();
		
		//button neustart
		JButton restart = new JButton("New Game");
		restart.addActionListener(con);
		restart.setActionCommand("neu");
		this.add(restart, BorderLayout.SOUTH);
		
//		//am anfang alle buttons (lights) ein
//		for(int i = 5; i< buttons.length; i+=6){
//			for(int j = 0; j<5; j++){
//				this.buttons[i][j].setBackground(Color.WHITE);
//			}
//		}
	}

	
	/**
	 * Methode zum generieren der Buttons
	 */
	public void initial() {
		mitte = new JPanel(new GridLayout(5, 5, 5, 5));
		
		//alle buttons / lichter aus
		for(int i = 0; i< buttons.length; i++){
			for(int j = 0; j<5; j++){
				this.buttons[i][j] = new JButton();				//neue buttons
				this.buttons[i][j].setBackground(Color.BLACK);
				this.buttons[i][j].addActionListener(con);				//add actionlistener
				this.buttons[i][j].setActionCommand(i+1+"/"+j);
				mitte.add(buttons[i][j], BorderLayout.CENTER);       //add buttons ins label
			}
		}
		
		//bestimmte buttons / lichter an
		//dummy

		this.add(mitte, BorderLayout.CENTER);
	}

	/**
	 * @return the buttons
	 */
	public JButton[][] getButtons() {
		return buttons;
	}


	
	/**
	 * aendert den zustand der buttons / lichter
	 * @param bu
	 */
	public void press(boolean[] position){
		//geht alle buttons / lichter durch
		for(int i = 0; i< buttons.length; i++){
			for(int j = 0; j<5; j++){
				
				//schaut ob es geaendert wurde
				if(position[i+j] == true){
					//aendert es
					if(buttons[i][j].getBackground() == Color.WHITE){
						buttons[i][j].setBackground(Color.BLACK);
					}else{
						buttons[i][j].setBackground(Color.WHITE);
					}
				}
			}
		}
		
		
	}
}
