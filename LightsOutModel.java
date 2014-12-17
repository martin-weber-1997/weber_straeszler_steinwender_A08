package weber_straeszler_steinwender_A08;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;

/***
 * Model-Klasse des Spieles "Lights Out"
 * 
 * @author Lukas Straessler
 * @version 10.12.2014
 */
public class LightsOutModel {

	private boolean[][] field;
	private final int MAX_SIZE = 5;

	/**
	 * Konstruktor
	 */
	public LightsOutModel() {
		field = new boolean[MAX_SIZE][MAX_SIZE];
		init();
	}

	/**
	 * 
	 */
	public void init() {
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = false;
			}
		}
		firstRandomLight();
	}

	/**
	 * Die Anfangslichter die am Anfang des Spieles leuchten Das Spiel ist immer
	 * lösbar
	 * 
	 */
	private void firstRandomLight() {
		int press = (int) (Math.random() * 50);
		for (int i = 0; i < press; i++) {
			int row = (int) (Math.random() * MAX_SIZE);
			int column = (int) (Math.random() * MAX_SIZE);
			makeAMove(row, column);
		}

	}

	/**
	 * 
	 * 
	 */
	private boolean[][] makeAMove(int row, int column) {

		if (column != 0)
			field[row][column - 1] = !field[row][column - 1];
		if (column != MAX_SIZE)
			field[row][column + 1] = !field[row][column + 1];
		if (row != 0)
			field[row - 1][column] = !field[row - 1][column];
		if (row != MAX_SIZE)
			field[row + 1][column] = !field[row + 1][column];

		return field;
	}

	// /**
	// * Ueberprueft ob alle Lichter aus sind
	// * @return boolean
	// */
	// private boolean hasWon(){
	// for(int i = 0; i<5; i++){
	// for(int j = 0; j<5; j++){
	// if(p.getButtons()[i][j].getBackground() == Color.BLACK){
	//
	// }else{
	// return false;
	// }
	// }
	// }
	// return true;
	// }

	// /**
	// * Setzt den Button-Array wieder zurueck
	// * In Controller
	// */
	// private void newGame(){
	// for(int i = 0; i<5; i++){
	// for(int j = 0; j<5; j++){
	// p.getButtons()[i][j].setBackground(Color.BLACK);
	// }
	// }
	// firstRandomLight();
	// }

}
