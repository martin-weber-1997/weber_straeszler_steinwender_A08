/**
 * 
 */
package weber_straeszler_steinwender_A08;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



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
	public void actionPerformed(ActionEvent e) {
		
		//schaut ob ein button gedrueckt wurde
		String s2 = e.getActionCommand();
		try{
			int z = Integer.parseInt(s2);		//zahl vom feld das gedrueckt wurde
			
			if(z <55 && z>=0){
				//panel.press(model.makeAMove(gedrueckter button also z))
				
//				JButton temp = (JButton) e.getSource();
//				panel.press(temp);
				System.out.println(z);
			}
		} catch (NumberFormatException n){ 
			System.out.println("keine Zahl / kein button gedrueckt");
		}
		
		
		
		
	}

	public static void main(String[] args) {
		new LightsOutController();
	}
}
