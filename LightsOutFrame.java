package weber_straeszler_steinwender_A08;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * Frame
 * fuer das frame des Programmes
 * 
 * @author Jan-Philipp Steinwender
 * @version 10.12.2014
 */
public class LightsOutFrame extends JFrame{

	public LightsOutFrame(String title, LightsOutPanel p) {
		super(title);					 						// Titel gesetzt
		this.add(p); 											// und im CENTER des JFrames verankern
		this.setSize(350, 415); 								// Gr��e 300x200 Pixel
		this.setResizable(false); 								// Gr��e nicht ver�nderbar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// Standardmethode beim Schlie�en des Fensters
		this.setVisible(true); 									// JFrame ist nun sichtbar
		this.setLocationRelativeTo(null); 						// Darstellung mittig am Bildschirm
	}

}
