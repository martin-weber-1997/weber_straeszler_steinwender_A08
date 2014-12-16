package weber_straeszler_steinwender_A08;

import java.awt.Color;
import java.util.ArrayList;

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
	public LightsOutModel(){
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
	private int[] firstRandomLight(){
		int lights = (int)Math.random() * (5 - 1) + 1;
		ArrayList<Integer> usedLights = new ArrayList();
		usedLights.add(6);
		int[] firstLights = new int[(lights*2) -1];
		int i = 0;
		
		while(i<lights){
			int firstLight1 = (int)Math.random() * (25 - 1) + 1;
			int firstLight2 = (int)Math.random() * (25 - 1) + 1;
			boolean isAllreadyUsed = false;
			for(int j = 0; j<usedLights.size(); j++){
				if(firstLight1 == usedLights.get(j) || firstLight2 == usedLights.get(j)){//Ueberprüfung ob die Lichter schon leuchten
					isAllreadyUsed = true;
					break;
				}
			}
			
			if(isAllreadyUsed != true){//Wenn sie nocht nicht im Array stehen, werden sie hier ihm hinzugefuegt und der usedLights-List hinzugefuegt, damit sie spaeter nicht nochmal hinzugefuegt werden
				firstLights[i] = firstLight1;
				firstLights[i+1] = firstLight2;
				usedLights.add(firstLight1);
				usedLights.add(firstLight2);
				i++;
			}
			
		}
		return firstLights;
	}

	/**
	 * Ueberpruefung ob der Zug moeglich ist
	 * Wenn ja, dann wird ein Integer-Array mit den zu aendernden Buttons zurueck gegeben
	 * @param z
	 * @return JButton
	 */
	private int[] makeAMove(int z){
		String button = Integer.toString(z);
		String[] b = button.split("/");
		int row = Integer.parseInt(b[0]);
		int column = Integer.parseInt(b[1]);
		int[] buttonToChange;
		
		if(row == 2 || row == 3 || row == 4 && column == 1){
			buttonToChange = new int[8];
			buttonToChange[0] = row+1;
			buttonToChange[1] = column;
			buttonToChange[2] = row-1;
			buttonToChange[3] = column;
			buttonToChange[4] = row;
			buttonToChange[5] = column+1;
			buttonToChange[6] = row;
			buttonToChange[7] = column;
		}else if(row == 2 || row == 3 || row == 4 && column == 5){
			buttonToChange = new int[8];
			buttonToChange[0] = row+1;
			buttonToChange[1] = column;
			buttonToChange[2] = row-1;
			buttonToChange[3] = column;
			buttonToChange[4] = row;
			buttonToChange[5] = column-1;
			buttonToChange[6] = row;
			buttonToChange[7] = column;
		}else if(column == 2 || column == 3 || column == 4 && row == 1){
			buttonToChange = new int[8];
			buttonToChange[0] = row+1;
			buttonToChange[1] = column;
			buttonToChange[2] = row;
			buttonToChange[3] = column;
			buttonToChange[4] = row;
			buttonToChange[5] = column+1;
			buttonToChange[6] = row;
			buttonToChange[7] = column-1;
		}else if(column == 2 || column == 3 || column == 4 && row == 5){
			buttonToChange = new int[8];
			buttonToChange[0] = row;
			buttonToChange[1] = column;
			buttonToChange[2] = row-1;
			buttonToChange[3] = column;
			buttonToChange[4] = row;
			buttonToChange[5] = column+1;
			buttonToChange[6] = row;
			buttonToChange[7] = column-1;
		}else if(row == 1 && column == 1){
			buttonToChange = new int[6];
			buttonToChange[0] = row;
			buttonToChange[1] = column;
			buttonToChange[2] = row+1;
			buttonToChange[3] = column;
			buttonToChange[4] = row;
			buttonToChange[5] = column+1;
		}else if(row == 5 && column == 1){
			buttonToChange = new int[6];
			buttonToChange[0] = row;
			buttonToChange[1] = column;
			buttonToChange[2] = row-1;
			buttonToChange[3] = column;
			buttonToChange[4] = row;
			buttonToChange[5] = column+1;
		}else if(row == 1 && column == 5){
			buttonToChange = new int[6];
			buttonToChange[0] = row;
			buttonToChange[1] = column;
			buttonToChange[2] = row+1;
			buttonToChange[3] = column;
			buttonToChange[4] = row;
			buttonToChange[5] = column-1;
		}else if(row == 5 && column == 5){
			buttonToChange = new int[6];
			buttonToChange[0] = row;
			buttonToChange[1] = column;
			buttonToChange[2] = row-1;
			buttonToChange[3] = column;
			buttonToChange[4] = row;
			buttonToChange[5] = column-1;
		}else{
			buttonToChange = new int[10];
			buttonToChange[0] = row;
			buttonToChange[1] = column;
			buttonToChange[2] = row+1;
			buttonToChange[3] = column;
			buttonToChange[4] = row-1;
			buttonToChange[5] = column;
			buttonToChange[6] = row;
			buttonToChange[7] = column+1;
			buttonToChange[8] = row;
			buttonToChange[9] = column-1;
		}
		
		
		
		return buttonToChange;
	}
	
//	/**
//	 * Ueberprueft ob alle Lichter aus sind
//	 * @return boolean
//	 */
//	private boolean hasWon(){
//		for(int i = 0; i<5; i++){
//			for(int j = 0; j<5; j++){
//				if(p.getButtons()[i][j].getBackground() == Color.BLACK){
//					
//				}else{
//					return false;
//				}
//			}
//		}
//		return true;
//	}
	
//	/**
//	 * Setzt den Button-Array wieder zurueck
//	 * In Controller
//	 */
//	private void newGame(){
//		for(int i = 0; i<5; i++){
//			for(int j = 0; j<5; j++){
//				p.getButtons()[i][j].setBackground(Color.BLACK);
//			}
//		}
//		firstRandomLight();
//	}

}
