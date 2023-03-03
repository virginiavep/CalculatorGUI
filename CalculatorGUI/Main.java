
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gibson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculatorGUI calcGUI = new CalculatorGUI();
        calcGUI.pack();
        calcGUI.setVisible(true);
        calcGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
