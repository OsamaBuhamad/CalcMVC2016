import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Osama Buhamad
 * Student Number: 100870537
 *
 */
public class Controller implements ActionListener{
	//Instantiate a View object
			View view; 
			//Instantiate a Model Object
			Model model = new Model();
	/**
	 * Controller Constructor  
	 */
	public Controller()
	{
		
		view=new View(this);
		model = new Model();
		//Register View object as an observer to model Object
		model.addObserver(view);
	}
	
	/**
	 * watch for events on the View 
	 * in the View class
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		

		
		/**
		 * FIX
		 */
		
		int firstNumber, secondNumber = 0;
		
		// Surround interactions with the view with
		// a try block in case numbers weren't
		// properly entered
		
		try{
		
			String add = view.getADDButton().getActionCommand();
			String sub = view.getSUBButton().getActionCommand();
			String mul = view.getMULButton().getActionCommand();
			String div = view.getDIVButton().getActionCommand();
			 firstNumber = view.getFirstNumTextArea();
			 secondNumber = view.getsecondNumTextArea();
			
			String theAction = arg0.getActionCommand();
			
			
			if(add.equals(theAction)){
				model.setFirstNum(firstNumber);
				model.setSecondNum(secondNumber);
				model.addition();
				
			}else if (sub.equals(theAction)){
				
				model.subtraction();
			}else if (mul.equals(theAction)){
				
				model.multipication();
			}else if (div.equals(theAction)){
				
				model.division();
			}
			
			
	
		
		}

		catch(NumberFormatException ex){
			
			System.out.println(ex);
			
			view.displayErrorMessage("You Need to Enter 2 Integers");
			
		}
		
	}
	
	
	
	


}
