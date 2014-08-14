package middleMaze;

public class Stack {
	Object[] stack = new Object[200];
	int top = 0;
	
	public void push(Object a){
		stack[top]=a;
		top++;
	}
	
	public Object pop(){
		
		return stack[--top];
	}
}
