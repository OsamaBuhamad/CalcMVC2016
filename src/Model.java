import java.util.Observable;

/**
 * 
 * @author Osama Buhamad
 * Student Number: 100870537
 *
 */
public class Model extends Observable{
	private int firstNum, secondNum,result;
	public Model()
	{
	
		
	}
	
	
	
	public int getFirstNum() {
		return firstNum;
	}



	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	
	}



	public int getSecondNum() {
		return secondNum;
	}



	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
		
	}

	public int getResult(){
		return result;
	}

	public void addition(){
		this.result =firstNum+secondNum;
		setCommandAndNotify(result);
		
	}
	

	public void subtraction(){
		result =firstNum-secondNum;
		setCommandAndNotify(result);
		
	}
	

	public void multipication(){
		result =firstNum*secondNum;
		setCommandAndNotify(result);
		
	}
	

	public void division(){
		if(secondNum!=0){
		result =firstNum/secondNum;
		setCommandAndNotify(result);
		}
	}
	/**
	 * This method notifies observers with a change or an update
	 * 
	 * call after the method you need to change 
	 * @param command
	 */
	private void setCommandAndNotify(int command)
	{
		setChanged();
		notifyObservers(command);
	}

}
