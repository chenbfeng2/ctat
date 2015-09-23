package newSubstraction;

import javax.swing.JPanel;
import edu.cmu.pact.BehaviorRecorder.Controller.CTAT_Launcher;
import pact.CommWidgets.JCommTextField;
import pact.CommWidgets.JCommTextArea;
import edu.cmu.pact.BehaviorRecorder.Controller.CTAT_Options;
import pact.CommWidgets.HorizontalLine;
import pact.CommWidgets.JCommLabel;
import java.awt.Font;
import pact.CommWidgets.JCommComboBox;

public class TwoDigitSubtraction extends JPanel {
	private CTAT_Options t_Options;
	private JCommTextField GivenNum1FirstDigit;
	private JCommTextField GivenNum1SecondDigit;
	private JCommTextField GivenNum2firstDigit;
	private JCommTextField GivenNum2SecondDigit;
	private HorizontalLine horizontalLine;
	private JCommLabel commLabel;
	private JCommTextField Borrow;
	private JCommTextField NumberAfterBorrow;
	private JCommTextField FirstDigitUpper;
	private JCommTextField FirstDigitLower;
	private JCommTextField SecondDigitLower;
	private JCommTextField ConvertedNumSecondUpper;
	private JCommTextField ConvertedNumFirstUpper;
	private JCommTextField ConvertedNumSecondLower;
	private JCommTextField ConvertedNumFirstLower;
	private JCommTextField FinalAnswerTensStripe;
	private JCommTextField FinalAnswerOnesStripe;
	private JCommLabel commLabel_1;
	private JCommLabel commLabel_2;
	private JCommLabel commLabel_3;
	private JCommLabel commLabel_4;
	private JCommLabel commLabel_5;
	private JCommLabel commLabel_6;
	private JCommLabel commLabel_7;
	private JCommLabel commLabel_8;
	private CTAT_Options t_Options_1;
	private JCommTextField commTextField;

