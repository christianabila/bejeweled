import java.util.Random;

public class Gem {

	/*
	 * Properties of a gem:
	 * color: blue, green, orange, purple, red, white, yellow
	 * special types:
	 * 		hypercube
	 * 		exploding
	 * 		electric
	 * 		multiplier
	 * 		coin (only yellows)
	 * 		item gems (blazing, moon, cat, red kangaroo)
	 * 	
	 * 
	 */
	
	private int color;
	
	private Random r;
	
	public Gem()
	{
		this.r = new Random();
		this.setColor(r.nextInt(7));
	}
	
	public Gem(int exclude)
	{
		this.r = new Random();
		int n = r.nextInt(7);
		
		while(n == exclude)
			n = r.nextInt(7);
		
		this.setColor(n);
		
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}
