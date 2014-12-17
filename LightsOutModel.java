package weber_straeszler_steinwender_A08;

/**
 * Model-Klasse des Spieles "Lights Out"
 * 
 * @author Martin Weber, (Lukas Straessler)
 * @version 17.12.2014
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
	
	public LightsOutModel(int size){
		field = new boolean[size][size];
		init();
	}

	/**
	 * Wird bei Start und neustart eines Spiels Aufgerufen
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
	 * loesbar
	 * 
	 */
	private void firstRandomLight() {
		int press = (int) (Math.random() * 49) + 1;
		while (isWin()) {
			for (int i = 0; i < press; i++) {
				int row = (int) (Math.random() * field.length);
				int column = (int) (Math.random() * field.length);
				makeAMove(row, column);
			}
		}

	}

	/**
	 * bekommt als Parameter die Zeile und Spalte in der Der Button gedrueckt
	 * wurde gibt das Array mit den logischen Werten fuer Licht ein und aus
	 * zurueck
	 * 
	 * @param row
	 * @param column
	 * @return
	 */
	public boolean[][] makeAMove(int row, int column) {
		field[row][column] = !field[row][column];

		if (column != 0)
			field[row][column - 1] = !field[row][column - 1];
		if (column != field.length - 1)
			field[row][column + 1] = !field[row][column + 1];
		if (row != 0)
			field[row - 1][column] = !field[row - 1][column];
		if (row != field.length - 1)
			field[row + 1][column] = !field[row + 1][column];

		return field;
	}

	/**
	 * ueberprueft ob alle Lichter aus sind und gewonnen wurde
	 * 
	 * @return
	 */
	public boolean isWin() {
		boolean win = true;
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (field[i][j]) {
					win = false;
				}
			}
		}
		return win;

	}

	/**
	 * @return the field
	 */
	public boolean[][] getField() {
		return field;
	}

	/**
	 * @param field
	 *            the field to set
	 */
	public void setField(boolean[][] field) {
		this.field = field;
	}

	/**
	 * @return the mAX_SIZE
	 */
	public int getMAX_SIZE() {
		return MAX_SIZE;
	}

}
