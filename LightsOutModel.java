package weber_straeszler_steinwender_A08;

import java.awt.Color;

import javax.swing.JButton;

/***
 * Model-Klasse des Spieles "Lights Out" 
 * @author Lukas Straessler
 * @version 10.12.2014
 */
public class LightsOutModel {
	
	private byte[][] field;
	
	/**
	 * Konstruktor
	 */
	public LightsOutModel(LightsOutPanel p){
		field = new byte[5][5];
		
		for(int i = 0; i<5; i++){
			for(int j = 0; j<5; j++){
				field[i][j] = 0;
			}
		}
	}
	
	/**
	 * Das Anfangslicht das am Anfang des Spieles leuchtet
	 * @param row
	 * @param column
	 */
	private JButton[] firstRandomLight(){
		int firstLight1 = (int)Math.random() * (25 - 1) + 1;
		int firstLight2 = (int)Math.random() * (25 - 1) + 1;
		return JButton
	}

	/**
	 * Ueberpruefung ob der Zug moeglich ist
	 * Wenn ja, dann wird ein JButton-Array mit den zu ändernden Buttons zurueck gegeben
	 * @param z
	 * @return JButton
	 */
	private JButton[] makeAMove(int z){
		if(){
			
		}else{


		}
		//return JButton[];
	}
	
	/**
	 * Ueberprueft ob alle Lichter aus sind
	 * @return boolean
	 */
	private boolean hasWon(){
		for(int i = 0; i<5; i++){
			for(int j = 0; j<5; j++){
				if(p.getButtons()[i][j].getBackground() == Color.BLACK){
					
				}else{
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Setzt den Button-Array wieder zurueck
	 * In Controller
	 */
	private void newGame(){
		for(int i = 0; i<5; i++){
			for(int j = 0; j<5; j++){
				p.getButtons()[i][j].setBackground(Color.BLACK);
			}
		}
		firstRandomLight();
	}

}
