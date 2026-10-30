/**
 * 
 */
package nafeh.datastructure;

/**
 * @author Nafeh Mahmoud
 * 
 *
 */
public class ArrayList implements Stack  {

	/**
	 * @param args
	 */
	private char[] stack;
	private int size;
	private int top;
	private static final int INITIAL_SIZE = 20;
	
	public ArrayList()
	{
		size = 0;
		this.stack = new char[INITIAL_SIZE];
		this.top = -1;
		
	}
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void push(char chr) {
		// TODO Auto-generated method stub
		if(!isFull()) {
			stack[++top] = chr;
		}
		else {
			System.out.println("Please insert only 20 characters");
		}
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		if(!isEmpty()) {
			
		}
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}


	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return top == size - 1;
	}


	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new ArrayIndexOutOfBoundsException(); {
			System.out.println("The stack is empty!");	
		}
		return stack[top];
		
	}




	
	

}
