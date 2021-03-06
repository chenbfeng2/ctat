/*
 * TutorTemplate.java
 *
 * Created on October 18, 2005, 5:33 PM
 */

package FractionAdditionTutor;

import edu.cmu.pact.Utilities.trace;
import edu.cmu.pact.BehaviorRecorder.Controller.CTAT_Launcher;

/**
 *
 * @author  mpschnei
 */
public class FractionAddition extends javax.swing.JPanel {
    
    /** Creates new form TutorTemplate */
    public FractionAddition() {
        initComponents();
        if (trace.getDebugCode("inter")) trace.out("inter", "FractionAddition.hint "+hint);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cTAT_Options1 = new edu.cmu.pact.BehaviorRecorder.Controller.CTAT_Options();
        hint = new pact.CommWidgets.JCommButton();
        unreducedDenom = new pact.CommWidgets.JCommTextField();
        givenNum1 = new pact.CommWidgets.JCommTextField();
        givenDenom1 = new pact.CommWidgets.JCommTextField();
        givenNum2 = new pact.CommWidgets.JCommTextField();
        givenDenom2 = new pact.CommWidgets.JCommTextField();
        finalNum = new pact.CommWidgets.JCommTextField();
        finalDenom = new pact.CommWidgets.JCommTextField();
        convertNum1 = new pact.CommWidgets.JCommTextField();
        convertDenom1 = new pact.CommWidgets.JCommTextField();
        convertNum2 = new pact.CommWidgets.JCommTextField();
        convertDenom2 = new pact.CommWidgets.JCommTextField();
        unreducedNum = new pact.CommWidgets.JCommTextField();
        horizontalLine1 = new pact.CommWidgets.HorizontalLine();
        horizontalLine2 = new pact.CommWidgets.HorizontalLine();
        horizontalLine3 = new pact.CommWidgets.HorizontalLine();
        horizontalLine6 = new pact.CommWidgets.HorizontalLine();
        horizontalLine7 = new pact.CommWidgets.HorizontalLine();
        commLabel1 = new pact.CommWidgets.JCommLabel();
        commLabel2 = new pact.CommWidgets.JCommLabel();
        commLabel3 = new pact.CommWidgets.JCommLabel();
        commLabel4 = new pact.CommWidgets.JCommLabel();
        commLabel5 = new pact.CommWidgets.JCommLabel();
        commLabel6 = new pact.CommWidgets.JCommLabel();
        commLabel7 = new pact.CommWidgets.JCommLabel();
        commLabel8 = new pact.CommWidgets.JCommLabel();
        horizontalLine5 = new pact.CommWidgets.HorizontalLine();
        horizontalLine4 = new pact.CommWidgets.HorizontalLine();
        horizontalLine8 = new pact.CommWidgets.HorizontalLine();
        done = new pact.CommWidgets.JCommButton();

        cTAT_Options1.setInterfaceHeight(490);
        cTAT_Options1.setInterfaceWidth(400);
        cTAT_Options1.setSeparateHintWindow(true);
	add(cTAT_Options1);

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(490, 340));
        setLayout(null);

        hint.setText("?");
		hint.setCommName("hint");
        add(hint);
        hint.setBounds(245, 5, 45, 30);

        unreducedDenom.setFont(new java.awt.Font("Arial", 0, 18));
		unreducedDenom.setCommName("unreducedDenom");
        add(unreducedDenom);
        unreducedDenom.setBounds(180, 325, 40, 35);

        givenNum1.setBackground(new java.awt.Color(255, 255, 255));
        givenNum1.setFont(new java.awt.Font("Arial", 0, 18));
		givenNum1.setCommName("givenNum1");
        add(givenNum1);
        givenNum1.setBounds(80, 80, 40, 35);

        givenDenom1.setBackground(new java.awt.Color(255, 255, 255));
        givenDenom1.setFont(new java.awt.Font("Arial", 0, 18));
		givenDenom1.setCommName("givenDenom1");
        add(givenDenom1);
        givenDenom1.setBounds(80, 125, 40, 35);

        givenNum2.setBackground(new java.awt.Color(255, 255, 255));
        givenNum2.setFont(new java.awt.Font("Arial", 0, 18));
		givenNum2.setCommName("givenNum2");
        add(givenNum2);
        givenNum2.setBounds(80, 180, 40, 35);

        givenDenom2.setBackground(new java.awt.Color(255, 255, 255));
        givenDenom2.setFont(new java.awt.Font("Arial", 0, 18));
		givenDenom2.setCommName("givenDenom2");
        add(givenDenom2);
        givenDenom2.setBounds(80, 225, 40, 35);

        finalNum.setFont(new java.awt.Font("Arial", 0, 18));
		finalNum.setCommName("finalNum");
        add(finalNum);
        finalNum.setBounds(280, 280, 40, 35);

        finalDenom.setFont(new java.awt.Font("Arial", 0, 18));
		finalDenom.setCommName("finalDenom");
        add(finalDenom);
        finalDenom.setBounds(280, 325, 40, 35);

        convertNum1.setFont(new java.awt.Font("Arial", 0, 18));
		convertNum1.setCommName("convertNum1");
        add(convertNum1);
        convertNum1.setBounds(180, 80, 40, 35);

        convertDenom1.setFont(new java.awt.Font("Arial", 0, 18));
		convertDenom1.setCommName("convertDenom1");
        add(convertDenom1);
        convertDenom1.setBounds(180, 125, 40, 35);

        convertNum2.setFont(new java.awt.Font("Arial", 0, 18));
		convertNum2.setCommName("convertNum2");
        add(convertNum2);
        convertNum2.setBounds(180, 180, 40, 35);

