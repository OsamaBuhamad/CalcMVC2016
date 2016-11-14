/**
 * 
 * @author Osama Buhamad
 * Student Number: 100870537
 *
 */
public class Run {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model = new Model();
		Controller controller= new Controller(model);
		View view = new View(controller);
		view.addView(model);
		controller.setView(view);
		//model.addObserver(view);
	}

}
