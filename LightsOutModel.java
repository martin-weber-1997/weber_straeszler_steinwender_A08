package weber_straeszler_steinwender_A08;
/***
 * Model-Klasse des Spieles "Lights Out" 
 * @author Lukas Straessler
 * @version 10.12.2014
 */
public class LightsOutModel {
	
	private boolean[][] field;
	
	/**
	 * Konstruktor
	 */
	public LightsOutModel(){
		
	}
	
	/**
	 * Das Annfangslicht das am Anfang des Spieles leuchtet
	 * @param row
	 * @param colum
	 */
	private void firstRandomLight(int row, int column){
		
	}
	
	/**
	 * Kontrolliert ob das jeweilige Licht leuchtet
	 * @return
	 */
	private boolean light(int row, int column){
		return true;
	}
	
	/**
	 * Die Parameter ist das Licht auf das der Spieler gedrückt hat
	 * Hier werden nun die jeweiligen angrenzenten Lichter ein/ausgeschaltet
	 * @param row
	 * @param colum
	 */
	private void makeAMove(int row, int column){
		
	}
	
	/**
	 * Überprüft ob alle Lichter aus sind
	 * @return
	 */
	private boolean hasWon(){
		return true;
	}

}
