package middleMaze;

public class Maze {
	public static int[][] mazeData={
					{1,1,1,1,1,1,1,1,1,1},
					{1,0,1,1,1,0,1,1,1,1},
					{1,0,0,0,1,0,0,0,0,1},
					{1,1,1,0,0,0,1,0,1,1},
					{1,1,1,0,1,1,1,0,1,1},
					{1,1,0,0,1,0,0,0,0,1},
					{1,0,1,1,1,0,1,1,1,1},
					{1,1,0,1,1,0,0,0,0,1},
					{1,0,1,1,0,1,1,1,0,1},
					{1,1,1,1,1,1,1,1,1,1}};
	
	public void printMaze(){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.print(mazeData[i][j]);
			}
			System.out.println();
		}
	}
}
