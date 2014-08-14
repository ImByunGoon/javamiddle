package middleMaze;

public class Person4Way implements IPerson{

	Maze m = new Maze();
	public void checkWall(int x,int y, int[][] mazeData){
		if(mazeData[x][y]==0){
			footPrint.push(p);
		}else if(mazeData[x][y]==1){
			footPrint.pop();
		}else{
			
		}
	}
	@Override
	public void move() {
		for(int i=0;i<4;i++){
			switch(i){
			case 0:
				p.x++;
				checkWall(p.x,p.y,m.mazeData);
				
			break;

			case 1:
				p.y++;
			break;
			
			case 2:
				p.x--;
			break;
			
			case 3:
				p.y--;
			break;
			
			}
		}
	}

}
