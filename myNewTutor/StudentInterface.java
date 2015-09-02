package myNewTutor;

import javax.swing.JPanel;
import edu.cmu.pact.BehaviorRecorder.Controller.CTAT_Launcher;
public class StudentInterface extends JPanel {

	/**
	 * Create the panel.
	 */
	public StudentInterface() {

	}
	
	public static void main(String args[]) { 
		  new CTAT_Launcher(args).launch(new StudentInterface());
		}

}
