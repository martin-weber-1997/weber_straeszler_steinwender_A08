/**
 * 
 */
package weber_straeszler_steinwender_A08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * @author Martin, Jan-Philipp Steinwender
 *
 */
public class LightsOutController implements ActionListener {
	
	private LightsOutPanel panel;
	private LightsOutFrame frame;
	
	/**
	 * Standardkonstruktor
	 */
	public LightsOutController(){
		panel = new LightsOutPanel(this);
		frame = new LightsOutFrame("Lights Out Game", panel);
	}
	
	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

	public static void main(String[] args) {
		new LightsOutController();
	}
}
