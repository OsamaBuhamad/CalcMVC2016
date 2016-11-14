import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * 
 * @author Osama Buhamad
 * Student Number: 100870537
 *
 */

/**
 * When CREATING BUTTONS OR TEXT FIELDS DONT FORGET TO ADD addActionListner and setActionCommand
 * Then Create getButton methods and read them in the Controller --> compare in the ActionPerformed 
 * @author osamabuhamad
 *
 */
public class View extends JFrame implements Observer{
	private JFrame f;
	private JPanel panel;
	private JTextField firstNum,secondNum;
	private JRadioButton addButton, subButton,multButton,divButton;
	private Controller action;

	private JTextField result;
	private JLabel firstNumLabel,secondNumLabel;

	
	public View(Controller action){
		this.action=action;
		f = new JFrame("Calculator");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setSize(150, 280);
		f.setLayout(new BorderLayout());
		
		
		
		panel = new JPanel(); 
		//panel.setLayout(new GridLayout(4,2));
		panel.setLayout(new FlowLayout(6));
		//for the text area
		firstNum = new JTextField(10);
		firstNum.setActionCommand("firstNum");
		firstNum.addActionListener(this.action);
		firstNumLabel = new JLabel("First Number: ");
		
		secondNum = new JTextField(10);
		secondNum.setActionCommand("secondName");
		secondNum.addActionListener(this.action);
		secondNumLabel = new JLabel("Second Number: ");
		
		//buttons 
		addButton = new JRadioButton("ADD");
		addButton.addActionListener(action);
		addButton.setActionCommand("add");
		
		subButton = new JRadioButton("SUBTRACT");
		subButton.addActionListener(action);
		subButton.setActionCommand("sub");
		
		multButton = new JRadioButton("MULTIPLY");
		multButton.addActionListener(action);
		multButton.setActionCommand("mul");
		
		divButton = new JRadioButton("DIVISION");
		divButton.addActionListener(action);
		divButton.setActionCommand("div");
		
		
		
		//Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();
	    group.add(addButton);
	    group.add(subButton);
	    group.add(multButton);
	    group.add(divButton);
		
		result = new JTextField(10);
		result.setEditable(false);
		result.setActionCommand("result");
		result.addActionListener(action);
		
		/*
		 * adding every thing to the panel 
		 */
		panel.add(firstNumLabel);
		panel.add(firstNum);
		
		panel.add(secondNumLabel);
		panel.add(secondNum);
		
		
		panel.add(addButton);
		panel.add(subButton);
		panel.add(multButton);
		panel.add(divButton);
		
		panel.add(result);
		//adding the panel to the frame 
		f.add(panel);
		f.setVisible(true);
		
		
	}
	
	/**
	 * returning the buttons so the action command gets compared in the controller 
	 * @return
	 */
	public JRadioButton getADDButton(){
		return this.addButton;
	}
	
	
	public JRadioButton getSUBButton(){
		return this.subButton;
	}
	
	public JRadioButton getMULButton(){
		return this.multButton;
	}
	
	
	public JRadioButton getDIVButton(){
		return this.divButton;
	}
	
	
	/**
	 * the next two methods are to get the text from the window 
	 * @return
	 */
	public int getFirstNumTextArea(){
		return Integer.parseInt(firstNum.getText());
	}
	
	public int getsecondNumTextArea(){
		return Integer.parseInt(secondNum.getText());
	}
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
	public void addView(Observable o){
		o.addObserver(this);
	}


	@Override
	public void update(Observable arg0, Object arg1) {
		//Print the name from the Model

		int resultt = ((int) arg1);
		
		result.setText(""+resultt);

	}

}