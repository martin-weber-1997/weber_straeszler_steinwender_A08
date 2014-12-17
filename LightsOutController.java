/**
 * 
 */
package weber_straeszler_steinwender_A08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Martin Weber, Jan-Philipp Steinwender
 * @version 17.12.2014
 */
public class LightsOutController implements ActionListener {

	private LightsOutPanel panel;
	private LightsOutFrame frame;
	private LightsOutModel model;

	/**
	 * Standardkonstruktor
	 */
	public LightsOutController() {
		panel = new LightsOutPanel(this);
		frame = new LightsOutFrame("Lights Out Game", panel);
		model = new LightsOutModel();
		panel.press(model.getField());
	}

	/**
	 * Aktionen im Panel werden verwaltet
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		String s2 = e.getActionCommand();
		if (s2.equals("neu")) {
			model.init();
			panel.press(model.getField());
		} else {
			String tmp[] = s2.split("/");
			int row = Integer.parseInt(tmp[0]) - 1;
			int column = Integer.parseInt(tmp[1]);
			panel.press(model.makeAMove(row, column));
			if (model.isWin()) {
				panel.win();
			}
		}

	}

	public static void main(String[] args) {
		new LightsOutController();
	}
}
