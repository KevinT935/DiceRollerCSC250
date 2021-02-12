import java.util.Random;

public class Dice 
{
	public static void main(String[] args)
	{
		int sides = 6;
			{
			int roll = (int) (Math.random() * sides) +1;
			Random r = new Random();
			System.out.println(roll);
			}
	}
}