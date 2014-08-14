package middleMaze;

public class MazeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maze m = new Maze();
		Position p = new Position();
		m.printMaze();
		System.out.println(m.mazeData[3][3]);
		
		Stack stack = new Stack();
		
		p.x=1;
		p.y=2;
		stack.push(p);
		p.x=3;
		p.y=4;
		stack.push(p);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}
