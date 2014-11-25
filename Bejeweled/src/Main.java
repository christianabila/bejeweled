import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gameboard g = new Gameboard();
		Random r = new Random();
		
		//initialize the gameboard
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				g.setGem(i, j, new Gem());
				
				if(j >= 2) // horizontal check
				{
					while((g.getGem(i, j-2).getColor() == g.getGem(i, j-1).getColor()) &&  (g.getGem(i, j-1).getColor() == g.getGem(i, j).getColor()))
					{
						g.setGem(i, j, new Gem(g.getGem(i, j).getColor()));
					}
				}
				
				if(j >= 3) //allow a combination?
				{
					if((g.getGem(i, j-3).getColor() == g.getGem(i, j-2).getColor()) && r.nextBoolean())
					{
						g.getGem(i, j).setColor(g.getGem(i, j-3).getColor());
					}
				}
			}
		}
		
		//print out the initial gameboard
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				System.out.print(g.getGem(i, j).getColor() + "  ");
			}
			
			System.out.println();
		}
	}
}
