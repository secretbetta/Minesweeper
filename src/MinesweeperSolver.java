
public class MinesweeperSolver {
	public Game game;
	int[][] grid = new int[game.field.length][game.field[0].length];
	int xlen = this.game.field.length;
	int ylen = this.game.field[0].length;
	
	public MinesweeperSolver() {
		this.game = new Game();
	}
	
	public MinesweeperSolver(int x, int y) {
		
	}
	
	public void firstMove(int x, int y) {
		if(game.getTile(x,y).equals(" * ") == true){
	      game.generateMines(1);
	      game.field[x][y] = " ? ";
	    }
	}
	
	public boolean makeMove(int x, int y) {
		return false;
	}
	
	
	/**
	 * | ? | ? | ? | ? | ? | ? | ? | ? | ? | ? |   
	   | ? | ? | ? | ? | ? | ? | ? | ? | ? | ? |   
	   | ? | ? | ? | ? | ? | ? | ? | ? | ? | ? |   
	   | ? | ? | ? | ? | ? | ? | ? | ? | 1 |   |   
	   | ? | ? | ? | ? | ? | ? | ? | ? | 0 |   |   
	   | ? | ? | ? | ? | ? | ? | ? | ? | 0 |   |   
	   | ? | ? | ? | ? | ? | ? | ? | ? | ? | ? |   
	   | ? | ? | ? | ? | ? | ? | ? | ? | ? | ? |   
	   | ? | ? | ? | ? | ? | ? | ? | ? | ? | ? |   
	   | ? | ? | ? | ? | ? | ? | ? | ? | ? | ? |  
	 * 
	 * 
	 * look for corners
	 * 
	 * 
	 */
	public void getPossibleMoves() {
		for (int x = 0; x < xlen; x++) {
			for (int y = 0; y < ylen; y++) {
//				if (game.field)
			}
		}
	}
	
	public void solvePuzzle() {
		firstMove(xlen/2, ylen/2);
		
	}
}
