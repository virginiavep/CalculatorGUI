
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorGUI extends JFrame implements ActionListener {
//fields
private JLabel calculateLabel;
private JButton AddButton;
private JButton SubtractButton;
private JButton MultiplyButton;
private JButton DivideButton;
private JTextField userInputA;
private JTextField userInputB;
private JTextField result;


CalculatorGUI(){
    GridBagConstraints positionConst = null;
    
    setTitle("CalculatorGUI");

    setLayout(new GridBagLayout());
    
    positionConst = new GridBagConstraints();
    positionConst.gridx = 0;
    positionConst.gridy = 0;
    positionConst.insets = new Insets(10,10,10,10);
    
    calculateLabel = new JLabel("Calculate");
    
    add(calculateLabel, positionConst);
    
    AddButton = new JButton("Add Button");
    positionConst = new GridBagConstraints();
    positionConst.gridx = 0;
    positionConst.gridy = 2;
    positionConst.insets = new Insets(10,10,10,10);
    add(AddButton, positionConst);
    AddButton.addActionListener(this);
    
    SubtractButton = new JButton("Subtract Button");
    positionConst = new GridBagConstraints();
    positionConst.gridx = 0;
    positionConst.gridy = 3;
    positionConst.insets = new Insets(10,10,10,10);
    add(SubtractButton, positionConst);
    SubtractButton.addActionListener(new SubtractListener());
    
    MultiplyButton = new JButton("Multiply Button");
    positionConst = new GridBagConstraints();
    positionConst.gridx = 0;
    positionConst.gridy = 4;
    positionConst.insets = new Insets(10,10,10,10);
    add(MultiplyButton, positionConst);
    MultiplyButton.addActionListener(new MultiplyListener());
    
    DivideButton = new JButton("Divide Button");
    positionConst = new GridBagConstraints();
    positionConst.gridx = 0;
    positionConst.gridy = 5;
    positionConst.insets = new Insets(10,10,10,10);
    add(DivideButton, positionConst);
    DivideButton.addActionListener(new DivideListener());
 
    userInputA = new JTextField();
    userInputB = new JTextField();
    result = new JTextField();
    
    userInputA.setPreferredSize(new Dimension(100,20));
    userInputA.setMinimumSize(userInputA.getPreferredSize());
    
    userInputB.setPreferredSize(new Dimension(100,20));
    userInputB.setMinimumSize(userInputA.getPreferredSize());
    
    result.setPreferredSize(new Dimension(100,20));
    result.setMinimumSize(userInputA.getPreferredSize());
    
    positionConst = new GridBagConstraints();
    positionConst.gridx = 0;
    positionConst.gridy = 1;
    positionConst.insets = new Insets(10,10,10,10);
    add(userInputA, positionConst);

    positionConst = new GridBagConstraints();
    positionConst.gridx = 1;
    positionConst.gridy = 1;
    positionConst.insets = new Insets(10,10,10,10);
    add(userInputB, positionConst);
    
    positionConst = new GridBagConstraints();
    positionConst.gridx = 1;
    positionConst.gridy = 5;
    positionConst.insets = new Insets(10,10,10,10);
    add(result, positionConst);
    
    userInputA.setEditable(true);
    userInputB.setEditable(true);
    
    
}  
public void actionPerformed(ActionEvent e){
    try{
    double inputA =  Double.parseDouble(userInputA.getText());
    double inputB =  Double.parseDouble(userInputB.getText());
    double result1;
    
    AddButton.setText("Add");
    
    result1 = inputA + inputB;
    result.setText(Double.toString(result1));
    }
    catch (NumberFormatException ex)
    {
        result.setText("Numbers only!");
    }
}
class SubtractListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {// do stuff}}
    try{
    double inputA =  Double.parseDouble(userInputA.getText());
    double inputB =  Double.parseDouble(userInputB.getText());
    double result1;
    
    SubtractButton.setText("Subtract");
    
    result1 = inputA - inputB;
    result.setText(Double.toString(result1));
    }
    catch (NumberFormatException ex)
      {
        result.setText("Numbers only!");
      }
    }
  }
class MultiplyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {// do stuff}}
    try{
    double inputA =  Double.parseDouble(userInputA.getText());
    double inputB =  Double.parseDouble(userInputB.getText());
    double result1;
    
    MultiplyButton.setText("Multiply");
    
    result1 = inputA * inputB;
    result.setText(Double.toString(result1));
    }
    catch (NumberFormatException ex)
      {
        result.setText("Numbers only!");
      }
    }
  }
class DivideListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {// do stuff}}
    try{
    double inputA =  Double.parseDouble(userInputA.getText());
    double inputB =  Double.parseDouble(userInputB.getText());
    double result1;
    
    DivideButton.setText("Divide");
    
    result1 = inputA / inputB;
    result.setText(Double.toString(result1));
    }
    catch (NumberFormatException ex)
      {
        result.setText("Numbers only!");
      }
    }
  }
}

