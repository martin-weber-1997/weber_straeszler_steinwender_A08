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
	private LightsOutPanel p;
	
	/**
	 * Konstruktor
	 */
	public LightsOutModel(LightsOutPanel p){
		field = new byte[5][5];
		this.p = p;
		
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
	private void firstRandomLight(){
		int firstLight1 = (int)Math.random() * (25 - 1) + 1;
		int firstLight2 = (int)Math.random() * (25 - 1) + 1;
		p.getButtons()[firstLight1][firstLight2].setBackground(Color.WHITE);
	}
	
	/**
	 * Kontrolliert ob das jeweilige Licht leuchtet
	 * @return boolean light
	 */
	private boolean light(int row, int column){
		boolean light = false;
		if(p.getButtons()[row][column].getBackground() == Color.WHITE){
			light = true;
		}
		return light;
	}
	
	/**
	 * Die Parameter ist das Licht auf das der Spieler gedrueckt hat
	 * Hier werden nun die jeweiligen angrenzenten Lichter ein/ausgeschaltet
	 * @param row
	 * @param column
	 */
	private void makeAMove(int row, int column){
		if(light(row,column) == true){
			
		}else{
			p.press(p.getButtons()[row][column]);
			p.press(p.getButtons()[row+1][column]);
			p.press(p.getButtons()[row-1][column]);
			p.press(p.getButtons()[row][column+1]);
			p.press(p.getButtons()[row][column-1]);
			
//			p.getButtons()[row][column].setBackground(Color.WHITE);
//			p.getButtons()[row+1][column].setBackground(Color.BLACK);
//			p.getButtons()[row-1][column].setBackground(Color.BLACK);
//			p.getButtons()[row][column+1].setBackground(Color.BLACK);
//			p.getButtons()[row][column-1].setBackground(Color.BLACK);
		}
		//return JButton[] b1;
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
	 * Setzt den Button-Array wieder zurück
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
