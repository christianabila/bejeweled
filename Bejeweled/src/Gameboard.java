
public class Gameboard {

	/*
	 * Size: 8x8
	 */
	
	public Gem[][] gameboard;
	
	public Gameboard()
	{
		this.gameboard = new Gem[8][8];
	}
	
	public boolean setGem(int x, int y, Gem g)
	{
		//if(this.gameboard[x][y] == null)
		//{
			this.gameboard[x][y] = g;
			return true;
		//}
		
		//return false;
	}
	
	public Gem getGem(int x, int y)
	{
		return this.gameboard[x][y];
	}
	
}