        convertDenom2.setFont(new java.awt.Font("Arial", 0, 18));
		convertDenom2.setCommName("convertDenom2");
        add(convertDenom2);
        convertDenom2.setBounds(180, 225, 40, 35);

        unreducedNum.setFont(new java.awt.Font("Arial", 0, 18));
		unreducedNum.setCommName("unreducedNum");
        add(unreducedNum);
        unreducedNum.setBounds(180, 280, 40, 35);
        add(horizontalLine1);
        horizontalLine1.setBounds(75, 120, 50, 10);
        add(horizontalLine2);
        horizontalLine2.setBounds(75, 220, 50, 10);
        add(horizontalLine3);
        horizontalLine3.setBounds(275, 320, 50, 10);
        add(horizontalLine6);
        horizontalLine6.setBounds(175, 320, 50, 10);
        add(horizontalLine7);
        horizontalLine7.setBounds(50, 270, 200, 10);

        commLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        commLabel1.setIncorrectFont(new java.awt.Font("#GungSeo", 0, 10));
        commLabel1.setText("Final Answer");
		commLabel1.setCommName("commLabel1");
        add(commLabel1);
        commLabel1.setBounds(270, 350, 100, 60);

        commLabel2.setFont(new java.awt.Font("MS Sans Serif", 0, 24));
        commLabel2.setText("+");
		commLabel2.setCommName("commLabel2");
        add(commLabel2);
        commLabel2.setBounds(30, 140, 50, 60);

        commLabel3.setFont(new java.awt.Font("MS Sans Serif", 0, 18));
        commLabel3.setText("=");
		commLabel3.setCommName("commLabel3");
        add(commLabel3);
        commLabel3.setBounds(145, 90, 20, 60);

        commLabel4.setFont(new java.awt.Font("MS Sans Serif", 0, 18));
        commLabel4.setText("=");
		commLabel4.setCommName("commLabel4");
        add(commLabel4);
        commLabel4.setBounds(145, 190, 20, 60);

        commLabel5.setFont(new java.awt.Font("MS Sans Serif", 0, 18));
        commLabel5.setText("=");
		commLabel5.setCommName("commLabel5");
        add(commLabel5);
        commLabel5.setBounds(245, 290, 20, 60);

        commLabel6.setFont(new java.awt.Font("Arial", 1, 12));
        commLabel6.setIncorrectFont(new java.awt.Font("#GungSeo", 0, 10));
        commLabel6.setText("Given Fractions");
		commLabel6.setCommName("commLabel6");
        add(commLabel6);
        commLabel6.setBounds(50, 30, 90, 60);

        commLabel7.setFont(new java.awt.Font("Arial", 1, 12));
        commLabel7.setIncorrectFont(new java.awt.Font("#GungSeo", 0, 10));
        commLabel7.setText("Converted Fractions");
		commLabel7.setCommName("commLabel7");
        add(commLabel7);
        commLabel7.setBounds(150, 30, 120, 60);

        commLabel8.setFont(new java.awt.Font("Arial", 1, 12));
        commLabel8.setIncorrectFont(new java.awt.Font("#GungSeo", 0, 10));
        commLabel8.setText("Unreduced Answer");
		commLabel8.setCommName("commLabel8");
        add(commLabel8);
        commLabel8.setBounds(140, 350, 120, 60);
        add(horizontalLine5);
        horizontalLine5.setBounds(75, 120, 50, 10);
        add(horizontalLine4);
        horizontalLine4.setBounds(175, 120, 50, 10);
        add(horizontalLine8);
        horizontalLine8.setBounds(175, 220, 50, 10);

        done.setText("Done");
		done.setCommName("done");
        add(done);
        done.setBounds(295, 5, 80, 30);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String[] argv) {
        new CTAT_Launcher(argv).launch(new FractionAddition());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.cmu.pact.BehaviorRecorder.Controller.CTAT_Options cTAT_Options1;
    private pact.CommWidgets.JCommTextField convertDenom1;
    private pact.CommWidgets.JCommTextField convertDenom2;
    private pact.CommWidgets.JCommTextField convertNum1;
    private pact.CommWidgets.JCommTextField convertNum2;
    private pact.CommWidgets.JCommButton done;
    private pact.CommWidgets.JCommLabel commLabel1;
    private pact.CommWidgets.JCommLabel commLabel2;
    private pact.CommWidgets.JCommLabel commLabel3;
    private pact.CommWidgets.JCommLabel commLabel4;
    private pact.CommWidgets.JCommLabel commLabel5;
    private pact.CommWidgets.JCommLabel commLabel6;
    private pact.CommWidgets.JCommLabel commLabel7;
    private pact.CommWidgets.JCommLabel commLabel8;
    private pact.CommWidgets.JCommTextField finalDenom;
    private pact.CommWidgets.JCommTextField finalNum;
    private pact.CommWidgets.JCommTextField givenDenom1;
    private pact.CommWidgets.JCommTextField givenDenom2;
    private pact.CommWidgets.JCommTextField givenNum1;
    private pact.CommWidgets.JCommTextField givenNum2;
    private pact.CommWidgets.JCommButton hint;
    private pact.CommWidgets.HorizontalLine horizontalLine1;
    private pact.CommWidgets.HorizontalLine horizontalLine2;
    private pact.CommWidgets.HorizontalLine horizontalLine3;
    private pact.CommWidgets.HorizontalLine horizontalLine4;
    private pact.CommWidgets.HorizontalLine horizontalLine5;
    private pact.CommWidgets.HorizontalLine horizontalLine6;
    private pact.CommWidgets.HorizontalLine horizontalLine7;
    private pact.CommWidgets.HorizontalLine horizontalLine8;
    private pact.CommWidgets.JCommTextField unreducedDenom;
    private pact.CommWidgets.JCommTextField unreducedNum;
    // End of variables declaration//GEN-END:variables
    
}