	/**
	 * Create the panel.
	 */
	public TwoDigitSubtraction() {

		initComponents();
	}
	private void initComponents() {
		setLayout(null);
		
		t_Options = new CTAT_Options();
		t_Options.setBounds(174, 143, 1, 1);
		add(t_Options);
		
		GivenNum1FirstDigit = new JCommTextField();
		GivenNum1FirstDigit.setCommName("GivenNum1FirstDigit");
		GivenNum1FirstDigit.setBounds(55, 114, 33, 37);
		add(GivenNum1FirstDigit);
		
		GivenNum1SecondDigit = new JCommTextField();
		GivenNum1SecondDigit.setCommName("GivenNum1SecondDigit");
		GivenNum1SecondDigit.setBounds(87, 114, 33, 37);
		add(GivenNum1SecondDigit);
		
		GivenNum2firstDigit = new JCommTextField();
		GivenNum2firstDigit.setCommName("GivenNum2firstDigit");
		GivenNum2firstDigit.setBounds(55, 162, 33, 37);
		add(GivenNum2firstDigit);
		
		GivenNum2SecondDigit = new JCommTextField();
		GivenNum2SecondDigit.setCommName("GivenNum2SecondDigit");
		GivenNum2SecondDigit.setBounds(87, 162, 33, 37);
		add(GivenNum2SecondDigit);
		
		horizontalLine = new HorizontalLine();
		horizontalLine.setBounds(18, 211, 381, 10);
		add(horizontalLine);
		
		commLabel = new JCommLabel();
		commLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		commLabel.setCorrectFont(new Font("Dialog", Font.PLAIN, 9));
		commLabel.setText("-");
		commLabel.setBounds(41, 138, 23, 31);
		add(commLabel);
		
		Borrow = new JCommTextField();
		Borrow.setCommName("Borrow");
		Borrow.setBounds(187, 65, 33, 37);
		add(Borrow);
		
		NumberAfterBorrow = new JCommTextField();
		NumberAfterBorrow.setCommName("NumberAfterBorrow");
		NumberAfterBorrow.setBounds(187, 114, 33, 37);
		add(NumberAfterBorrow);
		
		FirstDigitUpper = new JCommTextField();
		FirstDigitUpper.setCommName("FirstDigitUpper");
		FirstDigitUpper.setBounds(220, 114, 33, 37);
		add(FirstDigitUpper);
		
		FirstDigitLower = new JCommTextField();
		FirstDigitLower.setCommName("FirstDigitLower");
		FirstDigitLower.setBounds(220, 162, 33, 37);
		add(FirstDigitLower);
		
		SecondDigitLower = new JCommTextField();
		SecondDigitLower.setCommName("SecondDigitLower");
		SecondDigitLower.setBounds(187, 162, 33, 37);
		add(SecondDigitLower);
		
		ConvertedNumSecondUpper = new JCommTextField();
		ConvertedNumSecondUpper.setCommName("ConvertedNumSecondUpper");
		ConvertedNumSecondUpper.setBounds(320, 114, 33, 37);
		add(ConvertedNumSecondUpper);
		
		ConvertedNumFirstUpper = new JCommTextField();
		ConvertedNumFirstUpper.setCommName("ConvertedNumFirstUpper");
		ConvertedNumFirstUpper.setBounds(355, 114, 33, 37);
		add(ConvertedNumFirstUpper);
		
		ConvertedNumSecondLower = new JCommTextField();
		ConvertedNumSecondLower.setCommName("ConvertedNumSecondLower");
		ConvertedNumSecondLower.setBounds(320, 162, 33, 37);
		add(ConvertedNumSecondLower);
		
		ConvertedNumFirstLower = new JCommTextField();
		ConvertedNumFirstLower.setCommName("ConvertedNumFirstLower");
		ConvertedNumFirstLower.setBounds(355, 162, 33, 37);
		add(ConvertedNumFirstLower);
		
		FinalAnswerTensStripe = new JCommTextField();
		FinalAnswerTensStripe.setCommName("FinalAnswerTensStripe");
		FinalAnswerTensStripe.setBounds(320, 233, 33, 37);
		add(FinalAnswerTensStripe);
		
		FinalAnswerOnesStripe = new JCommTextField();
		FinalAnswerOnesStripe.setCommName("FinalAnswerOnesStripe");
		FinalAnswerOnesStripe.setBounds(355, 233, 33, 37);
		add(FinalAnswerOnesStripe);
		
		commLabel_1 = new JCommLabel();
		commLabel_1.setText("=");
		commLabel_1.setBounds(139, 128, 23, 16);
		add(commLabel_1);
		
		commLabel_2 = new JCommLabel();
		commLabel_2.setText("=");
		commLabel_2.setBounds(139, 170, 23, 16);
		add(commLabel_2);
		
		commLabel_3 = new JCommLabel();
		commLabel_3.setText("=");
		commLabel_3.setBounds(265, 128, 23, 16);
		add(commLabel_3);
		
		commLabel_4 = new JCommLabel();
		commLabel_4.setText("=");
		commLabel_4.setBounds(265, 170, 23, 16);
		add(commLabel_4);
		
		commLabel_5 = new JCommLabel();
		commLabel_5.setText("Given Numbers");
		commLabel_5.setBounds(41, 69, 106, 33);
		add(commLabel_5);
		
		commLabel_6 = new JCommLabel();
		commLabel_6.setText("Borrows");
		commLabel_6.setBounds(174, 34, 78, 16);
		add(commLabel_6);
		
		commLabel_7 = new JCommLabel();
		commLabel_7.setText("Converted Numbers");
		commLabel_7.setBounds(277, 79, 146, 16);
		add(commLabel_7);
		
		commLabel_8 = new JCommLabel();
		commLabel_8.setText("Final Answer");
		commLabel_8.setBounds(292, 276, 105, 16);
		add(commLabel_8);
		
		t_Options_1 = new CTAT_Options();
		t_Options_1.setBounds(241, 247, 1, 1);
		add(t_Options_1);
		
		commTextField = new JCommTextField();
		commTextField.setEditable(true);
		commTextField.setBounds(284, 233, 34, 37);
		add(commTextField);
	}
	
	public static void main(String args[]) { 
		  new CTAT_Launcher(args).launch(new TwoDigitSubtraction());
		}
}